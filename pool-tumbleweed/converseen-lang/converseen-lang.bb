SUMMARY = "Translations for package converseen"
DESCRIPTION = "Provides translations for the 'converseen' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.15.0.3"

RPM_NAME = "converseen-lang-0.15.0.3-1.6.noarch.rpm"
RPM_HASH = "f6bc299cad8c0a9207e21543267157da2cfd0414c1a62cb31425383a561d6ae129740bc9f02f0ec7c6b6733be0e386c51c10e456a1a5d12d976d56475ec319db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "converseen-lang \
converseen-lang-all"

RDEPENDS:${PN} += "converseen"

inherit rpm
