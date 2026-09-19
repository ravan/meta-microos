SUMMARY = "Translations for package francis"
DESCRIPTION = "Provides translations for the 'francis' package."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "francis-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "816f0bd1022f0cf9bf8c80d7d4960a7be729f17c87e752d563af03c04eeb21242fcd59e43fc0cd6bb927dc5b716f8ccfd1fc4f5651b359adbb8d7acc6f424db0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "francis-lang \
francis-lang-all \
locale-francis-ar \
locale-francis-ast \
locale-francis-ca \
locale-francis-ca@valencia \
locale-francis-cs \
locale-francis-de \
locale-francis-en-GB \
locale-francis-eo \
locale-francis-es \
locale-francis-eu \
locale-francis-fi \
locale-francis-fr \
locale-francis-ga \
locale-francis-gl \
locale-francis-he \
locale-francis-hi \
locale-francis-hu \
locale-francis-ia \
locale-francis-it \
locale-francis-ja \
locale-francis-ka \
locale-francis-ko \
locale-francis-lt \
locale-francis-lv \
locale-francis-nl \
locale-francis-nn \
locale-francis-pl \
locale-francis-pt \
locale-francis-pt-BR \
locale-francis-ro \
locale-francis-ru \
locale-francis-sk \
locale-francis-sl \
locale-francis-sv \
locale-francis-tr \
locale-francis-ug \
locale-francis-uk \
locale-francis-zh-CN \
locale-francis-zh-TW"

RDEPENDS:${PN} += "francis"

inherit rpm
