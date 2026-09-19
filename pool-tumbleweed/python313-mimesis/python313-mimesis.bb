SUMMARY = "Fake data generator"
DESCRIPTION = "Mimesis is a package for Python, which helps generate big volumes of \
fake data for a variety of purposes in a variety of languages. The \
fake data could be used to populate a testing database, create JSON \
and XML files, anonymize data taken from production and etc."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python313-mimesis-4.0.0-2.5.noarch.rpm"
RPM_HASH = "ce32a95484b2d4accf82d72695872546670ed556a00d56babf0dc49a2a0862921de0ecf0cb156af18e328b121c999623fbabfbb73454a917a82f18ab842547c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mimesis \
python3.13dist-mimesis \
python313-mimesis \
python3dist-mimesis"

RDEPENDS:${PN} += "python-abi"

inherit rpm
