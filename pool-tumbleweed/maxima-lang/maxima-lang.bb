SUMMARY = "Translations for package maxima"
DESCRIPTION = "Provides translations for the maxima package."
LICENSE = "GPL-2.0-or-later"

PV = "5.50.0"

RPM_NAME = "maxima-lang-5.50.0-2.2.noarch.rpm"
RPM_HASH = "15d0a36454e5970207a9348ac769ccc1cfbece906d5b4857374562773db9b6dd382d8fae5339bf865b88fe884dad45c4d72b3b1a482373697623193b67220284"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-maxima-es \
locale-maxima-pt \
maxima-lang \
maxima-lang-de-utf8 \
maxima-lang-es-utf8 \
maxima-lang-pt-BR-utf8 \
maxima-lang-pt-utf8"

RDEPENDS:${PN} += "maxima"

inherit rpm
