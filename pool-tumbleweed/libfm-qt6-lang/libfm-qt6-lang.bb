SUMMARY = "Translations for package libfm-qt6"
DESCRIPTION = "Provides translations for the 'libfm-qt6' package."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "2.4.0"

RPM_NAME = "libfm-qt6-lang-2.4.0-1.6.noarch.rpm"
RPM_HASH = "57e684c59ab826b885ff6069edad308986fd9c16bc280173de11e5a355139048eb2307071805072076ed4186800e79099339c60cad0d92f9460492ed9b555c4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libfm-qt6-lang \
libfm-qt6-lang-all"

RDEPENDS:${PN} += "libfm-qt6"

inherit rpm
