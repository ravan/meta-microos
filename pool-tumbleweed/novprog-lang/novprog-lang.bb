SUMMARY = "Translations for package novprog"
DESCRIPTION = "Provides translations for the 'novprog' package."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.7"

RPM_NAME = "novprog-lang-3.2.7-1.1.noarch.rpm"
RPM_HASH = "b4b9ce164f3a10111dd820aec7fc9d7c25397264b72af0700dad567ea217ecec6c421332b60e1101354c8df6ad1ac977129012f3a3becb64b6a5d62cf702a09b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "novprog-lang \
novprog-lang-all"

RDEPENDS:${PN} += "novprog"

inherit rpm
