SUMMARY = "Manipulate datetime objects relative to time zones"
DESCRIPTION = "Python helpers for manipulating datetime objects relative to time zones."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python313-fleming-0.7.0-2.10.noarch.rpm"
RPM_HASH = "a3ac21162795c1f7ccc01f0707c1284db8e9a8294337ff318d8e7dd94780bdc9c13207ee382b92b87db77b192e179daba03042e62bc97029bf7c7d40b7884389"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fleming \
python3.13dist-fleming \
python313-fleming \
python3dist-fleming"

RDEPENDS:${PN} += "python-abi \
python313-python-dateutil \
python313-pytz"

inherit rpm
