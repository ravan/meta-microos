SUMMARY = "Translations for package skladnik"
DESCRIPTION = "Provides translations for the 'skladnik' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "skladnik-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "b5c695164c3ef2493151f64c26e517a174177013f5e66b672d848f0f710c6aeec29e3ba7099f85379b3bd18fee35e617c76f077e3b7668c3b6bd6003b2678172"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-skladnik-ar \
locale-skladnik-ast \
locale-skladnik-bg \
locale-skladnik-bs \
locale-skladnik-ca \
locale-skladnik-ca@valencia \
locale-skladnik-cs \
locale-skladnik-de \
locale-skladnik-en-GB \
locale-skladnik-eo \
locale-skladnik-es \
locale-skladnik-et \
locale-skladnik-eu \
locale-skladnik-fi \
locale-skladnik-fr \
locale-skladnik-ga \
locale-skladnik-gl \
locale-skladnik-he \
locale-skladnik-hi \
locale-skladnik-hu \
locale-skladnik-ia \
locale-skladnik-it \
locale-skladnik-ja \
locale-skladnik-ka \
locale-skladnik-ko \
locale-skladnik-lt \
locale-skladnik-mr \
locale-skladnik-nb \
locale-skladnik-nl \
locale-skladnik-nn \
locale-skladnik-pl \
locale-skladnik-pt \
locale-skladnik-pt-BR \
locale-skladnik-ru \
locale-skladnik-sk \
locale-skladnik-sl \
locale-skladnik-sv \
locale-skladnik-tr \
locale-skladnik-ug \
locale-skladnik-uk \
locale-skladnik-zh-CN \
locale-skladnik-zh-TW \
skladnik-lang \
skladnik-lang-all"

RDEPENDS:${PN} += "skladnik"

inherit rpm
