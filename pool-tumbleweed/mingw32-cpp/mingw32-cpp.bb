SUMMARY = "MinGW Windows C Preprocessor"
DESCRIPTION = "MinGW Windows C Preprocessor"
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0"

RPM_NAME = "mingw32-cpp-16.2.0-1.1.noarch.rpm"
RPM_HASH = "7b3d7416073d85992627cf86852b4bcac50e4f6d34f4a1a73fba547ecfe9c7ff9f8991b1f7cb531933fbcaddb843353d10a0a5235d3d180ecbedc7c54e5037dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-cpp"

RDEPENDS:${PN} += "mingw32-libgmp-10.dll \
mingw32-libmpc-3.dll \
mingw32-libmpfr-4.dll \
mingw32-libwinpthread-1.dll \
mingw32-libz.dll"

inherit rpm
