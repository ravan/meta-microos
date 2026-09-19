SUMMARY = "Microsoft Azure Storagediscovery Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Storagediscovery Management Client Library. \
 \
This package has been tested with Python 3.9+"
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python314-azure-mgmt-storagediscovery-1.0.1-1.3.noarch.rpm"
RPM_HASH = "1d195fb5faccd7386767f3ded3b6e487a4623448ca38e94d3e11217c1c608b6108a4cc0fa689a019fcc267de70a10f016db3d5aa7922bc596f32c202f4602962"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-storagediscovery \
python314-azure-mgmt-storagediscovery \
python3dist-azure-mgmt-storagediscovery"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
