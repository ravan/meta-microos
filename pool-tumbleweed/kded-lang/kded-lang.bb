SUMMARY = "Translations for package kded"
DESCRIPTION = "Provides translations for the 'kded' package."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "kded-lang-5.116.0-1.8.noarch.rpm"
RPM_HASH = "cfa7d7009c24b76f796eef9e9aa74f34386d2b18f913e5c4bfff16b443c71c0a293402000fbba64fea153450a185197f9c9cd603127a71ab774eda525d0ca62c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kded-lang \
kded-lang-all"

RDEPENDS:${PN} += "kded"

inherit rpm
