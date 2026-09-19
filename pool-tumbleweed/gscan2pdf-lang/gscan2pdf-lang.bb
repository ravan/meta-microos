SUMMARY = "Translations for package gscan2pdf"
DESCRIPTION = "Provides translations for the 'gscan2pdf' package."
LICENSE = "GPL-3.0-only"

PV = "2.13.5"

RPM_NAME = "gscan2pdf-lang-2.13.5-2.5.noarch.rpm"
RPM_HASH = "ec967dc7bdce9716a8745aae7d7500d23c85597ec88bcddc32ae8531bdfe11e862649e08c4ca5bac88ec6e471eabe26395f5288695cd0143ab6615934f9580e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gscan2pdf-lang \
gscan2pdf-lang-all \
locale-gscan2pdf-be \
locale-gscan2pdf-bg \
locale-gscan2pdf-ca \
locale-gscan2pdf-cs \
locale-gscan2pdf-da \
locale-gscan2pdf-de \
locale-gscan2pdf-el \
locale-gscan2pdf-en-GB \
locale-gscan2pdf-es \
locale-gscan2pdf-eu \
locale-gscan2pdf-fa \
locale-gscan2pdf-fi \
locale-gscan2pdf-fr \
locale-gscan2pdf-gl \
locale-gscan2pdf-gu \
locale-gscan2pdf-he \
locale-gscan2pdf-hr \
locale-gscan2pdf-hu \
locale-gscan2pdf-it \
locale-gscan2pdf-ja \
locale-gscan2pdf-ko \
locale-gscan2pdf-nb \
locale-gscan2pdf-nl \
locale-gscan2pdf-oc \
locale-gscan2pdf-pl \
locale-gscan2pdf-pt \
locale-gscan2pdf-pt-BR \
locale-gscan2pdf-ru \
locale-gscan2pdf-sk \
locale-gscan2pdf-sl \
locale-gscan2pdf-sv \
locale-gscan2pdf-tr \
locale-gscan2pdf-uk \
locale-gscan2pdf-zh-CN \
locale-gscan2pdf-zh-TW"

RDEPENDS:${PN} += "gscan2pdf"

inherit rpm
