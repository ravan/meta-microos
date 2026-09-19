SUMMARY = "Translations for package NetworkManager-connection-editor"
DESCRIPTION = "Provides translations for the 'NetworkManager-connection-editor' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.0"

RPM_NAME = "NetworkManager-connection-editor-lang-1.36.0-5.3.noarch.rpm"
RPM_HASH = "110daebe93684e49a24146c4c1c93851064709ab53bc926fc39103f2972527b8f47675622f83e4999cb8d3980bd22c5538a04c4e53bfd2bfb259417fd2e51ba9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "NetworkManager-applet-lang \
NetworkManager-connection-editor-lang \
NetworkManager-connection-editor-lang-all \
locale-NetworkManager-connection-editor-af \
locale-NetworkManager-connection-editor-ar \
locale-NetworkManager-connection-editor-as \
locale-NetworkManager-connection-editor-ast \
locale-NetworkManager-connection-editor-be \
locale-NetworkManager-connection-editor-be@latin \
locale-NetworkManager-connection-editor-bg \
locale-NetworkManager-connection-editor-bn-IN \
locale-NetworkManager-connection-editor-bs \
locale-NetworkManager-connection-editor-ca \
locale-NetworkManager-connection-editor-ca@valencia \
locale-NetworkManager-connection-editor-cs \
locale-NetworkManager-connection-editor-da \
locale-NetworkManager-connection-editor-de \
locale-NetworkManager-connection-editor-dz \
locale-NetworkManager-connection-editor-el \
locale-NetworkManager-connection-editor-en-CA \
locale-NetworkManager-connection-editor-en-GB \
locale-NetworkManager-connection-editor-eo \
locale-NetworkManager-connection-editor-es \
locale-NetworkManager-connection-editor-et \
locale-NetworkManager-connection-editor-eu \
locale-NetworkManager-connection-editor-fa \
locale-NetworkManager-connection-editor-fi \
locale-NetworkManager-connection-editor-fr \
locale-NetworkManager-connection-editor-gd \
locale-NetworkManager-connection-editor-gl \
locale-NetworkManager-connection-editor-gu \
locale-NetworkManager-connection-editor-he \
locale-NetworkManager-connection-editor-hi \
locale-NetworkManager-connection-editor-hr \
locale-NetworkManager-connection-editor-hu \
locale-NetworkManager-connection-editor-id \
locale-NetworkManager-connection-editor-is \
locale-NetworkManager-connection-editor-it \
locale-NetworkManager-connection-editor-ja \
locale-NetworkManager-connection-editor-ka \
locale-NetworkManager-connection-editor-kk \
locale-NetworkManager-connection-editor-km \
locale-NetworkManager-connection-editor-kn \
locale-NetworkManager-connection-editor-ko \
locale-NetworkManager-connection-editor-lt \
locale-NetworkManager-connection-editor-lv \
locale-NetworkManager-connection-editor-mk \
locale-NetworkManager-connection-editor-ml \
locale-NetworkManager-connection-editor-mr \
locale-NetworkManager-connection-editor-ms \
locale-NetworkManager-connection-editor-nb \
locale-NetworkManager-connection-editor-ne \
locale-NetworkManager-connection-editor-nl \
locale-NetworkManager-connection-editor-nn \
locale-NetworkManager-connection-editor-oc \
locale-NetworkManager-connection-editor-or \
locale-NetworkManager-connection-editor-pa \
locale-NetworkManager-connection-editor-pl \
locale-NetworkManager-connection-editor-pt \
locale-NetworkManager-connection-editor-pt-BR \
locale-NetworkManager-connection-editor-ro \
locale-NetworkManager-connection-editor-ru \
locale-NetworkManager-connection-editor-sk \
locale-NetworkManager-connection-editor-sl \
locale-NetworkManager-connection-editor-sq \
locale-NetworkManager-connection-editor-sr \
locale-NetworkManager-connection-editor-sr@latin \
locale-NetworkManager-connection-editor-sv \
locale-NetworkManager-connection-editor-ta \
locale-NetworkManager-connection-editor-te \
locale-NetworkManager-connection-editor-th \
locale-NetworkManager-connection-editor-tr \
locale-NetworkManager-connection-editor-ug \
locale-NetworkManager-connection-editor-uk \
locale-NetworkManager-connection-editor-vi \
locale-NetworkManager-connection-editor-wa \
locale-NetworkManager-connection-editor-zh-CN \
locale-NetworkManager-connection-editor-zh-HK \
locale-NetworkManager-connection-editor-zh-TW"

RDEPENDS:${PN} += "NetworkManager-connection-editor"

inherit rpm
