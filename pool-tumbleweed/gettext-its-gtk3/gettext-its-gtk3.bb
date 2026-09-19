SUMMARY = "International Tag Set for GTK+ 3"
DESCRIPTION = "This package enhances gettext with an International Tag Set for GTK+ 3"
LICENSE = "LGPL-2.1-or-later"

PV = "3.24.52+git59.b30343717d"

RPM_NAME = "gettext-its-gtk3-3.24.52+git59.b30343717d-1.1.noarch.rpm"
RPM_HASH = "a55ef065b594af92ecc8b8bcf2d3ed1aa5d405c1c00c870e2542e50626c7a0b30b7e43baf4829914c1a00a99a0c5318cb89849445e68d7c3504879d34b9d34ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gettext-its-gtk3"

RDEPENDS:${PN} += ""

inherit rpm
