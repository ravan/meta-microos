SUMMARY = "MoarVM development headers and libraries"
DESCRIPTION = "MoarVM (Metamodel On A Runtime) development headers."
LICENSE = "Artistic-2.0"

PV = "2025.05"

RPM_NAME = "moarvm-devel-2025.05-1.6.noarch.rpm"
RPM_HASH = "788338f3191449d1229bb6a1c1b8137ca274fd789d233a9dbc4e40864cdffe876925a20df0ea0dd1ca3b32675f4ad19310fc2b75d8082c13ee564a92fadd74be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "moarvm-devel \
pkgconfig-moar"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
moarvm \
pkgconfig-libffi \
pkgconfig-libtommath \
pkgconfig-libuv \
pkgconfig-libzstd"

inherit rpm
