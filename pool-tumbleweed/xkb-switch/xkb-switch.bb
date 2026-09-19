SUMMARY = "Switch X keyboard layouts from the command line"
DESCRIPTION = "xkb-switch is a C++ program that allows to query and change the XKB layout state."
LICENSE = "GPL-3.0-only"

PV = "1.8.5"

RPM_NAME = "xkb-switch-1.8.5-2.5.aarch64.rpm"
RPM_HASH = "f50c05d3f4283452aa87dd28cdadf4a794a22476b789886d6a5ae5423f09287306db6f0d0bee2b3c521f11f01d766d4a3d594d4c51802ce0851bb4fb98c03cd4"

RPROVIDES:${PN} += "libxkbswitch.so.1 \
xkb-switch"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxkbfile.so.1"

inherit rpm
