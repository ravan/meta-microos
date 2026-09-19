SUMMARY = "Translations for package libKChart6-3"
DESCRIPTION = "Provides translations for the 'libKChart6-3' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.1"

RPM_NAME = "libKChart6-3-lang-3.0.1-1.10.noarch.rpm"
RPM_HASH = "dc969ec0a387bafaa33132db2922fbe4f60d1ccf6de56c4c1258e9d3fad619c17ba882fa09227dc5e39167eec0c9a7827955f64de24aaf33b4e96fd04e249113"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKChart6-3-lang \
libKChart6-3-lang-all \
locale-libKChart6-3-ar \
locale-libKChart6-3-bg \
locale-libKChart6-3-bs \
locale-libKChart6-3-ca \
locale-libKChart6-3-ca@valencia \
locale-libKChart6-3-cs \
locale-libKChart6-3-de \
locale-libKChart6-3-el \
locale-libKChart6-3-en-GB \
locale-libKChart6-3-eo \
locale-libKChart6-3-es \
locale-libKChart6-3-et \
locale-libKChart6-3-eu \
locale-libKChart6-3-fi \
locale-libKChart6-3-fr \
locale-libKChart6-3-gl \
locale-libKChart6-3-ia \
locale-libKChart6-3-it \
locale-libKChart6-3-ja \
locale-libKChart6-3-ka \
locale-libKChart6-3-ko \
locale-libKChart6-3-lt \
locale-libKChart6-3-nl \
locale-libKChart6-3-nn \
locale-libKChart6-3-pl \
locale-libKChart6-3-pt \
locale-libKChart6-3-pt-BR \
locale-libKChart6-3-ro \
locale-libKChart6-3-ru \
locale-libKChart6-3-sk \
locale-libKChart6-3-sl \
locale-libKChart6-3-sv \
locale-libKChart6-3-tr \
locale-libKChart6-3-uk \
locale-libKChart6-3-zh-CN \
locale-libKChart6-3-zh-TW"

RDEPENDS:${PN} += "libKChart6-3"

inherit rpm
