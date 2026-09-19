SUMMARY = "Development files for the GObject Data Mapper"
DESCRIPTION = "Development files for the GObject Data Mapper."
LICENSE = "LGPL-2.1-or-later"

PV = "0.5.6"

RPM_NAME = "gom-devel-0.5.6-1.3.aarch64.rpm"
RPM_HASH = "9c6c6892dcfd5b44c8cbc426ac4de389efa62f070453c4cd7f614b76cf3682cb1c1010dc1848e3c0503b6f9466c02505b6cca58229c3aafb7aade103ab512d43"

RPROVIDES:${PN} += "gom-devel \
pkgconfig-gom-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgom-1-0-0 \
pkgconfig-gobject-2.0 \
python3-gom \
typelib-1-0-Gom-1-0"

inherit rpm
