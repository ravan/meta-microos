SUMMARY = "Developer Documentation for Totem Movie Player"
DESCRIPTION = "Totem is a movie player for the GNOME desktop based on GStreamer. \
 \
This package contains developer documentation."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "43.2+git402.b8d8108e0"

RPM_NAME = "totem-devel-43.2+git402.b8d8108e0-2.3.aarch64.rpm"
RPM_HASH = "2973d296050714aca6b9b59aec98ffeea436b86b6970b8ff1939f55ed383a46770ef7717728e6c26581178f2eca0391a01515725d94a43362a268b5d26f9b6ec"

RPROVIDES:${PN} += "pkgconfig-totem \
totem-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-gio-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-totem-plparser \
totem"

inherit rpm
