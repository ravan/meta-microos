SUMMARY = "Translations for package libKF6Archive6"
DESCRIPTION = "Provides translations for the 'libKF6Archive6' package."
LICENSE = "LGPL-2.0-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6Archive6-lang-6.30.0-1.1.noarch.rpm"
RPM_HASH = "3ceb326bc05142c6f2674a6d8ec4cd3be2d428cdf88eb326d74df56b5e3b6f3797480b16da078f50dc43aa629ea6b01867af913a4c28a5ebb3cc04596cfc0ed8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKF6Archive6-lang \
libKF6Archive6-lang-all \
locale-libKF6Archive6-ar \
locale-libKF6Archive6-ast \
locale-libKF6Archive6-bg \
locale-libKF6Archive6-ca \
locale-libKF6Archive6-ca@valencia \
locale-libKF6Archive6-cs \
locale-libKF6Archive6-de \
locale-libKF6Archive6-en-GB \
locale-libKF6Archive6-eo \
locale-libKF6Archive6-es \
locale-libKF6Archive6-eu \
locale-libKF6Archive6-fi \
locale-libKF6Archive6-fr \
locale-libKF6Archive6-ga \
locale-libKF6Archive6-gl \
locale-libKF6Archive6-he \
locale-libKF6Archive6-hi \
locale-libKF6Archive6-hu \
locale-libKF6Archive6-ia \
locale-libKF6Archive6-id \
locale-libKF6Archive6-it \
locale-libKF6Archive6-ja \
locale-libKF6Archive6-ka \
locale-libKF6Archive6-ko \
locale-libKF6Archive6-lt \
locale-libKF6Archive6-lv \
locale-libKF6Archive6-nl \
locale-libKF6Archive6-nn \
locale-libKF6Archive6-pa \
locale-libKF6Archive6-pl \
locale-libKF6Archive6-pt \
locale-libKF6Archive6-pt-BR \
locale-libKF6Archive6-ro \
locale-libKF6Archive6-ru \
locale-libKF6Archive6-sk \
locale-libKF6Archive6-sl \
locale-libKF6Archive6-sv \
locale-libKF6Archive6-ta \
locale-libKF6Archive6-tr \
locale-libKF6Archive6-ug \
locale-libKF6Archive6-uk \
locale-libKF6Archive6-zh-CN \
locale-libKF6Archive6-zh-TW"

RDEPENDS:${PN} += "libKF6Archive6"

inherit rpm
