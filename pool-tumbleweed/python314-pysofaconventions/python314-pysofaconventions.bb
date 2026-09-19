SUMMARY = "Python implementation of the SOFA Convention"
DESCRIPTION = "pysofaconventions is a python implementation of the SOFA Specification."
LICENSE = "BSD-3-Clause"

PV = "0.1.5"

RPM_NAME = "python314-pysofaconventions-0.1.5-3.5.noarch.rpm"
RPM_HASH = "069c43bc72b9b0ad82801e2b5e2edc29ee9d2ba50750928e8a404d1bb1a742f85fe7d45b8e830357459c8014617e8bd27161d515e347b23f1e132f293a62c8d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pysofaconventions \
python314-pysofaconventions \
python3dist-pysofaconventions"

RDEPENDS:${PN} += "python-abi \
python314-netCDF4"

inherit rpm
