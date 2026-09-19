SUMMARY = "Translations for package pantheon-iconbrowser"
DESCRIPTION = "Provides translations for the 'pantheon-iconbrowser' package."
LICENSE = "GPL-3.0-or-later"

PV = "8.1.0"

RPM_NAME = "pantheon-iconbrowser-lang-8.1.0-1.4.noarch.rpm"
RPM_HASH = "5ce6bfb01bfbbb7e30af72696de23f3ad75e3684c353bed59034ae4b9245a33f66e3c1c525fb8d61f8b4e120201952b2a48dc9f8802cc00da27684805ddfbcd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-pantheon-iconbrowser-ca \
locale-pantheon-iconbrowser-en-GB \
locale-pantheon-iconbrowser-fr \
locale-pantheon-iconbrowser-ja \
locale-pantheon-iconbrowser-ka \
locale-pantheon-iconbrowser-mr \
locale-pantheon-iconbrowser-nb \
locale-pantheon-iconbrowser-pt \
locale-pantheon-iconbrowser-ru \
locale-pantheon-iconbrowser-sk \
locale-pantheon-iconbrowser-uk \
locale-pantheon-iconbrowser-zh-CN \
locale-pantheon-iconbrowser-zh-Hant \
pantheon-iconbrowser-lang \
pantheon-iconbrowser-lang-all"

RDEPENDS:${PN} += "pantheon-iconbrowser"

inherit rpm
