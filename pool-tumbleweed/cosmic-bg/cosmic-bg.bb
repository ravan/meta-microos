SUMMARY = "COSMIC service for backgrounds"
DESCRIPTION = "COSMIC session service which applies backgrounds to displays. \
Supports the following features: \
 \
    Supports common image formats supported by image-rs \
    8 and 10-bit background surface layers \
    Use of colors and gradients for backgrounds \
    Per-display background application \
    Wallpaper slideshows that alternate between backgrounds periodically"
LICENSE = "MPL-2.0"

PV = "1.6.0"

RPM_NAME = "cosmic-bg-1.6.0-1.2.aarch64.rpm"
RPM_HASH = "05aab6316548d4a7058abe2621bc66210ffa7341b9add038a5125a4b1ad26b09ef6949a4c2d259f06d96b8fb3880285522ccdb505b3f77f31ccdc7bdce0ebdc6"

RPROVIDES:${PN} += "cosmic-bg"

RDEPENDS:${PN} += "libc.so.6 \
libdav1d.so.7 \
libgcc-s.so.1 \
libm.so.6 \
libxkbcommon.so.0"

inherit rpm
