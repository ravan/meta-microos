SUMMARY = "Libraries file(s) for clingo"
DESCRIPTION = "Clingo is part of the Potassco project for Answer Set Programming \
(ASP). This package include clingo libraries."
LICENSE = "MIT"

PV = "5.8.0"

RPM_NAME = "libclingo4-5.8.0-2.4.aarch64.rpm"
RPM_HASH = "0c956774b6147b17a314f5718853a7bfa60d9d32750a8005cb75876a383c0b6316c76556289c22826f74eb68a9e321887cbf9265caa3519b8670b1b86beed9ec"

RPROVIDES:${PN} += "libclingo.so.4 \
libclingo4"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
