SUMMARY = "String processing utility functions"
DESCRIPTION = "*String::Util* provides a collection of small, handy functions for \
processing strings in various ways."
LICENSE = "MIT"

PV = "1.360.0"

RPM_NAME = "perl-String-Util-1.360.0-1.2.noarch.rpm"
RPM_HASH = "5072a937412e9c3b75f9d9557173b0fe4a9d35e00548a6d9e8c00503e40682fa30314a2960f5c03e2c28e45b5effa397aa83552dc095e6e743365529e39a83f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-String--Util \
perl-String-Util"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
