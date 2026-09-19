SUMMARY = "Documentation for the GNU compiler collection"
DESCRIPTION = "GNU info-pages for the GNU compiler collection covering both user-level \
and internals documentation."
LICENSE = "GFDL-1.2-only"

PV = "7.5.0+r278197"

RPM_NAME = "gcc7-info-7.5.0+r278197-24.3.noarch.rpm"
RPM_HASH = "fd37faa216943ea716ad9445ebf5c1c044785db3c03705e33e9fec886de99d71b31aa61ce1b5ee213c74382458fa5ab7f07f90878d5a271fe4239c9531691440"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gcc7-info"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
