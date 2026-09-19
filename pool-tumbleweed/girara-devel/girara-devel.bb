SUMMARY = "Header files for the girara library"
DESCRIPTION = "Header files for the girara user interface library."
LICENSE = "Zlib"

PV = "2026.07.18"

RPM_NAME = "girara-devel-2026.07.18-1.2.aarch64.rpm"
RPM_HASH = "3546941d3aabeaad7a54a146885b359539e1761119f2a15ee7da462baa9328aa3edc8a404285f78d97ffaedd6b0d10d690540bea1a407e50306a3f058474f31f"

RPROVIDES:${PN} += "girara-devel \
pkgconfig-girara"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgirara5 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0"

inherit rpm
