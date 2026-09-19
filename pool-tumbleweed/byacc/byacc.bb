SUMMARY = "LALR(1) parser generator"
DESCRIPTION = "Berkeley Yacc is a LALR(1) parser generator. It has been made as compatible as \
possible with AT&T Yacc and it accepts any input specification that conforms to \
the AT&T Yacc documentation. In contrast to bison, it is written to avoid \
dependencies upon a particular compiler."
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "20260126"

RPM_NAME = "byacc-20260126-1.3.aarch64.rpm"
RPM_HASH = "d11747ff8ff01e10263bdbec3eda315b7b7598302bd9e49cb6645930c713f37fadc3924dd79b7410dfea97aaf799691d98ccfde3e7deb666cb61d4da35f6fdba"

RPROVIDES:${PN} += "byacc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
