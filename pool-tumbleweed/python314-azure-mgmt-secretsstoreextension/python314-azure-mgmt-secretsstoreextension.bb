SUMMARY = "Microsoft Azure Secretsstoreextension Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Secretsstoreextension Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python314-azure-mgmt-secretsstoreextension-1.0.0~b1-1.4.noarch.rpm"
RPM_HASH = "52392f452ab67798d7903985e31a14c3e97a39759fd9331168e970856769fd28dff0e36178830d3e94f8379cf5caf26caec34fcec91f143fdf2cebd560dc46f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-secretsstoreextension \
python314-azure-mgmt-secretsstoreextension \
python3dist-azure-mgmt-secretsstoreextension"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.5.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
