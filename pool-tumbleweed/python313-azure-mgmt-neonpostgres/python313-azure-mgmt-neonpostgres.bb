SUMMARY = "Microsoft Azure Neonpostgres Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Neonpostgres Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python313-azure-mgmt-neonpostgres-1.0.1-1.3.noarch.rpm"
RPM_HASH = "fec624dbabfcffca3f2488416f17d4b44b9362f9549cdf70a1e6b600b976425e7005b173369c8a413556b64f127d388c043fc0bc1b5543232c414090395be73b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-neonpostgres \
python3.13dist-azure-mgmt-neonpostgres \
python313-azure-mgmt-neonpostgres \
python3dist-azure-mgmt-neonpostgres"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
