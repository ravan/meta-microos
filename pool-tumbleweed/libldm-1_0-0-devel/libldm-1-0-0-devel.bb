SUMMARY = "Development files for ldmtool"
DESCRIPTION = "Contains libraries and header files for developing applications using \
libldm."
LICENSE = "LGPL-3.0-only"

PV = "0.2.5"

RPM_NAME = "libldm-1_0-0-devel-0.2.5-1.7.aarch64.rpm"
RPM_HASH = "c7e6fa5d7c285351b72e6ab7f46f7c1bf4940ea04244211336d95f7444c5e8513368f3f42565c0f892e6bbc94750824407d75d8cae555d926f8146673a465aa7"

RPROVIDES:${PN} += "libldm-1-0-0-devel \
pkgconfig-ldm-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libldm-1-0-0 \
pkgconfig-devmapper \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-json-glib-1.0"

inherit rpm
