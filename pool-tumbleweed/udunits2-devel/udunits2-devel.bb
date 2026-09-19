SUMMARY = "Headers and development libraries for udunits2"
DESCRIPTION = "This package contains the files needed for compiling programs using \
the udunits2 library."
LICENSE = "MIT"

PV = "2.2.28"

RPM_NAME = "udunits2-devel-2.2.28-2.8.aarch64.rpm"
RPM_HASH = "8b30e20adffea2767a5e80243cac08c3cbe743cacd65cc86576eac51a1cbee9e349cf4d74ea7ba3a9e5ffee979362e324fefe2b7b6f84bf025c48bc4f73e8f8e"

RPROVIDES:${PN} += "udunits2-devel"

RDEPENDS:${PN} += "udunits2"

inherit rpm
