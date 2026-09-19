SUMMARY = "Translations for package lxqt-config"
DESCRIPTION = "Provides translations for the 'lxqt-config' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.4.0"

RPM_NAME = "lxqt-config-lang-2.4.0-1.2.noarch.rpm"
RPM_HASH = "d3407f983ce56510fdd2345a8f8dccff08390030cd6dd01f861e77af5971f10b65e40c6524fb5871d11bd9ecd8383b5cb91d807eeabf3120f7a4b15bd644e53f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxqt-config-lang \
lxqt-config-lang-all"

RDEPENDS:${PN} += "lxqt-config"

inherit rpm
