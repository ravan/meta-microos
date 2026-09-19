SUMMARY = "Microsoft Azure Recovery Services Backup Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Recovery Services Backup Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "9.2.0"

RPM_NAME = "python313-azure-mgmt-recoveryservicesbackup-9.2.0-2.1.noarch.rpm"
RPM_HASH = "af24ac940477614b0a3a76068909589cb88e8597220f4a57eb8a1424c0f86453e552588c9b42f9480d5ac943ce08f27138bf845dd4aea02eea55797b5d08138b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-recoveryservicesbackup \
python3.13dist-azure-mgmt-recoveryservicesbackup \
python313-azure-mgmt-recoveryservicesbackup \
python3dist-azure-mgmt-recoveryservicesbackup"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
