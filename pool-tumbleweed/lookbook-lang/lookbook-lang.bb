SUMMARY = "Translations for package lookbook"
DESCRIPTION = "Provides translations for the 'lookbook' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.0"

RPM_NAME = "lookbook-lang-1.2.0-2.8.noarch.rpm"
RPM_HASH = "4365854a2cb02f3b92d0fdc9487ae7f7499e85918cc33d8cd8ba1700d88d6bcebad1221cb0e32b96395bc17cedff2461f9c050abc3413f4e98e08aa84aa94770"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-lookbook-fr \
locale-lookbook-pt \
lookbook-lang \
lookbook-lang-all"

RDEPENDS:${PN} += "lookbook"

inherit rpm
