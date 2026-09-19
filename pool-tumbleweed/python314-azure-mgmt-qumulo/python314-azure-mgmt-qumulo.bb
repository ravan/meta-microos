SUMMARY = "Microsoft Azure Qumulo Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Qumulo Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python314-azure-mgmt-qumulo-3.0.0-1.2.noarch.rpm"
RPM_HASH = "e71b6690e94aa9a4bc54f42e64a442887ce2f8e026b915078947e14200232bc85b6f999b13ebb6ade23a3f1e9ce1ceb6bf5c38520df071f92f2f9130bb49fb9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-qumulo \
python314-azure-mgmt-qumulo \
python3dist-azure-mgmt-qumulo"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
