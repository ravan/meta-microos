SUMMARY = "Translations for package swappy"
DESCRIPTION = "Provides translations for the 'swappy' package."
LICENSE = "MIT"

PV = "1.8.0"

RPM_NAME = "swappy-lang-1.8.0-1.6.noarch.rpm"
RPM_HASH = "22f51a5d078c6db28015cf9088300093ccc1740fe49ad3f8f2817644f53e09443de7e07e9081cf46673e7e7f31eca9fc73b3f5874145573654bd17a0817aaa9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-swappy-de \
locale-swappy-en \
locale-swappy-fr \
locale-swappy-pt-BR \
locale-swappy-tr \
locale-swappy-zh-CN \
swappy-lang \
swappy-lang-all"

RDEPENDS:${PN} += "swappy"

inherit rpm
