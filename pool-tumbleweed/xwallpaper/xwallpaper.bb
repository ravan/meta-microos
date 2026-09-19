SUMMARY = "Wallpaper setting utility for X"
DESCRIPTION = "The xwallpaper utility allows you to set image files as your X wallpaper. JPEG, PNG, and XPM file formats are supported, all of them being configurable and therefore no fixed dependencies."
LICENSE = "ISC"

PV = "0.7.6"

RPM_NAME = "xwallpaper-0.7.6-1.7.aarch64.rpm"
RPM_HASH = "b9027b950a31717819146b2f421372864f78e5e0073646fd5dd5313ab50aac40e5f010b7cfb8de93d620cf6ebf34b3845f35f2345604b4892d1f94e3f93c3c59"

RPROVIDES:${PN} += "xwallpaper"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libXpm.so.4 \
libc.so.6 \
libjpeg.so.8 \
libpixman-1.so.0 \
libpng16.so.16 \
libxcb-image.so.0 \
libxcb-randr.so.0 \
libxcb-util.so.1 \
libxcb.so.1"

inherit rpm
