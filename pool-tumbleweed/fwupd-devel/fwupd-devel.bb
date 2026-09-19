SUMMARY = "Allow session software to update device firmware"
DESCRIPTION = "fwupd is a daemon to allows session software to update device firmware on \
the local machine."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.1.7"

RPM_NAME = "fwupd-devel-2.1.7-2.1.aarch64.rpm"
RPM_HASH = "ee242cb1be998ffe66f9b0cb31727e031f16e28f918450e4785fb30de2c3e4ac17d7eaca6538eba67456225fdfe0ac14012faa7a97b5455b660ea624e9e620e5"

RPROVIDES:${PN} += "fwupd-devel \
pkgconfig-fwupd"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
fwupd \
libfwupd3 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-libcurl \
typelib-1-0-Fwupd-2-0"

inherit rpm
