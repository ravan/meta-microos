SUMMARY = "Translations for package libKGantt6-3"
DESCRIPTION = "Provides translations for the 'libKGantt6-3' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.1"

RPM_NAME = "libKGantt6-3-lang-3.0.1-1.10.noarch.rpm"
RPM_HASH = "59489d4e073dd94a26abaac7993b2fda2d6e59e04bf1cecf61675343d2614c0477559d7aa399cca03143d76a6e7fdbdaa8c9448d333b801af63200aaf221e0f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKGantt6-3-lang \
libKGantt6-3-lang-all \
locale-libKGantt6-3-ar \
locale-libKGantt6-3-bg \
locale-libKGantt6-3-bs \
locale-libKGantt6-3-ca \
locale-libKGantt6-3-ca@valencia \
locale-libKGantt6-3-cs \
locale-libKGantt6-3-da \
locale-libKGantt6-3-de \
locale-libKGantt6-3-el \
locale-libKGantt6-3-en-GB \
locale-libKGantt6-3-eo \
locale-libKGantt6-3-es \
locale-libKGantt6-3-et \
locale-libKGantt6-3-eu \
locale-libKGantt6-3-fi \
locale-libKGantt6-3-fr \
locale-libKGantt6-3-gl \
locale-libKGantt6-3-ia \
locale-libKGantt6-3-it \
locale-libKGantt6-3-ja \
locale-libKGantt6-3-ka \
locale-libKGantt6-3-ko \
locale-libKGantt6-3-lt \
locale-libKGantt6-3-nl \
locale-libKGantt6-3-nn \
locale-libKGantt6-3-pl \
locale-libKGantt6-3-pt \
locale-libKGantt6-3-pt-BR \
locale-libKGantt6-3-ru \
locale-libKGantt6-3-sk \
locale-libKGantt6-3-sl \
locale-libKGantt6-3-sv \
locale-libKGantt6-3-tr \
locale-libKGantt6-3-uk \
locale-libKGantt6-3-zh-CN \
locale-libKGantt6-3-zh-TW"

RDEPENDS:${PN} += "libKGantt6-3"

inherit rpm
