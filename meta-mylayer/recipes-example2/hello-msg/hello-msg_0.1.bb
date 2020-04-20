# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# Unable to find any files that looked like license statements. Check the accompanying
# documentation and source headers and set LICENSE and LIC_FILES_CHKSUM accordingly.
#
# NOTE: LICENSE is being set to "CLOSED" to allow you to at least start building - if
# this is not accurate with respect to the licensing of the software being built (it
# will not be in most cases) you must specify the correct value before using this
# recipe for anything other than initial testing/development!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta-mylayer/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI = "file://hello_msg"
		
S = "${WORKDIR}"

# NOTE: no Makefile found, unable to determine what needs to be done

do_compile () {
	# Specify compilation commands here
	${CC} hello_msg.c ${LDFLAGS} -o hello_msg	
#	gcc -o hello_msg hello_msg.c
:
}

do_install () {
	# Specify install commands here
	install -d ${D}${bindir}
	install -m 0755 hello_msg ${D}${bindir}
}
