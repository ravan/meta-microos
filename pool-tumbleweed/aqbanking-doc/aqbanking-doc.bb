SUMMARY = "Library for Online Banking Functions and Financial Data Import/Export"
DESCRIPTION = "AqBanking is a generic OnlineBanking interface. It allows multiple \
backends (currently HBCI) and multiple frontends  (e.g. KDE, GNOME, \
console) to be used. \
 \
This package contains a handbook."
LICENSE = "SUSE-Free-Art-1.3"

PV = "6.9.2"

RPM_NAME = "aqbanking-doc-6.9.2-1.2.aarch64.rpm"
RPM_HASH = "d42cb135d7a0d912bc0c746ca95658ffae373d6bf4402f075474278f9dffab2e65c54becbfff81a427eda24f65880348697708d8da20062eef36b5d10ac321fb"

RPROVIDES:${PN} += "aqbanking-doc"

RDEPENDS:${PN} += "aqbanking"

inherit rpm
