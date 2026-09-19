SUMMARY = "Microsoft Corporation Azure Planetarycomputer Client Library for Python"
DESCRIPTION = "The Azure Planetary Computer client library provides programmatic access to \
Microsoft Planetary Computer Pro, a geospatial data management service built \
on Azure's hyperscale infrastructure. Microsoft Planetary Computer Pro \
empowers organizations to unlock the full potential of geospatial data by \
providing foundational capabilities to ingest, manage, search, and distribute \
geospatial datasets using the SpatioTemporal Asset Catalog (STAC) open specification. \
 \
This client library enables developers to interact with GeoCatalog resources, \
supporting workflows from gigabytes to tens of petabytes of geospatial data."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python313-azure-planetarycomputer-1.0.0~b1-1.3.noarch.rpm"
RPM_HASH = "36f339b60ab7796b96d98b352c9c4c5c8567c8f4c5232adc0c8d731a9fdbaa558e5acd088f656eeb77e8aae46a44cd559ee2a82736be39f3012487f2e84af4c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-planetarycomputer \
python3.13dist-azure-planetarycomputer \
python313-azure-planetarycomputer \
python3dist-azure-planetarycomputer"

RDEPENDS:${PN} += "-python313-azure-core >= 1.35.0 with python313-azure-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
