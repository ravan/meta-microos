SUMMARY = "Shared library for xdg-utils-cxx"
DESCRIPTION = "Implementation of the FreeDesktop specifications to be used in c++ projects. \
Shared library for xdg-utils-cxx."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "libXdgUtilsBaseDir1_0_1-1.0.1-2.5.aarch64.rpm"
RPM_HASH = "93a5fd7d0f43303b162d4c9058594811013ef193e77fe7cc313627a320c54f5ac8141721f3cdfa954eea9476bf37360a80adec9dd3c0c6c6318290d561012724"

RPROVIDES:${PN} += "libXdgUtilsBaseDir.so.1.0.1 \
libXdgUtilsBaseDir1-0-1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
