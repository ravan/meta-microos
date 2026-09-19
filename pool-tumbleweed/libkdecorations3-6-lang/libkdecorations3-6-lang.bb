SUMMARY = "Translations for package libkdecorations3-6"
DESCRIPTION = "Provides translations for the 'libkdecorations3-6' package."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "libkdecorations3-6-lang-6.7.5-1.1.noarch.rpm"
RPM_HASH = "6b55a1054168213dceeb2c230a38a79813ce141a7af47db5855bf6e2da94d0e0e051d14790f0fba530a859436f158896c478c7b0ac1c4bed36e0ba40e3cd7eda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libkdecorations3-6-lang \
libkdecorations3-6-lang-all \
locale-libkdecorations3-6-ar \
locale-libkdecorations3-6-ast \
locale-libkdecorations3-6-az \
locale-libkdecorations3-6-bg \
locale-libkdecorations3-6-ca \
locale-libkdecorations3-6-ca@valencia \
locale-libkdecorations3-6-cs \
locale-libkdecorations3-6-da \
locale-libkdecorations3-6-de \
locale-libkdecorations3-6-el \
locale-libkdecorations3-6-en-GB \
locale-libkdecorations3-6-eo \
locale-libkdecorations3-6-es \
locale-libkdecorations3-6-et \
locale-libkdecorations3-6-eu \
locale-libkdecorations3-6-fi \
locale-libkdecorations3-6-fr \
locale-libkdecorations3-6-ga \
locale-libkdecorations3-6-gl \
locale-libkdecorations3-6-he \
locale-libkdecorations3-6-hi \
locale-libkdecorations3-6-hu \
locale-libkdecorations3-6-ia \
locale-libkdecorations3-6-id \
locale-libkdecorations3-6-is \
locale-libkdecorations3-6-it \
locale-libkdecorations3-6-ja \
locale-libkdecorations3-6-ka \
locale-libkdecorations3-6-ko \
locale-libkdecorations3-6-lt \
locale-libkdecorations3-6-lv \
locale-libkdecorations3-6-ml \
locale-libkdecorations3-6-nb \
locale-libkdecorations3-6-nl \
locale-libkdecorations3-6-nn \
locale-libkdecorations3-6-pa \
locale-libkdecorations3-6-pl \
locale-libkdecorations3-6-pt \
locale-libkdecorations3-6-pt-BR \
locale-libkdecorations3-6-ro \
locale-libkdecorations3-6-ru \
locale-libkdecorations3-6-sk \
locale-libkdecorations3-6-sl \
locale-libkdecorations3-6-sv \
locale-libkdecorations3-6-ta \
locale-libkdecorations3-6-tr \
locale-libkdecorations3-6-uk \
locale-libkdecorations3-6-zh-CN \
locale-libkdecorations3-6-zh-TW"

RDEPENDS:${PN} += "libkdecorations3-6"

inherit rpm
