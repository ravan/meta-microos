SUMMARY = "Translations for package lxqt-panel"
DESCRIPTION = "Provides translations for the 'lxqt-panel' package."
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.1"

RPM_NAME = "lxqt-panel-lang-2.4.1-1.4.noarch.rpm"
RPM_HASH = "9f110f3ac46d97a603ce84eeb36db27d09a4cfbb9bf66dcb1d77295b6ae96a668e0e2658f71cf81e01d7db0c48a75142cfe43f63c1675a8a998a0841417690e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxqt-panel-lang \
lxqt-panel-lang-all"

RDEPENDS:${PN} += "lxqt-panel"

inherit rpm
