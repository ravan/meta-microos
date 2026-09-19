SUMMARY = "Microsoft Azure Maps Geolocation Client Library for Python"
DESCRIPTION = "This package contains a Python SDK for Azure Maps Services for Geolocation."
LICENSE = "MIT"

PV = "1.0.0~b3"

RPM_NAME = "python314-azure-maps-geolocation-1.0.0~b3-1.8.noarch.rpm"
RPM_HASH = "1e8e940a2623dfa7d2a461636af493e66a851a5880628d4c575a24b317899cdc2d843b9b029f613440cafcae8dde5eb08c1237b70f1b472df43bd1ee30c2146c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-maps-geolocation \
python314-azure-maps-geolocation \
python3dist-azure-maps-geolocation"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0 \
-python314-azure-mgmt-core >= 1.3.0 with python314-azure-mgmt-core < 2.0.0 \
python-abi \
python314-azure-nspkg \
python314-msrest"

inherit rpm
