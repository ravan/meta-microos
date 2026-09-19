SUMMARY = "MinGW Windows compiler for C shared libraries"
DESCRIPTION = "MinGW Windows compiler for C shared libraries"
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0"

RPM_NAME = "mingw32-libssp0-16.2.0-1.1.noarch.rpm"
RPM_HASH = "185c39609083469c2070eefeb54f444071a305a0c7fcbd945a01dd403fe7155cfca5a96c486c64cea3c69b9f109568d882725841301716cb71436aa6fe2f54a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-libssp \
mingw32-libssp-0.dll \
mingw32-libssp0"

RDEPENDS:${PN} += ""

inherit rpm
