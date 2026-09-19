SUMMARY = "Translations for package plasma-camera"
DESCRIPTION = "Provides translations for the 'plasma-camera' package."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "plasma-camera-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "08fa0b2db11c810b3cfca46e24db3e24e0ebe9c337314ee5f408fb9803a572b0a2b305ce68119e5e85a40ac1791e1a29747f9fcf605c934ddf004cfe45811235"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-plasma-camera-ar \
locale-plasma-camera-az \
locale-plasma-camera-bg \
locale-plasma-camera-ca \
locale-plasma-camera-ca@valencia \
locale-plasma-camera-cs \
locale-plasma-camera-da \
locale-plasma-camera-de \
locale-plasma-camera-el \
locale-plasma-camera-en-GB \
locale-plasma-camera-eo \
locale-plasma-camera-es \
locale-plasma-camera-et \
locale-plasma-camera-eu \
locale-plasma-camera-fi \
locale-plasma-camera-fr \
locale-plasma-camera-ga \
locale-plasma-camera-gl \
locale-plasma-camera-he \
locale-plasma-camera-hi \
locale-plasma-camera-hu \
locale-plasma-camera-ia \
locale-plasma-camera-id \
locale-plasma-camera-is \
locale-plasma-camera-it \
locale-plasma-camera-ja \
locale-plasma-camera-ka \
locale-plasma-camera-ko \
locale-plasma-camera-lt \
locale-plasma-camera-lv \
locale-plasma-camera-nl \
locale-plasma-camera-nn \
locale-plasma-camera-pa \
locale-plasma-camera-pl \
locale-plasma-camera-pt \
locale-plasma-camera-pt-BR \
locale-plasma-camera-ro \
locale-plasma-camera-ru \
locale-plasma-camera-sk \
locale-plasma-camera-sl \
locale-plasma-camera-sv \
locale-plasma-camera-tr \
locale-plasma-camera-ug \
locale-plasma-camera-uk \
locale-plasma-camera-zh-CN \
locale-plasma-camera-zh-TW \
plasma-camera-lang \
plasma-camera-lang-all"

RDEPENDS:${PN} += "plasma-camera"

inherit rpm
