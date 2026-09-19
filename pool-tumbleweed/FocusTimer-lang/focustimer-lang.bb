SUMMARY = "Translations for package FocusTimer"
DESCRIPTION = "Provides translations for the 'FocusTimer' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.4"

RPM_NAME = "FocusTimer-lang-1.1.4-1.1.noarch.rpm"
RPM_HASH = "e79ec42543f44230558dc65cfbd354cb4c6a0449198d37f305636cfbf5d498a78d856ace0d5103dab869eea125af538a839d8481f6d01a9b8cd7488da33be097"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "FocusTimer-lang \
FocusTimer-lang-all \
locale-FocusTimer-id \
locale-FocusTimer-ka \
locale-FocusTimer-lt \
locale-FocusTimer-pl \
locale-FocusTimer-sv"

RDEPENDS:${PN} += "FocusTimer"

inherit rpm
