SUMMARY = "The Colm programming language runtime"
DESCRIPTION = "Colm is a programming language designed for the analysis and \
transformation of computer languages."
LICENSE = "MIT"

PV = "0.14.7"

RPM_NAME = "libfsm-0_14_7-0.14.7-2.16.aarch64.rpm"
RPM_HASH = "471f9576feee658975ecb5243dff16c105cc7bf4c87783cf793fc2e695e8f5ae46484b603dd3ca4e2b55f8ff39e75ee88c1d9205f7411f27eff9f3449fae2458"

RPROVIDES:${PN} += "libfsm-0-14-7 \
libfsm-0.14.7.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
