SUMMARY = "Python implementation of the SOFA Convention"
DESCRIPTION = "pysofaconventions is a python implementation of the SOFA Specification."
LICENSE = "BSD-3-Clause"

PV = "0.1.5"

RPM_NAME = "python313-pysofaconventions-0.1.5-3.5.noarch.rpm"
RPM_HASH = "d63ffeb7e5366a19de87fd8afa901a55a585859fb944badaf3bdada9835925c25d90901664f978b4a0fa7758e2d81971c07ee19bec1b15073588076637069835"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pysofaconventions \
python3.13dist-pysofaconventions \
python313-pysofaconventions \
python3dist-pysofaconventions"

RDEPENDS:${PN} += "python-abi \
python313-netCDF4"

inherit rpm
