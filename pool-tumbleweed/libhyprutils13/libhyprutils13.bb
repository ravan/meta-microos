SUMMARY = "Library for the hyprland cursor format"
DESCRIPTION = "Hyprutils is a small C++ library for utilities used across the Hypr* \
ecosystem."
LICENSE = "BSD-3-Clause"

PV = "0.14.2"

RPM_NAME = "libhyprutils13-0.14.2-1.1.aarch64.rpm"
RPM_HASH = "e9628ddfa7917ec983af1e23ef61630901a43b61292f38537f2a7945305a5016097f77c3cdabccb6dbb3b24384f8843ae937b05765cbe6a5454aab87972fd0e6"

RPROVIDES:${PN} += "libhyprutils.so.13 \
libhyprutils13"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpixman-1.so.0 \
libstdc++.so.6"

inherit rpm
