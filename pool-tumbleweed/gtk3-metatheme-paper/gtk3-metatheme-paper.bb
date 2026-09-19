SUMMARY = "The 'Paper' theme for Gtk3"
DESCRIPTION = "Paper is a modern desktop theme suite. Its design is mostly flat \
with a minimal use of shadows for depth."
LICENSE = "GPL-3.0+"

PV = "2.1.0"

RPM_NAME = "gtk3-metatheme-paper-2.1.0-2.24.noarch.rpm"
RPM_HASH = "f3ebf11dbc53daccf1089c87499347cca866402ac5b3bb85b5a0cd780c56652dbf5fec8ef50bea1a18d6b98f03532a29811212f089bcaa2f24f2087c408d4fe4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk3-metatheme-paper"

RDEPENDS:${PN} += "metatheme-paper-common"

inherit rpm
