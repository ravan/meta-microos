SUMMARY = "Source Code Measure Counter for C/C++/Java"
DESCRIPTION = "c_count counts lines, statements, and other simple measures of C/C++/Java \
source programs. It is not lex/yacc based, and is easily portable to a \
variety of systems."
LICENSE = "MIT"

PV = "7.25"

RPM_NAME = "c_count-7.25-1.4.aarch64.rpm"
RPM_HASH = "61816da71172457c8d82ffd4ade098e9380af270960411d187b93a16b717eb401ec1e4dbe2185bac58c2bfbfcffcf686ef357b5531b2eaef707ac2028a9f11c6"

RPROVIDES:${PN} += "c-count"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
