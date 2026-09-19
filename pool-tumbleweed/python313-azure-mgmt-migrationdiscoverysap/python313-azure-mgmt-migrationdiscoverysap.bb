SUMMARY = "Microsoft Azure Migrationdiscoverysap Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Migrationdiscoverysap Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python313-azure-mgmt-migrationdiscoverysap-1.0.0~b1-1.5.noarch.rpm"
RPM_HASH = "12cbb9f300be9ddcd4dc455e95be08f151024fc5fc0650d6f6288487753632d2f453c7a32319274fc19c42e12a7e710c1f978a33dab081bd2dbdc9dff95e3deb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-migrationdiscoverysap \
python3.13dist-azure-mgmt-migrationdiscoverysap \
python313-azure-mgmt-migrationdiscoverysap \
python3dist-azure-mgmt-migrationdiscoverysap"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg"

inherit rpm
