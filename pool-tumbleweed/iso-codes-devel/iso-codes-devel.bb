SUMMARY = "ISO code lists and translations"
DESCRIPTION = "This package provides the ISO-639 Language code list, the ISO-3166 \
Territory code list, and ISO-3166-2 sub-territory lists, and all their \
translations in gettext .po form."
LICENSE = "LGPL-2.1-or-later"

PV = "4.20.1"

RPM_NAME = "iso-codes-devel-4.20.1-2.2.noarch.rpm"
RPM_HASH = "72320a25dfc070b94b9b8d52e4de07b29c56fc03476283a9d190cc279034eb433ca643e4e957766a7f6466236f1e30a6df5574bee8512291d3011cfdc9a37f82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iso-codes-devel \
pkgconfig-iso-codes"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
iso-codes"

inherit rpm
