SUMMARY = "MinGW Windows compiler for C shared libraries"
DESCRIPTION = "MinGW Windows compiler for C shared libraries"
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0"

RPM_NAME = "mingw32-libgomp1-16.2.0-1.1.noarch.rpm"
RPM_HASH = "5a107bc87492fb8284a503d5e3deb265eb5540eba23da8d90e9b2f8c76f5d7dbf1a783675e1f6b8c81be9ba575719776e178e793bf6b97a76a5fc9b5efb97d75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-libgomp \
mingw32-libgomp-1.dll \
mingw32-libgomp1"

RDEPENDS:${PN} += "mingw32-libgcc-s-sjlj-1.dll \
mingw32-libwinpthread-1.dll"

inherit rpm
