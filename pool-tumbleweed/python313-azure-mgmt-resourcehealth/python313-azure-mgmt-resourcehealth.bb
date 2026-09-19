SUMMARY = "Microsoft Azure ResourceHealth Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure ResourceHealth Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b7"

RPM_NAME = "python313-azure-mgmt-resourcehealth-1.0.0b7-1.1.noarch.rpm"
RPM_HASH = "7e2a6fe3609fafd92cad2bd63f6230ef53ac16841d95fb389c3a5471104d155658127414479198dcc337f8658162a7188a2a53dca1bd0f711b9135b6864b6c6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-resourcehealth \
python3.13dist-azure-mgmt-resourcehealth \
python313-azure-mgmt-resourcehealth \
python3dist-azure-mgmt-resourcehealth"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
