SUMMARY = "Microsoft Azure Resiliencemanagement Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Resiliencemanagement Management Client Library. \
 \
This package has been tested with Python 3.10+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python314-azure-mgmt-resiliencemanagement-1.0.0~b1-1.2.noarch.rpm"
RPM_HASH = "932c8cad200d7df2b37efff3e85995c0e4fcb5392b4a8f7dcaec034a8252090300e2326f4fe310a19bf4ccb302fc4df3e0f4e3691cdcb102274eb4208e582f5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-resiliencemanagement \
python314-azure-mgmt-resiliencemanagement \
python3dist-azure-mgmt-resiliencemanagement"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
