SUMMARY = "Translations for package libqt5keychain1"
DESCRIPTION = "Provides translations for the 'libqt5keychain1' package."
LICENSE = "BSD-2-Clause"

PV = "0.17.0"

RPM_NAME = "libqt5keychain1-lang-0.17.0-1.1.noarch.rpm"
RPM_HASH = "03de98bf98b1770c442355485c03f4fd14dc53ca8cb6371c1d9ce9bf47325ecee0e0b9ee7083fa7b0e54942cce4f7c558591c9fb0a0affce09844b3ba3cb158c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5keychain1-lang \
libqt5keychain1-lang-all"

RDEPENDS:${PN} += "libqt5keychain1"

inherit rpm
