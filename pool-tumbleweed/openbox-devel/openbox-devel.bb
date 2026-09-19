SUMMARY = "Includes and static libraries for openbox"
DESCRIPTION = "Development Includes and static libraries for openbox."
LICENSE = "GPL-2.0+"

PV = "3.6.1"

RPM_NAME = "openbox-devel-3.6.1-5.12.aarch64.rpm"
RPM_HASH = "f863d7d01ab2471b972c60f91dce3ce5688af1d4e22fdf7734cda73557d435cc4a3c00fa2115790ce7673485cf05c6461b2c092b24220a87fd371100d88e065f"

RPROVIDES:${PN} += "openbox-devel \
pkgconfig-obrender-3.5 \
pkgconfig-obt-3.5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libobrender32 \
libobt2 \
pkgconfig-glib-2.0 \
pkgconfig-ice \
pkgconfig-imlib2 \
pkgconfig-librsvg-2.0 \
pkgconfig-libxml-2.0 \
pkgconfig-obt-3.5 \
pkgconfig-pangoxft \
pkgconfig-sm \
pkgconfig-x11 \
pkgconfig-xft"

inherit rpm
