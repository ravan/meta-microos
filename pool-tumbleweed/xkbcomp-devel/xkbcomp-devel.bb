SUMMARY = "Utility to compile XKB keyboard description -- Development Files"
DESCRIPTION = "The xkbcomp keymap compiler converts a description of an XKB keymap \
into one of several output formats."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "xkbcomp-devel-1.5.0-1.4.aarch64.rpm"
RPM_HASH = "7f8decaaa817962282937004717a5172605bad6e06974c70548bda96efdf437442043914403201c0c71c3c2f065166dbf291e3d5cd8f661587e4a36be5362abe"

RPROVIDES:${PN} += "pkgconfig-xkbcomp \
xkbcomp-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-x11 \
pkgconfig-xkbfile \
xkbcomp"

inherit rpm
