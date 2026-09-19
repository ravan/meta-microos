SUMMARY = "Documentation for pnetcdf"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains the documentation for PnetCDF."
LICENSE = "NetCDF"

PV = "1.14.1"

RPM_NAME = "pnetcdf-doc-1.14.1-1.3.noarch.rpm"
RPM_HASH = "5d31b3b24f01b529f37c28a1ad7ef50ae98dbdd7fb1bd8123f744de61c3405905cf32eabe1066b6e1b762c25c54f641a841611405dca0c6846637f9edd6ee98b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pnetcdf-doc"

RDEPENDS:${PN} += ""

inherit rpm
