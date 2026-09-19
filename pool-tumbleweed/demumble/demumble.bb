SUMMARY = "A better c++filt and a better undname.exe, in one binary"
DESCRIPTION = "demumble demangles both Itanium and Visual Studio symbols. It runs on both POSIX and Windows."
LICENSE = "Apache-2.0"

PV = "1.3.0"

RPM_NAME = "demumble-1.3.0-1.5.aarch64.rpm"
RPM_HASH = "585dd2beabeacdeb3d938a3f72e883008d8ff888d8ebbe4e9c26eaa26eaedd49c3f246d1c37b8f567f1ac416493478f1a275d93ff5e610ca2b5c8edd2c2389e7"

RPROVIDES:${PN} += "demumble"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
