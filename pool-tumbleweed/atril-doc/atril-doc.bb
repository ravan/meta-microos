SUMMARY = "Documentation how to Use Atril"
DESCRIPTION = "This package contains the documentation for atril"
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "1.28.4"

RPM_NAME = "atril-doc-1.28.4-1.2.noarch.rpm"
RPM_HASH = "ca742c5719b9c346295ee02fd4d763bfe380475a7a273b36a757683fe19925b8d229859f25246e0ee2ec8a17b7fef92920dd7088113144e165423b30135af432"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "atril-doc"

RDEPENDS:${PN} += "atril"

inherit rpm
