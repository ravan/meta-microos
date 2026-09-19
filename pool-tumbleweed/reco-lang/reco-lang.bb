SUMMARY = "Translations for package reco"
DESCRIPTION = "Provides translations for the 'reco' package."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.1"

RPM_NAME = "reco-lang-5.2.1-1.2.noarch.rpm"
RPM_HASH = "1c6f1df5e1d4aa1d62fb66fd792d314995f55ac26ddaf6aaa3f05a82e96e41e23925cd458ee06cdccc22a096b5b43f7afb70954557b0bf46b7cb7b8351dbf706"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-reco-ca \
locale-reco-de \
locale-reco-es \
locale-reco-et \
locale-reco-fa \
locale-reco-fi \
locale-reco-fr \
locale-reco-hi \
locale-reco-hr \
locale-reco-hu \
locale-reco-it \
locale-reco-ja \
locale-reco-lt \
locale-reco-nb-NO \
locale-reco-nl \
locale-reco-oc \
locale-reco-pl \
locale-reco-pt \
locale-reco-pt-BR \
locale-reco-ru \
locale-reco-sk \
locale-reco-ta \
locale-reco-tr \
locale-reco-uk \
locale-reco-zh-CN \
reco-lang \
reco-lang-all"

RDEPENDS:${PN} += "reco"

inherit rpm
