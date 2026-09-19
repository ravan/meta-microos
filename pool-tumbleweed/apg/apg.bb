SUMMARY = "Tool Set for Random Password Generation"
DESCRIPTION = "APG (Automated Password Generator) is a tool set for generating random \
passwords. A standalone tool generates some random words of the required type \
and prints them to standard output. A networked client/server following RFC972 \
is also provided."
LICENSE = "BSD-3-Clause"

PV = "2.2.3"

RPM_NAME = "apg-2.2.3-2.9.aarch64.rpm"
RPM_HASH = "a31b8c1a5b41ed2e45c49935216136d6971dab53d69708a9efc2fb85e02d72715d3d93227ecaf412f606f99056323a1fcc2f3c088e59e0fa834a4c9580702bbd"

RPROVIDES:${PN} += "apg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libm.so.6"

inherit rpm
