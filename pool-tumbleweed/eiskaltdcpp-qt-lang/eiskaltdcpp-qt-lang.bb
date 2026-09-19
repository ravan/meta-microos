SUMMARY = "Translations for package eiskaltdcpp-qt"
DESCRIPTION = "Provides translations for the 'eiskaltdcpp-qt' package."
LICENSE = "GPL-3.0-or-later"

PV = "2.4.2"

RPM_NAME = "eiskaltdcpp-qt-lang-2.4.2-6.2.noarch.rpm"
RPM_HASH = "dae2870b90cb721bdae2474f0672041c85d450a1f1ad86cb4d305efbb059633cb337f498cbe55bb497442fabdf67f9c43166ce17999c7132f7dabaec1be38db5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eiskaltdcpp-qt-lang \
eiskaltdcpp-qt-lang-all"

RDEPENDS:${PN} += "eiskaltdcpp-qt"

inherit rpm
