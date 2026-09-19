SUMMARY = "Development files for the GNOME Developer Help program"
DESCRIPTION = "Devhelp is an API documentation browser for GTK+ and GNOME. \
 \
This package contains the development files for Devhelp."
LICENSE = "GPL-3.0-or-later"

PV = "43.0"

RPM_NAME = "devhelp-devel-43.0-3.7.aarch64.rpm"
RPM_HASH = "a25d4ae2ef22c22b96417dea5e73a5c267b59d8762b6163ee336c7c82c3203ac831519e4ea75b4043c3552b19150f09ca8d4190195972e2d23a3216be8a355ff"

RPROVIDES:${PN} += "devhelp-devel \
pkgconfig-libdevhelp-3.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
devhelp \
pkgconfig-gio-2.0 \
pkgconfig-gsettings-desktop-schemas \
pkgconfig-gtk+-3.0 \
pkgconfig-webkit2gtk-4.1 \
typelib-1-0-Devhelp-3-0"

inherit rpm
