SUMMARY = "Microsoft Azure Appcontainers Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Appcontainers Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "3.2.0"

RPM_NAME = "python313-azure-mgmt-appcontainers-3.2.0-1.5.noarch.rpm"
RPM_HASH = "b39deb52a3539c3cfedb584eeeaf94ce0e641175299cbc4291a7ccf5e946778ae69e6f90a0d90829a70babca1add7df88e8f174f65115afccef61a62ffc16998"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-appcontainers \
python3.13dist-azure-mgmt-appcontainers \
python313-azure-mgmt-appcontainers \
python3dist-azure-mgmt-appcontainers"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
