SUMMARY = "Data files for Widelands"
DESCRIPTION = "Data files for Widelands. Includes localization, maps graphics and music."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.1"

RPM_NAME = "widelands-data-1.3.1-1.5.noarch.rpm"
RPM_HASH = "dbc2b7ba851c93a1c81f7a30c881c257e78357ba6d1aef0bf4856730b5a98556baa06df2b443c5ab928670f3316abc1a0b7f025635b530aa6e06f3af7a488c76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "widelands-data"

RDEPENDS:${PN} += "widelands"

inherit rpm
