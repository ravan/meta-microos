SUMMARY = "RAW images thumbnailer for GNOME"
DESCRIPTION = "A lightweight and fast thumbnailer used by Nautilus for digital camera RAW files."
LICENSE = "GPL-2.0-or-later"

PV = "48.0.0+git5.e8f0079"

RPM_NAME = "raw-thumbnailer-48.0.0+git5.e8f0079-1.9.aarch64.rpm"
RPM_HASH = "e82388292be6786fbb0da85dc35e36e4689d0988eacb908310bcad59d20142b4a04dcd89c3ae8e9523b6f5de2d054832abd1d05da04c7e2a6c2e5184f8cab671"

RPROVIDES:${PN} += "raw-thumbnailer"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
shared-mime-info"

inherit rpm
