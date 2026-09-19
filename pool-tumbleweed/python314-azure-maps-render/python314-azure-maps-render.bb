SUMMARY = "Microsoft Azure Maps Render Client Library for Python"
DESCRIPTION = "This package contains a Python SDK for Azure Maps Services for Render."
LICENSE = "MIT"

PV = "1.0.0~b2"

RPM_NAME = "python314-azure-maps-render-1.0.0~b2-2.9.noarch.rpm"
RPM_HASH = "9a1daeb6ff77594fc608dd11aae6f8540e449eef1a9ba8ed3e00aadfcfacec9a9825e9b26d5fe1bf8fe7a4483ba91612d6c4c3cea6be045c64d7cb941b8dcd46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-maps-render \
python314-azure-maps-render \
python3dist-azure-maps-render"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0 \
-python314-azure-mgmt-core >= 1.3.0 with python314-azure-mgmt-core < 2.0.0 \
python-abi \
python314-azure-nspkg \
python314-msrest \
python314-requests"

inherit rpm
