SUMMARY = "Documentation for the OpenStack Oslo Cache library"
DESCRIPTION = "Documentation for the OpenStack Oslo cache library."
LICENSE = "Apache-2.0"

PV = "4.3.0"

RPM_NAME = "python-oslo.cache-doc-4.3.0-1.1.noarch.rpm"
RPM_HASH = "66ef568a294f24fb79764aa102191564db4aec916b7ff2cfdbaf863ebf7f22064c648a2c81163a266aebeaef2d40beeb416cb892df2808de0160c07505210dc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-oslo.cache-doc"

RDEPENDS:${PN} += ""

inherit rpm
