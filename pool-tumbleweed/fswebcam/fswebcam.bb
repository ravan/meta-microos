SUMMARY = "Tiny and flexible webcam program"
DESCRIPTION = "Tiny and flexible webcam program for capturing images from a V4L1/V4L2 \
device, and overlaying a caption or image."
LICENSE = "GPL-2.0-only"

PV = "20200725"

RPM_NAME = "fswebcam-20200725-1.22.aarch64.rpm"
RPM_HASH = "1707dcd9d122d932b7220b1ac1d9399036f8c925a2b091e0c921a02245e576c1dedde388dfbcd7947aaa950b1a845a2cc1e3a474476b9cbb98852b66ff0677ea"

RPROVIDES:${PN} += "fswebcam"

RDEPENDS:${PN} += "gd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgd.so.3"

inherit rpm
