SUMMARY = "Translations for package libKF6Su6"
DESCRIPTION = "Provides translations for the 'libKF6Su6' package."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6Su6-lang-6.30.0-1.1.noarch.rpm"
RPM_HASH = "ca566dc6cdf3ece6ec79bfa72c674e4aa7a1ab3dacff6950614961b2cff8f946440ab21c10bac000a10a586a82e54dd01e05780ac80b55a6649623545950204a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKF6Su6-lang \
libKF6Su6-lang-all \
locale-libKF6Su6-ar \
locale-libKF6Su6-ast \
locale-libKF6Su6-az \
locale-libKF6Su6-bg \
locale-libKF6Su6-bs \
locale-libKF6Su6-ca \
locale-libKF6Su6-ca@valencia \
locale-libKF6Su6-cs \
locale-libKF6Su6-da \
locale-libKF6Su6-de \
locale-libKF6Su6-el \
locale-libKF6Su6-en-GB \
locale-libKF6Su6-eo \
locale-libKF6Su6-es \
locale-libKF6Su6-et \
locale-libKF6Su6-eu \
locale-libKF6Su6-fi \
locale-libKF6Su6-fr \
locale-libKF6Su6-ga \
locale-libKF6Su6-gd \
locale-libKF6Su6-gl \
locale-libKF6Su6-he \
locale-libKF6Su6-hi \
locale-libKF6Su6-hr \
locale-libKF6Su6-hu \
locale-libKF6Su6-ia \
locale-libKF6Su6-id \
locale-libKF6Su6-is \
locale-libKF6Su6-it \
locale-libKF6Su6-ja \
locale-libKF6Su6-ka \
locale-libKF6Su6-ko \
locale-libKF6Su6-lt \
locale-libKF6Su6-lv \
locale-libKF6Su6-ml \
locale-libKF6Su6-nb \
locale-libKF6Su6-nds \
locale-libKF6Su6-nl \
locale-libKF6Su6-nn \
locale-libKF6Su6-pa \
locale-libKF6Su6-pl \
locale-libKF6Su6-pt \
locale-libKF6Su6-pt-BR \
locale-libKF6Su6-ro \
locale-libKF6Su6-ru \
locale-libKF6Su6-sk \
locale-libKF6Su6-sl \
locale-libKF6Su6-sr \
locale-libKF6Su6-sr@ijekavian \
locale-libKF6Su6-sr@ijekavianlatin \
locale-libKF6Su6-sr@latin \
locale-libKF6Su6-sv \
locale-libKF6Su6-ta \
locale-libKF6Su6-tr \
locale-libKF6Su6-ug \
locale-libKF6Su6-uk \
locale-libKF6Su6-vi \
locale-libKF6Su6-zh-CN \
locale-libKF6Su6-zh-TW"

RDEPENDS:${PN} += "libKF6Su6"

inherit rpm
