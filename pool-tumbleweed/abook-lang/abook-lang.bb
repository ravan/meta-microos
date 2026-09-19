SUMMARY = "Translations for package abook"
DESCRIPTION = "Provides translations for the 'abook' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.1"

RPM_NAME = "abook-lang-0.6.1-4.5.noarch.rpm"
RPM_HASH = "cd559f679dbcae1c61e0057badfa440aabc75c7d96c6a2508860b494fc3a7072094d2d8d65a406453a5bea0fcf256936c9ef11153e37a9f1571430e3a33a5f90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "abook-lang \
abook-lang-all \
locale-abook-de \
locale-abook-fr \
locale-abook-it \
locale-abook-ja \
locale-abook-sv"

RDEPENDS:${PN} += "abook"

inherit rpm
