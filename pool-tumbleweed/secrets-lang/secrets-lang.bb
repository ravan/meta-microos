SUMMARY = "Translations for package secrets"
DESCRIPTION = "Provides translations for the 'secrets' package."
LICENSE = "GPL-3.0-only"

PV = "13.0.1"

RPM_NAME = "secrets-lang-13.0.1-1.2.noarch.rpm"
RPM_HASH = "a73f2340dfc31b12874a2dd7a01a6310e113da56702c9ca607b8cb3b91d3a3d68334732d4d66cd63a2312763587a7c4a131a227782eb8e5c98cf6a732b57efbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-secrets-be \
locale-secrets-bg \
locale-secrets-ca \
locale-secrets-cs \
locale-secrets-da \
locale-secrets-de \
locale-secrets-el \
locale-secrets-en-GB \
locale-secrets-eo \
locale-secrets-es \
locale-secrets-eu \
locale-secrets-fa \
locale-secrets-fi \
locale-secrets-fr \
locale-secrets-gl \
locale-secrets-he \
locale-secrets-hi \
locale-secrets-hr \
locale-secrets-hu \
locale-secrets-id \
locale-secrets-is \
locale-secrets-it \
locale-secrets-ka \
locale-secrets-kk \
locale-secrets-ko \
locale-secrets-nb \
locale-secrets-nl \
locale-secrets-nn \
locale-secrets-oc \
locale-secrets-pa \
locale-secrets-pl \
locale-secrets-pt \
locale-secrets-pt-BR \
locale-secrets-ro \
locale-secrets-ru \
locale-secrets-sl \
locale-secrets-sr \
locale-secrets-sv \
locale-secrets-tr \
locale-secrets-uk \
locale-secrets-vi \
locale-secrets-zh-CN \
secrets-lang \
secrets-lang-all"

RDEPENDS:${PN} += "secrets"

inherit rpm
