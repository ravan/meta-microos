SUMMARY = "Translations for package trader"
DESCRIPTION = "Provides translations for the 'trader' package."
LICENSE = "GPL-3.0-or-later"

PV = "7.21"

RPM_NAME = "trader-lang-7.21-2.3.noarch.rpm"
RPM_HASH = "f1ca8e49fceb1813b5047ced7d34a5a1880dd163eeb2e1e7d835e5ca2f17756acfe1a3e60cf4424c8af62eab8619d8a4e9710942711a484efea0041221c4134a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-trader-da \
locale-trader-de \
locale-trader-en-AU \
locale-trader-en-CA \
locale-trader-en-GB \
locale-trader-en-US \
locale-trader-en@quot \
locale-trader-eo \
locale-trader-fi \
locale-trader-fr \
locale-trader-hr \
locale-trader-hu \
locale-trader-nb \
locale-trader-pl \
locale-trader-pt-BR \
locale-trader-ro \
locale-trader-ru \
locale-trader-sr \
locale-trader-sv \
locale-trader-uk \
trader-lang \
trader-lang-all"

RDEPENDS:${PN} += "trader"

inherit rpm
