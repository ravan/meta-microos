SUMMARY = "Translations for package kgeotag"
DESCRIPTION = "Provides translations for the 'kgeotag' package."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.0"

RPM_NAME = "kgeotag-lang-2.0.0-1.4.noarch.rpm"
RPM_HASH = "eb0c042dbb69b9bfc2275de5149d0681939ff01b36e40da03b4c0699f2bf6f55cebc4b33ed701ce10330687997796bbab95e777285d79835e4d6bd2966e5b130"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kgeotag-lang \
kgeotag-lang-all \
locale-kgeotag-ar \
locale-kgeotag-ca \
locale-kgeotag-ca@valencia \
locale-kgeotag-cs \
locale-kgeotag-de \
locale-kgeotag-en-GB \
locale-kgeotag-eo \
locale-kgeotag-es \
locale-kgeotag-eu \
locale-kgeotag-fi \
locale-kgeotag-fr \
locale-kgeotag-ga \
locale-kgeotag-gl \
locale-kgeotag-he \
locale-kgeotag-ia \
locale-kgeotag-it \
locale-kgeotag-ja \
locale-kgeotag-ka \
locale-kgeotag-ko \
locale-kgeotag-lt \
locale-kgeotag-nl \
locale-kgeotag-nn \
locale-kgeotag-pa \
locale-kgeotag-pl \
locale-kgeotag-pt \
locale-kgeotag-pt-BR \
locale-kgeotag-ru \
locale-kgeotag-sk \
locale-kgeotag-sl \
locale-kgeotag-sv \
locale-kgeotag-tr \
locale-kgeotag-uk \
locale-kgeotag-zh-CN \
locale-kgeotag-zh-TW"

RDEPENDS:${PN} += "kgeotag"

inherit rpm
