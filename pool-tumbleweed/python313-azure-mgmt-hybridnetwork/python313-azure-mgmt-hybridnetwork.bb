SUMMARY = "Microsoft Azure Hybridnetwork Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Hybridnetwork Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python313-azure-mgmt-hybridnetwork-2.0.0-2.9.noarch.rpm"
RPM_HASH = "4000c9ce42d866945ebb9ea2eb8d58f668c4cd1e36d1bcb49ecb9b9ebd48db8f7dfe4e4988ab558118e8b6d7bb1fac57dd566ebab5f79dd4bd072fa84c24a552"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-hybridnetwork \
python3.13dist-azure-mgmt-hybridnetwork \
python313-azure-mgmt-hybridnetwork \
python3dist-azure-mgmt-hybridnetwork"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg"

inherit rpm
