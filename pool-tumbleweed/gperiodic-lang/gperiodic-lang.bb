SUMMARY = "Translations for package gperiodic"
DESCRIPTION = "Provides translations for the 'gperiodic' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.3"

RPM_NAME = "gperiodic-lang-3.0.3-3.8.noarch.rpm"
RPM_HASH = "866e9f45513fe29ec674ab16478e512516cbe63a5beccdba50a17f5d9d7557c931d6c76776b87bff92aa0e4d5df28ffe40ebbe6883e580838a8ff65ef7112b0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gperiodic-lang \
gperiodic-lang-all \
locale-gperiodic-ast \
locale-gperiodic-be \
locale-gperiodic-bg \
locale-gperiodic-ca \
locale-gperiodic-cs \
locale-gperiodic-da \
locale-gperiodic-de \
locale-gperiodic-es \
locale-gperiodic-fi \
locale-gperiodic-fr \
locale-gperiodic-gl \
locale-gperiodic-id \
locale-gperiodic-is \
locale-gperiodic-it \
locale-gperiodic-lt \
locale-gperiodic-ms \
locale-gperiodic-nl \
locale-gperiodic-oc \
locale-gperiodic-pl \
locale-gperiodic-pt \
locale-gperiodic-pt-BR \
locale-gperiodic-ru \
locale-gperiodic-sr \
locale-gperiodic-sv \
locale-gperiodic-tr \
locale-gperiodic-uk \
locale-gperiodic-zh-CN"

RDEPENDS:${PN} += "gperiodic"

inherit rpm
