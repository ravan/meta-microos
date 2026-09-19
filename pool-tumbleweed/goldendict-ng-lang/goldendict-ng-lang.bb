SUMMARY = "Translations for package goldendict-ng"
DESCRIPTION = "Provides translations for the 'goldendict-ng' package."
LICENSE = "GPL-3.0-only & GPL-3.0-or-later"

PV = "26.5.0"

RPM_NAME = "goldendict-ng-lang-26.5.0-3.1.noarch.rpm"
RPM_HASH = "9f08bfef60edaebc8c20d8860a07bcd89c8039e01de1863e59a0574f1518e9ec7c964842859a847dc52ab4f85c26eb9550db72ea3e14dd1604727783852af43b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "goldendict-lang-lang \
goldendict-ng-lang \
goldendict-ng-lang-all"

RDEPENDS:${PN} += "goldendict-ng"

inherit rpm
