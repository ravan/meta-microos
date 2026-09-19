SUMMARY = "MinGW Windows C Preprocessor"
DESCRIPTION = "MinGW Windows C Preprocessor"
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0"

RPM_NAME = "mingw64-cpp-16.2.0-1.1.noarch.rpm"
RPM_HASH = "51a400c0f8f196cbebd765703f27de013d85a54dc572ca4ce35529e1e60a55851e3d6fff8fa24bd196dfde48dafd9e21729efcba1bffb6af84d291f461cfe379"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-cpp"

RDEPENDS:${PN} += "mingw64-libgmp-10.dll \
mingw64-libmpc-3.dll \
mingw64-libmpfr-4.dll \
mingw64-libwinpthread-1.dll \
mingw64-libz.dll"

inherit rpm
