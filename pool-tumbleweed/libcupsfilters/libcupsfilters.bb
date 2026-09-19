SUMMARY = "OpenPrinting libcupsfilters provides CUPS filters as library functions"
DESCRIPTION = "This package provides the libcupsfilters library, \
which in its 2.x version contains all the code \
of the filters of the former cups-filters package \
as library functions, the so-called filter functions."
LICENSE = "Apache-2.0"

PV = "2.1.1"

RPM_NAME = "libcupsfilters-2.1.1-2.1.aarch64.rpm"
RPM_HASH = "4238996eadbbc21d3138cc52d8c7e35bef094cdd9ee327b5a85fc2941bddcd65b51dbe6cdee53cd6aea2a59410d022d8da9af08be93112278b1a2223de3b36e5"

RPROVIDES:${PN} += "libcupsfilters"

RDEPENDS:${PN} += ""

inherit rpm
