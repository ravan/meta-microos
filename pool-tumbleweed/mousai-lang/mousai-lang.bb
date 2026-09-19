SUMMARY = "Translations for package mousai"
DESCRIPTION = "Provides translations for the 'mousai' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.7.10"

RPM_NAME = "mousai-lang-0.7.10-2.3.noarch.rpm"
RPM_HASH = "62a673ff57ae324501e63ad1a010dd5039c30ea8b540a909519a7744d2216694206bb9348dd9bbc0501ea2265566697b64d6ac270cfc4cf009bd56fa891d34c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-mousai-ar \
locale-mousai-be \
locale-mousai-ca \
locale-mousai-cs \
locale-mousai-de \
locale-mousai-el \
locale-mousai-eo \
locale-mousai-es \
locale-mousai-et \
locale-mousai-eu \
locale-mousai-fa \
locale-mousai-fi \
locale-mousai-fr \
locale-mousai-ga \
locale-mousai-gl \
locale-mousai-he \
locale-mousai-hi \
locale-mousai-hr \
locale-mousai-hu \
locale-mousai-ia \
locale-mousai-id \
locale-mousai-it \
locale-mousai-ja \
locale-mousai-ka \
locale-mousai-ko \
locale-mousai-ms \
locale-mousai-nb-NO \
locale-mousai-ne \
locale-mousai-nl \
locale-mousai-oc \
locale-mousai-pl \
locale-mousai-pt \
locale-mousai-pt-BR \
locale-mousai-ro \
locale-mousai-ru \
locale-mousai-si \
locale-mousai-sk \
locale-mousai-sr \
locale-mousai-sv \
locale-mousai-ta \
locale-mousai-tr \
locale-mousai-uk \
mousai-lang \
mousai-lang-all"

RDEPENDS:${PN} += "mousai"

inherit rpm
