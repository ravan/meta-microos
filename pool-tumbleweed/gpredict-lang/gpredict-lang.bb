SUMMARY = "Translations for package gpredict"
DESCRIPTION = "Provides translations for the 'gpredict' package."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "2.6"

RPM_NAME = "gpredict-lang-2.6-1.1.noarch.rpm"
RPM_HASH = "d82a881767dd79149a8f4807792aaa9c37d71219e266ecf1a0c0f5f9138503ca38dc96cb08ee334f864a91152608fcf9dd0087c81359d934d653ad63112dde5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gpredict-lang \
gpredict-lang-all \
locale-gpredict-cs \
locale-gpredict-da \
locale-gpredict-de \
locale-gpredict-el \
locale-gpredict-en-GB \
locale-gpredict-en-US \
locale-gpredict-es \
locale-gpredict-fi \
locale-gpredict-fr \
locale-gpredict-id \
locale-gpredict-it \
locale-gpredict-lt \
locale-gpredict-ru \
locale-gpredict-th \
locale-gpredict-uk"

RDEPENDS:${PN} += "gpredict"

inherit rpm
