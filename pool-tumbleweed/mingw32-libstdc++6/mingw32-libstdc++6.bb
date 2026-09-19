SUMMARY = "MinGW Windows compiler for C++ shared libraries"
DESCRIPTION = "MinGW Windows compiler for C++ shared libraries"
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0"

RPM_NAME = "mingw32-libstdc++6-16.2.0-1.1.noarch.rpm"
RPM_HASH = "42d205432b1e3e042ac45f60a8f47ebe1e4f45afb9e74f19dec99a654be35e07b4b87426533307f0003532e52c07e7b89437def0f0eba668d26ac12e5ab5888f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-libstdc++ \
mingw32-libstdc++-6.dll \
mingw32-libstdc++6"

RDEPENDS:${PN} += "mingw32-libgcc-s-sjlj-1.dll \
mingw32-libwinpthread-1.dll"

inherit rpm
