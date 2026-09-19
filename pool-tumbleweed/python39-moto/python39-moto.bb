SUMMARY = "Library to mock out tests based on AWS"
DESCRIPTION = "A library that allows your python tests to mock out AWS Services"
LICENSE = "Apache-2.0"

PV = "4.1.0"

RPM_NAME = "python39-moto-4.1.0-1.1.noarch.rpm"
RPM_HASH = "4f20fe59fba9d6c0b96a81c83114ce2d3b4e16d33525f211ad5fc1cd3a48cdd2ab362abcc58f129d4ce095ab465f26caf81148dc6af3d668a53d1eddd9bb015e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-moto \
python39-moto \
python3dist-moto"

RDEPENDS:${PN} += "-python39-python-dateutil >= 2.1 with python39-python-dateutil < 3 \
/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-Jinja2 \
python39-Werkzeug \
python39-boto3 \
python39-botocore \
python39-cryptography \
python39-requests \
python39-responses \
python39-xmltodict \
update-alternatives"

inherit rpm
