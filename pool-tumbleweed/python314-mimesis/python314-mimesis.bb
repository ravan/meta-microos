SUMMARY = "Fake data generator"
DESCRIPTION = "Mimesis is a package for Python, which helps generate big volumes of \
fake data for a variety of purposes in a variety of languages. The \
fake data could be used to populate a testing database, create JSON \
and XML files, anonymize data taken from production and etc."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python314-mimesis-4.0.0-2.5.noarch.rpm"
RPM_HASH = "ddbaadb658741887cd90201ee33693af930ca764744fb59f6289a975cf0188ecf2c48d7a6bf14b40bd72ef9161fdcc8a717bcbc9b76d38756aa866c9b6005783"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-mimesis \
python314-mimesis \
python3dist-mimesis"

RDEPENDS:${PN} += "python-abi"

inherit rpm
