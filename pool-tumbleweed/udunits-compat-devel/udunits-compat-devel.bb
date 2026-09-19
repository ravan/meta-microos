SUMMARY = "Udunits2 compatibility layer for udunits v1 API"
DESCRIPTION = "This package contains the files needed for compiling programs using \
the udunits2 compatibility library."
LICENSE = "MIT"

PV = "2.2.28"

RPM_NAME = "udunits-compat-devel-2.2.28-2.8.aarch64.rpm"
RPM_HASH = "5487de52df7543d8254062607c66789fff4d668d03b58e1b74c567597476ce12062108e1b346afdb51496d32599785f4efaa63b94bf22c2ae55da66dfd799851"

RPROVIDES:${PN} += "udunits-compat-devel \
udunits-devel"

RDEPENDS:${PN} += "udunits-compat \
udunits2-devel"

inherit rpm
