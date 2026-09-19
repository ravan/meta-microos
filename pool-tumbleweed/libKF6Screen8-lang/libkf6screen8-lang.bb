SUMMARY = "Translations for package libKF6Screen8"
DESCRIPTION = "Provides translations for the 'libKF6Screen8' package."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "libKF6Screen8-lang-6.7.5-1.1.noarch.rpm"
RPM_HASH = "fc8fd9efec832b2a96cc789ab846b06e931ce21efda4c17907fb97a2a3c97dc7f7e6aae67bcf73cccd922a1110dfa497c117af3eb6440371516a3678576aef9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKF6Screen8-lang \
libKF6Screen8-lang-all \
locale-libKF6Screen8-ar \
locale-libKF6Screen8-ast \
locale-libKF6Screen8-bg \
locale-libKF6Screen8-ca \
locale-libKF6Screen8-ca@valencia \
locale-libKF6Screen8-cs \
locale-libKF6Screen8-de \
locale-libKF6Screen8-en-GB \
locale-libKF6Screen8-eo \
locale-libKF6Screen8-es \
locale-libKF6Screen8-eu \
locale-libKF6Screen8-fi \
locale-libKF6Screen8-fr \
locale-libKF6Screen8-ga \
locale-libKF6Screen8-gl \
locale-libKF6Screen8-he \
locale-libKF6Screen8-hi \
locale-libKF6Screen8-hu \
locale-libKF6Screen8-ia \
locale-libKF6Screen8-id \
locale-libKF6Screen8-is \
locale-libKF6Screen8-it \
locale-libKF6Screen8-ja \
locale-libKF6Screen8-ka \
locale-libKF6Screen8-ko \
locale-libKF6Screen8-lt \
locale-libKF6Screen8-lv \
locale-libKF6Screen8-nb \
locale-libKF6Screen8-nl \
locale-libKF6Screen8-nn \
locale-libKF6Screen8-pl \
locale-libKF6Screen8-pt \
locale-libKF6Screen8-pt-BR \
locale-libKF6Screen8-ro \
locale-libKF6Screen8-ru \
locale-libKF6Screen8-sk \
locale-libKF6Screen8-sl \
locale-libKF6Screen8-ta \
locale-libKF6Screen8-tr \
locale-libKF6Screen8-uk \
locale-libKF6Screen8-zh-CN \
locale-libKF6Screen8-zh-TW"

RDEPENDS:${PN} += "libKF6Screen8"

inherit rpm
