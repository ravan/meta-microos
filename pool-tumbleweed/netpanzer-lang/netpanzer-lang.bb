SUMMARY = "Translations for package netpanzer"
DESCRIPTION = "Provides translations for the 'netpanzer' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.1"

RPM_NAME = "netpanzer-lang-0.9.1-1.3.noarch.rpm"
RPM_HASH = "38a34eb669677a72fa2b1d0c2a4b8c8271f3ccecf5a6682da1852fc877d52069e3b77a6c91638b0413fd30a471b18cbb6613f71953c3068a34f976e3d37bd327"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-netpanzer-de \
locale-netpanzer-pt-BR \
netpanzer-lang \
netpanzer-lang-all"

RDEPENDS:${PN} += "netpanzer"

inherit rpm
