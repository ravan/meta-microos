SUMMARY = "Translations for package kuiviewer"
DESCRIPTION = "Provides translations for the 'kuiviewer' package."
LICENSE = "GFDL-1.2-only & GPL-2.0-only & LGPL-2.0-only"

PV = "26.08.1"

RPM_NAME = "kuiviewer-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "cb36d7060587d7f6c4768828e2ae5ccac3535720717f533b9c780d18cbdc56461b67f8c1b50b3f0c072987a7d9159acd63dffa07ecde02ee436455e0726ff85a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kuiviewer-lang \
kuiviewer-lang-all \
locale-kuiviewer-ar \
locale-kuiviewer-ast \
locale-kuiviewer-az \
locale-kuiviewer-be \
locale-kuiviewer-bg \
locale-kuiviewer-br \
locale-kuiviewer-bs \
locale-kuiviewer-ca \
locale-kuiviewer-ca@valencia \
locale-kuiviewer-cs \
locale-kuiviewer-cy \
locale-kuiviewer-da \
locale-kuiviewer-de \
locale-kuiviewer-el \
locale-kuiviewer-en-GB \
locale-kuiviewer-eo \
locale-kuiviewer-es \
locale-kuiviewer-et \
locale-kuiviewer-eu \
locale-kuiviewer-fa \
locale-kuiviewer-fi \
locale-kuiviewer-fr \
locale-kuiviewer-ga \
locale-kuiviewer-gl \
locale-kuiviewer-he \
locale-kuiviewer-hi \
locale-kuiviewer-hu \
locale-kuiviewer-ia \
locale-kuiviewer-id \
locale-kuiviewer-is \
locale-kuiviewer-it \
locale-kuiviewer-ja \
locale-kuiviewer-ka \
locale-kuiviewer-kk \
locale-kuiviewer-km \
locale-kuiviewer-ko \
locale-kuiviewer-lt \
locale-kuiviewer-lv \
locale-kuiviewer-mk \
locale-kuiviewer-mr \
locale-kuiviewer-ms \
locale-kuiviewer-nb \
locale-kuiviewer-nds \
locale-kuiviewer-ne \
locale-kuiviewer-nl \
locale-kuiviewer-nn \
locale-kuiviewer-oc \
locale-kuiviewer-pa \
locale-kuiviewer-pl \
locale-kuiviewer-pt \
locale-kuiviewer-pt-BR \
locale-kuiviewer-ro \
locale-kuiviewer-ru \
locale-kuiviewer-sk \
locale-kuiviewer-sl \
locale-kuiviewer-sq \
locale-kuiviewer-sv \
locale-kuiviewer-ta \
locale-kuiviewer-th \
locale-kuiviewer-tr \
locale-kuiviewer-ug \
locale-kuiviewer-uk \
locale-kuiviewer-zh-CN \
locale-kuiviewer-zh-TW"

RDEPENDS:${PN} += "kuiviewer"

inherit rpm
