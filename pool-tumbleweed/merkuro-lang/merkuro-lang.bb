SUMMARY = "Translations for package merkuro"
DESCRIPTION = "Provides translations for the 'merkuro' package."
LICENSE = "GPL-3.0-only"

PV = "26.08.1"

RPM_NAME = "merkuro-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "3d1f0935eb555e1583f4621e258ff013ef35ccb7b67fcfcf33d01bab149fa41aac9692d5505b51ac6828adb419c2885398df36cb3bfb558a3dbd8d35b901244b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-merkuro-ar \
locale-merkuro-ast \
locale-merkuro-az \
locale-merkuro-bg \
locale-merkuro-ca \
locale-merkuro-ca@valencia \
locale-merkuro-cs \
locale-merkuro-da \
locale-merkuro-de \
locale-merkuro-el \
locale-merkuro-en-GB \
locale-merkuro-eo \
locale-merkuro-es \
locale-merkuro-eu \
locale-merkuro-fi \
locale-merkuro-fr \
locale-merkuro-ga \
locale-merkuro-gl \
locale-merkuro-he \
locale-merkuro-hi \
locale-merkuro-hu \
locale-merkuro-ia \
locale-merkuro-id \
locale-merkuro-it \
locale-merkuro-ja \
locale-merkuro-ka \
locale-merkuro-ko \
locale-merkuro-lt \
locale-merkuro-lv \
locale-merkuro-nl \
locale-merkuro-nn \
locale-merkuro-pl \
locale-merkuro-pt \
locale-merkuro-pt-BR \
locale-merkuro-ru \
locale-merkuro-sk \
locale-merkuro-sl \
locale-merkuro-sv \
locale-merkuro-ta \
locale-merkuro-tr \
locale-merkuro-ug \
locale-merkuro-uk \
locale-merkuro-zh-CN \
locale-merkuro-zh-TW \
merkuro-lang \
merkuro-lang-all"

RDEPENDS:${PN} += "merkuro"

inherit rpm
