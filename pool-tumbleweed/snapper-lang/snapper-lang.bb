SUMMARY = "Languages for package snapper"
DESCRIPTION = "Provides translations to the package snapper"
LICENSE = "GPL-2.0-only"

PV = "0.13.1"

RPM_NAME = "snapper-lang-0.13.1-3.3.noarch.rpm"
RPM_HASH = "1ead18711ef4a979697355fd969fc78dd83189957d9d209fe79469d2a93a082da3460bf59d3085d63e539ebe39303e61d27f832489850c77ed6e15d67f000d1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-snapper-af \
locale-snapper-ar \
locale-snapper-be \
locale-snapper-bg \
locale-snapper-bn \
locale-snapper-bs \
locale-snapper-ca \
locale-snapper-cs \
locale-snapper-cy \
locale-snapper-da \
locale-snapper-de \
locale-snapper-el \
locale-snapper-en-GB \
locale-snapper-en-US \
locale-snapper-eo \
locale-snapper-es \
locale-snapper-et \
locale-snapper-eu \
locale-snapper-fa \
locale-snapper-fi \
locale-snapper-fr \
locale-snapper-gl \
locale-snapper-gu \
locale-snapper-he \
locale-snapper-hi \
locale-snapper-hr \
locale-snapper-hu \
locale-snapper-id \
locale-snapper-it \
locale-snapper-ja \
locale-snapper-ka \
locale-snapper-km \
locale-snapper-ko \
locale-snapper-lt \
locale-snapper-mk \
locale-snapper-mr \
locale-snapper-nb \
locale-snapper-nds \
locale-snapper-nl \
locale-snapper-nn \
locale-snapper-pa \
locale-snapper-pl \
locale-snapper-pt \
locale-snapper-pt-BR \
locale-snapper-ro \
locale-snapper-ru \
locale-snapper-si \
locale-snapper-sk \
locale-snapper-sl \
locale-snapper-sr \
locale-snapper-sv \
locale-snapper-ta \
locale-snapper-th \
locale-snapper-tr \
locale-snapper-uk \
locale-snapper-vi \
locale-snapper-wa \
locale-snapper-zh-CN \
locale-snapper-zh-TW \
snapper-lang \
snapper-lang-all"

RDEPENDS:${PN} += ""

inherit rpm
