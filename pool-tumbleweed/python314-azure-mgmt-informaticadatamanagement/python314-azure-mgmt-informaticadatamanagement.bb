SUMMARY = "Microsoft Azure Informaticadatamanagement Management Client Library for Python"
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-azure-mgmt-informaticadatamanagement-1.0.0-1.9.noarch.rpm"
RPM_HASH = "f12d1f849d265b0bc013b96f29074fbae8d395deb95138abb0d77b0e51e1d68b3e75c528e2349b9d70dc8cc338127a69311fd7ff150299315417235449c1e376"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-informaticadatamanagement \
python314-azure-mgmt-informaticadatamanagement \
python3dist-azure-mgmt-informaticadatamanagement"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
