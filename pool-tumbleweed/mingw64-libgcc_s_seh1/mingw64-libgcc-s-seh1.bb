SUMMARY = "MinGW Windows compiler for C shared libraries"
DESCRIPTION = "MinGW Windows compiler for C shared libraries \
 \
This libgcc build supports Structured Exception Handling (SEH), which \
is the native exception handling mechanism for Windows. \
[SEH support is currently only implemented for the x86_64 target, \
which is why the 32bit mingw package set does not contain it.]"
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0"

RPM_NAME = "mingw64-libgcc_s_seh1-16.2.0-1.1.noarch.rpm"
RPM_HASH = "9c42d9240daa59204faa3a81282a46740fe49873f06723597a01e7facd8c5c7255f500a2f12bf6d2abc41764127d5dbbdc6e3cdeaf39b82452d63cd9f06adb69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-libgcc \
mingw64-libgcc-s-seh-1.dll \
mingw64-libgcc-s-seh1"

RDEPENDS:${PN} += "mingw64-libwinpthread-1.dll"

inherit rpm
