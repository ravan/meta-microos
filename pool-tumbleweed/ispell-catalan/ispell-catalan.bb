SUMMARY = "Catalan ispell dictionary"
DESCRIPTION = "This package includes a ready Catalan dictionary for ispell. A short \
usage description for ispell is given in \
/usr/share/doc/packages/ispell/README of the package ispell. The \
sources for this dictionary are included in the package dicts."
LICENSE = "SUSE-Permissive"

PV = "1.5"

RPM_NAME = "ispell-catalan-1.5-426.1.aarch64.rpm"
RPM_HASH = "551d857ff4e74455d3ce379902499ef16cda8d1390ca913d538a90c28815cc0e45e9080c537607a9ff6e24d48aeecda5bea367a31b40fd91c47477ab0a7e92dc"

RPROVIDES:${PN} += "icatalan \
ispell-catalan \
ispell-dictionary \
locale-ispell-ca"

RDEPENDS:${PN} += ""

inherit rpm
