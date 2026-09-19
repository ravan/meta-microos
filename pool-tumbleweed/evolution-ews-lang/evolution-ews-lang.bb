SUMMARY = "Translations for package evolution-ews"
DESCRIPTION = "Provides translations for the 'evolution-ews' package."
LICENSE = "LGPL-2.1-only"

PV = "3.60.2"

RPM_NAME = "evolution-ews-lang-3.60.2-1.2.noarch.rpm"
RPM_HASH = "cf12796dec6e5beec53b8de6d571e94d9d81a524776b3ee4950d76b05ee46ec80208475f5e19615ba089718437fa7ab26a7f6d06fa9d64edcd5be666ec328fb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "evolution-ews-lang \
evolution-ews-lang-all \
locale-evolution-ews-as \
locale-evolution-ews-bg \
locale-evolution-ews-bn-IN \
locale-evolution-ews-bs \
locale-evolution-ews-ca \
locale-evolution-ews-cs \
locale-evolution-ews-da \
locale-evolution-ews-de \
locale-evolution-ews-el \
locale-evolution-ews-en-GB \
locale-evolution-ews-eo \
locale-evolution-ews-es \
locale-evolution-ews-eu \
locale-evolution-ews-fa \
locale-evolution-ews-fr \
locale-evolution-ews-gl \
locale-evolution-ews-gu \
locale-evolution-ews-hi \
locale-evolution-ews-hr \
locale-evolution-ews-hu \
locale-evolution-ews-id \
locale-evolution-ews-it \
locale-evolution-ews-ja \
locale-evolution-ews-ka \
locale-evolution-ews-kk \
locale-evolution-ews-kn \
locale-evolution-ews-lt \
locale-evolution-ews-lv \
locale-evolution-ews-mr \
locale-evolution-ews-nb \
locale-evolution-ews-nl \
locale-evolution-ews-oc \
locale-evolution-ews-or \
locale-evolution-ews-pl \
locale-evolution-ews-pt \
locale-evolution-ews-pt-BR \
locale-evolution-ews-ro \
locale-evolution-ews-ru \
locale-evolution-ews-sk \
locale-evolution-ews-sl \
locale-evolution-ews-sr \
locale-evolution-ews-sr@latin \
locale-evolution-ews-sv \
locale-evolution-ews-ta \
locale-evolution-ews-te \
locale-evolution-ews-tr \
locale-evolution-ews-uk \
locale-evolution-ews-zh-CN"

RDEPENDS:${PN} += "evolution-ews"

inherit rpm
