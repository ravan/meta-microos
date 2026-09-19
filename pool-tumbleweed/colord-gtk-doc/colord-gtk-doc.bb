SUMMARY = "Development Documentation for colord-gtk"
DESCRIPTION = "This package contains development documentation for the colord-gtk packages."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.1"

RPM_NAME = "colord-gtk-doc-0.3.1-1.6.noarch.rpm"
RPM_HASH = "6b3e0bf74dc463233463be1c139f29c7b0d46b5dd01064c1e8b4593015da605b9e1095ea16df17abeae5c000b2e68e79d8c7baafc7bb5b8c4be555068ec4a27a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "colord-gtk-doc"

RDEPENDS:${PN} += ""

inherit rpm
