SUMMARY = "Synergy client for wayland compositors"
DESCRIPTION = "An implementation of a synergy client for wayland compositors. Based \
on the upstream uSynergy library (heavily modified for more protocol \
support and a bit of paranoia). \
 \
NOTE: See README.md for using uinput."
LICENSE = "MIT"

PV = "0.17+0"

RPM_NAME = "waynergy-0.17+0-1.13.aarch64.rpm"
RPM_HASH = "ea8253e62c34aca6943210c5a353a181c6d69a05df25c6eb20f41ac0a96636f3ac78ea65bf9f88925f4aed1e688e7db44b1ce15370ae37ada1f60ae85bb37e66"

RPROVIDES:${PN} += "waynergy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtls.so.33 \
libwayland-client.so.0 \
libxkbcommon.so.0"

inherit rpm
