SUMMARY = "Microsoft Azure Datadog Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Datadog Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python314-azure-mgmt-datadog-2.1.0-2.9.noarch.rpm"
RPM_HASH = "4f0c685463b544cfa66866dfed91363c031fa6c43ba112d9627267c8ec15b4423148086cc44db0edf29d03708bb47d6b717c04fa7ad765b9b7d42ee125fbe2f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-datadog \
python314-azure-mgmt-datadog \
python3dist-azure-mgmt-datadog"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg"

inherit rpm
