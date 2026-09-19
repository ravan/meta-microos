SUMMARY = "Translations for package eartag"
DESCRIPTION = "Provides translations for the 'eartag' package."
LICENSE = "MIT"

PV = "1.0.3"

RPM_NAME = "eartag-lang-1.0.3-1.1.noarch.rpm"
RPM_HASH = "cb46a5aca99fc0089d2093b3f385e33464f92e9c2d998a5770d9f7cd90ed37a789108483c5e1e79319d7d3dff3febea9197bab2864c33845791971329cb38842"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eartag-lang \
eartag-lang-all \
locale-eartag-bg \
locale-eartag-ca \
locale-eartag-cs \
locale-eartag-de \
locale-eartag-el \
locale-eartag-en-GB \
locale-eartag-eo \
locale-eartag-es \
locale-eartag-eu \
locale-eartag-fa \
locale-eartag-fi \
locale-eartag-fr \
locale-eartag-fur \
locale-eartag-he \
locale-eartag-hi \
locale-eartag-hr \
locale-eartag-hu \
locale-eartag-id \
locale-eartag-is \
locale-eartag-it \
locale-eartag-ka \
locale-eartag-kk \
locale-eartag-nb \
locale-eartag-nl \
locale-eartag-oc \
locale-eartag-pl \
locale-eartag-pt \
locale-eartag-pt-BR \
locale-eartag-ru \
locale-eartag-sl \
locale-eartag-sr \
locale-eartag-sv \
locale-eartag-tr \
locale-eartag-uk \
locale-eartag-zh-CN"

RDEPENDS:${PN} += "eartag"

inherit rpm
