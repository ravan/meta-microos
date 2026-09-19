SUMMARY = "Utility to adjust the screen backlight brightness"
DESCRIPTION = "Xbacklight is used to adjust the backlight brightness where supported. \
It uses the RandR extension to find all outputs on the X server \
supporting backlight brightness control and changes them all in the \
same way."
LICENSE = "MIT"

PV = "1.2.4"

RPM_NAME = "xbacklight-1.2.4-1.8.aarch64.rpm"
RPM_HASH = "3174fb08aac3d04c319a2395355ddd6456e070df46368f9ac02d683477e6aeae879996489259edc374ef18eb3f364ccf44effbae136a3f8021808619893c28c5"

RPROVIDES:${PN} += "xbacklight"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb-randr.so.0 \
libxcb-util.so.1 \
libxcb.so.1"

inherit rpm
