SUMMARY = "Microsoft Azure Stream Analytics Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Stream Analytics Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python314-azure-mgmt-streamanalytics-1.0.0.0-3.9.noarch.rpm"
RPM_HASH = "f16a5e9fb3e682449bcccb920fa5c7f4fd77182353034706929ac02870b8414ab8ffb7deceba9f133bcd86a88c44f8011419c3718462caa36d0c290fde2f7a29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-streamanalytics \
python314-azure-mgmt-streamanalytics \
python3dist-azure-mgmt-streamanalytics"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.0 with python314-azure-mgmt-core < 2.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-msrest"

inherit rpm
