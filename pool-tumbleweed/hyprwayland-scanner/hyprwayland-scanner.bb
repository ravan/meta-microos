SUMMARY = "Hyprland implementation of wayland-scanner"
DESCRIPTION = "A Hyprland implementation of wayland-scanner, in and for C++."
LICENSE = "BSD-3-Clause"

PV = "0.4.6"

RPM_NAME = "hyprwayland-scanner-0.4.6-1.2.aarch64.rpm"
RPM_HASH = "adcda5a9e2200530840ba0796faf735022227d08ac2944d4d27ffa943f28a0c6f2ee08a3e4f20b260a64878f8178500cf00fbc170bffe4d6a8b4feea920a859c"

RPROVIDES:${PN} += "cmake-hyprwayland-scanner \
hyprwayland-scanner \
pkgconfig-hyprwayland-scanner"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpugixml.so.1 \
libstdc++.so.6"

inherit rpm
