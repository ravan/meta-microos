SUMMARY = "The 'Paper' theme for Gtk2"
DESCRIPTION = "Paper is a modern desktop theme suite. Its design is mostly flat \
with a minimal use of shadows for depth."
LICENSE = "GPL-3.0+"

PV = "2.1.0"

RPM_NAME = "gtk2-metatheme-paper-2.1.0-2.24.noarch.rpm"
RPM_HASH = "779fff49efa3c07945718bf8f7cc7b3f1d8273f7e1197fb3f862dd860e61e0364117156df80e63556e1d6213171f2eccc85058c617b66b3751f616817a80c5b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-metatheme-paper"

RDEPENDS:${PN} += "metatheme-paper-common"

inherit rpm
