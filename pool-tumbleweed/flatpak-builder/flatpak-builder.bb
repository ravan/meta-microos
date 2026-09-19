SUMMARY = "Tool to build flatpaks from source"
DESCRIPTION = "Tool to build flatpaks from source. \
See https://docs.flatpak.org/ for more information."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.10"

RPM_NAME = "flatpak-builder-1.4.10-1.1.aarch64.rpm"
RPM_HASH = "9b2c80376c517c0f6460d9cefc1cb566e65726ce19e0ecf60c0dcb3bf908ba74b206ea89265234b9f2075187580003a25d48451bcdbe3ac0fbc85706b6f7e25f"

RPROVIDES:${PN} += "flatpak-builder"

RDEPENDS:${PN} += "/usr/bin/appstreamcli \
/usr/bin/bzip2 \
/usr/bin/eu-strip \
/usr/bin/git \
/usr/bin/patch \
/usr/bin/strip \
/usr/bin/tar \
/usr/bin/unzip \
AppStream-compose \
debugedit \
flatpak \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libelf.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0 \
libostree-1.so.1 \
libxml2.so.16 \
libyaml-0.so.2"

inherit rpm
