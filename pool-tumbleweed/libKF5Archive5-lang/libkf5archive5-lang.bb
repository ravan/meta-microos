SUMMARY = "Translations for package libKF5Archive5"
DESCRIPTION = "Provides translations for the 'libKF5Archive5' package."
LICENSE = "LGPL-2.0-or-later"

PV = "5.116.0"

RPM_NAME = "libKF5Archive5-lang-5.116.0-1.9.noarch.rpm"
RPM_HASH = "aa7cd99543d3e17e8ade16d1e0c59a4429aa09e43327ebe0fa0289f895a7ee524a9f468d52c51629c63486fa0089cb8b69920807b7f29d877d0939d7cd3e8d3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKF5Archive5-lang \
libKF5Archive5-lang-all \
locale-libKF5Archive5-ar \
locale-libKF5Archive5-ca \
locale-libKF5Archive5-ca@valencia \
locale-libKF5Archive5-cs \
locale-libKF5Archive5-de \
locale-libKF5Archive5-en-GB \
locale-libKF5Archive5-eo \
locale-libKF5Archive5-es \
locale-libKF5Archive5-eu \
locale-libKF5Archive5-fi \
locale-libKF5Archive5-fr \
locale-libKF5Archive5-gl \
locale-libKF5Archive5-ia \
locale-libKF5Archive5-id \
locale-libKF5Archive5-it \
locale-libKF5Archive5-ja \
locale-libKF5Archive5-ka \
locale-libKF5Archive5-ko \
locale-libKF5Archive5-lt \
locale-libKF5Archive5-nl \
locale-libKF5Archive5-nn \
locale-libKF5Archive5-pl \
locale-libKF5Archive5-pt \
locale-libKF5Archive5-ro \
locale-libKF5Archive5-ru \
locale-libKF5Archive5-sk \
locale-libKF5Archive5-sl \
locale-libKF5Archive5-sv \
locale-libKF5Archive5-tr \
locale-libKF5Archive5-uk \
locale-libKF5Archive5-zh-CN \
locale-libKF5Archive5-zh-TW"

RDEPENDS:${PN} += "libKF5Archive5"

inherit rpm
