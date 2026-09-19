SUMMARY = "Translations for package poxml"
DESCRIPTION = "Provides translations for the 'poxml' package."
LICENSE = "GFDL-1.2-only & GPL-2.0-only"

PV = "26.08.1"

RPM_NAME = "poxml-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "2bcf67775c6d04dc845dca67150026b4d19f7df4914e9ab33ba17b7b59d95406698ba4f209dbcbb4054e5a16cb84e7ef1820a56befaa2342ae81d591de9f664d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "poxml-lang \
poxml-lang-all"

RDEPENDS:${PN} += "poxml"

inherit rpm
