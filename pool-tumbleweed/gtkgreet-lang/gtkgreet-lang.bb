SUMMARY = "Translations for package gtkgreet"
DESCRIPTION = "Provides translations for the 'gtkgreet' package."
LICENSE = "GPL-3.0-only"

PV = "0.8"

RPM_NAME = "gtkgreet-lang-0.8-1.11.noarch.rpm"
RPM_HASH = "919c2ae16829e340a4b683adf210cb32804fd02cdaa61bf303c78e33d6b7abb6a9ebf10dad8d91a68008a03dadf382a7ed96d225dd1c24d78bda719ad61cc623"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtkgreet-lang \
gtkgreet-lang-all \
locale-gtkgreet-es \
locale-gtkgreet-fr \
locale-gtkgreet-ru"

RDEPENDS:${PN} += "gtkgreet"

inherit rpm
