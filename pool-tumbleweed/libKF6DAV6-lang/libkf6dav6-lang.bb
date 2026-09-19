SUMMARY = "Translations for package libKF6DAV6"
DESCRIPTION = "Provides translations for the 'libKF6DAV6' package."
LICENSE = "LGPL-2.0-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6DAV6-lang-6.30.0-1.1.noarch.rpm"
RPM_HASH = "65e41edb0456c7b90102c2bd439fed6de64345f89c68c6d6cb75fabddaf63abcd9d03f6f41febaf18f3d1b7e47b0ede1db7040bdfad3aaeb71222492db1a065b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKF6DAV6-lang \
libKF6DAV6-lang-all \
locale-libKF6DAV6-ar \
locale-libKF6DAV6-ast \
locale-libKF6DAV6-az \
locale-libKF6DAV6-bg \
locale-libKF6DAV6-ca \
locale-libKF6DAV6-ca@valencia \
locale-libKF6DAV6-cs \
locale-libKF6DAV6-de \
locale-libKF6DAV6-el \
locale-libKF6DAV6-en-GB \
locale-libKF6DAV6-eo \
locale-libKF6DAV6-es \
locale-libKF6DAV6-et \
locale-libKF6DAV6-eu \
locale-libKF6DAV6-fi \
locale-libKF6DAV6-fr \
locale-libKF6DAV6-ga \
locale-libKF6DAV6-gl \
locale-libKF6DAV6-he \
locale-libKF6DAV6-hi \
locale-libKF6DAV6-hu \
locale-libKF6DAV6-ia \
locale-libKF6DAV6-it \
locale-libKF6DAV6-ja \
locale-libKF6DAV6-ka \
locale-libKF6DAV6-ko \
locale-libKF6DAV6-lt \
locale-libKF6DAV6-lv \
locale-libKF6DAV6-nb \
locale-libKF6DAV6-nl \
locale-libKF6DAV6-nn \
locale-libKF6DAV6-pl \
locale-libKF6DAV6-pt \
locale-libKF6DAV6-pt-BR \
locale-libKF6DAV6-ro \
locale-libKF6DAV6-ru \
locale-libKF6DAV6-sk \
locale-libKF6DAV6-sl \
locale-libKF6DAV6-sr \
locale-libKF6DAV6-sr@ijekavian \
locale-libKF6DAV6-sr@ijekavianlatin \
locale-libKF6DAV6-sr@latin \
locale-libKF6DAV6-sv \
locale-libKF6DAV6-ta \
locale-libKF6DAV6-tr \
locale-libKF6DAV6-ug \
locale-libKF6DAV6-uk \
locale-libKF6DAV6-zh-CN \
locale-libKF6DAV6-zh-TW"

RDEPENDS:${PN} += "libKF6DAV6"

inherit rpm
