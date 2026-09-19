SUMMARY = "Overlay volume (or anything) bar for the X Window System"
DESCRIPTION = "Overlay volume (or anything) bar for the X Window System"
LICENSE = "GPL-3.0-only"

PV = "0.3"

RPM_NAME = "xob-0.3-1.19.aarch64.rpm"
RPM_HASH = "926a0334c704fe02bfa37dc824892a0a8a24e0e19e7b23b0752b3d54de7ee062f4b725c1dcb3542a30f51d94c210ca8a413e8278a329c426be03f8873bbe73b0"

RPROVIDES:${PN} += "xob"

RDEPENDS:${PN} += "libX11.so.6 \
libXrender.so.1 \
libc.so.6 \
libconfig.so.15"

inherit rpm
