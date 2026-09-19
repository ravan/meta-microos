SUMMARY = "Common files for the 'Paper' Gtk theme"
DESCRIPTION = "Paper is a modern desktop theme suite. Its design is mostly flat \
with a minimal use of shadows for depth."
LICENSE = "GPL-3.0+"

PV = "2.1.0"

RPM_NAME = "metatheme-paper-common-2.1.0-2.24.noarch.rpm"
RPM_HASH = "068644a8c9027910f4aa59abaccd10b5b6de7d58af0ff8113987b5788a54d2323e7ab8a6842ab3026559413186fb4cc1db8420cc4a2de25f8484f63b840b1e07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metatheme-paper-common \
paper-gtk-theme"

RDEPENDS:${PN} += ""

inherit rpm
