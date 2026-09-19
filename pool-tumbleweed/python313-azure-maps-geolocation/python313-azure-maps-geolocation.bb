SUMMARY = "Microsoft Azure Maps Geolocation Client Library for Python"
DESCRIPTION = "This package contains a Python SDK for Azure Maps Services for Geolocation."
LICENSE = "MIT"

PV = "1.0.0~b3"

RPM_NAME = "python313-azure-maps-geolocation-1.0.0~b3-1.8.noarch.rpm"
RPM_HASH = "5adc5bad7008bb4d36779dcfaac019273aad1d7723e6e1714dc807f147f1432a59bd8d6b2d05eb09e229d62a7cfdb48d3d2b46ebe068db6ff76ea88565aba350"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-maps-geolocation \
python3.13dist-azure-maps-geolocation \
python313-azure-maps-geolocation \
python3dist-azure-maps-geolocation"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0 \
-python313-azure-mgmt-core >= 1.3.0 with python313-azure-mgmt-core < 2.0.0 \
python-abi \
python313-azure-nspkg \
python313-msrest"

inherit rpm
