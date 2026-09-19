SUMMARY = "Microsoft Azure Qumulo Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Qumulo Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python313-azure-mgmt-qumulo-3.0.0-1.2.noarch.rpm"
RPM_HASH = "d3c2c9e143d44e3602ecead266e859745d53cb0697f2e15251f9cfe363c5ed71760f0758d82cd0d01aaa2c80d683af2428a7f606fd7c8bce214b6247376ab4f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-qumulo \
python3.13dist-azure-mgmt-qumulo \
python313-azure-mgmt-qumulo \
python3dist-azure-mgmt-qumulo"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
