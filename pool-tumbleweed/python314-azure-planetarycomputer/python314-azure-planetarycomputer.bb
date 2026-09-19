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

RPM_NAME = "python314-azure-planetarycomputer-1.0.0~b1-1.3.noarch.rpm"
RPM_HASH = "50ec446cdb650db350717000fc7ae4ea85575189c7af92a452fc733c6418167430c78d50a3699416be41836daba736b36484a79a09a22598545a5b7a7792b74f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-planetarycomputer \
python314-azure-planetarycomputer \
python3dist-azure-planetarycomputer"

RDEPENDS:${PN} += "-python314-azure-core >= 1.35.0 with python314-azure-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
