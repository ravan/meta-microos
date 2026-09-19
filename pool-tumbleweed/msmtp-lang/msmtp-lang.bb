SUMMARY = "Translations for package msmtp"
DESCRIPTION = "Provides translations for the 'msmtp' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.8.34"

RPM_NAME = "msmtp-lang-1.8.34-1.1.noarch.rpm"
RPM_HASH = "6e0e51a4923d41e90380e2fa9a381980c9d11f7d13bba38be40f39d629dfcbe35d27dc00239399d933ece68233864a8d75607192c8dcb51883c20555f55d9876"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-msmtp-de \
locale-msmtp-eo \
locale-msmtp-es \
locale-msmtp-fr \
locale-msmtp-ka \
locale-msmtp-pt-BR \
locale-msmtp-ro \
locale-msmtp-ru \
locale-msmtp-sr \
locale-msmtp-sv \
locale-msmtp-ta \
locale-msmtp-uk \
locale-msmtp-zh-CN \
msmtp-lang \
msmtp-lang-all"

RDEPENDS:${PN} += "msmtp"

inherit rpm
