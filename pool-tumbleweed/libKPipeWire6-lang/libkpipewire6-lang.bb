SUMMARY = "Translations for package libKPipeWire6"
DESCRIPTION = "Provides translations for the 'libKPipeWire6' package."
LICENSE = "LGPL-2.0-only & LGPL-3.0-only"

PV = "6.7.5"

RPM_NAME = "libKPipeWire6-lang-6.7.5-1.1.noarch.rpm"
RPM_HASH = "96d3b2cfdebe48ca752c2c667d044a13829ce040eeb50f5f06a71caa988e499e9188be2636827c031f0cd8a7cf7176874c531e0e0ab0a3f10678bb2ba73ae2d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKPipeWire6-lang \
libKPipeWire6-lang-all \
locale-libKPipeWire6-ar \
locale-libKPipeWire6-ast \
locale-libKPipeWire6-bg \
locale-libKPipeWire6-ca \
locale-libKPipeWire6-ca@valencia \
locale-libKPipeWire6-cs \
locale-libKPipeWire6-de \
locale-libKPipeWire6-en-GB \
locale-libKPipeWire6-eo \
locale-libKPipeWire6-es \
locale-libKPipeWire6-eu \
locale-libKPipeWire6-fi \
locale-libKPipeWire6-fr \
locale-libKPipeWire6-ga \
locale-libKPipeWire6-gl \
locale-libKPipeWire6-he \
locale-libKPipeWire6-hi \
locale-libKPipeWire6-hu \
locale-libKPipeWire6-ia \
locale-libKPipeWire6-id \
locale-libKPipeWire6-is \
locale-libKPipeWire6-it \
locale-libKPipeWire6-ja \
locale-libKPipeWire6-ka \
locale-libKPipeWire6-ko \
locale-libKPipeWire6-lt \
locale-libKPipeWire6-lv \
locale-libKPipeWire6-nl \
locale-libKPipeWire6-nn \
locale-libKPipeWire6-pa \
locale-libKPipeWire6-pl \
locale-libKPipeWire6-pt \
locale-libKPipeWire6-pt-BR \
locale-libKPipeWire6-ro \
locale-libKPipeWire6-ru \
locale-libKPipeWire6-sk \
locale-libKPipeWire6-sl \
locale-libKPipeWire6-sv \
locale-libKPipeWire6-ta \
locale-libKPipeWire6-tr \
locale-libKPipeWire6-uk \
locale-libKPipeWire6-zh-CN \
locale-libKPipeWire6-zh-TW"

RDEPENDS:${PN} += "libKPipeWire6"

inherit rpm
