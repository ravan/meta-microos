SUMMARY = "Library to mock out tests based on AWS"
DESCRIPTION = "A library that allows your python tests to mock out AWS Services"
LICENSE = "Apache-2.0"

PV = "4.1.0"

RPM_NAME = "python38-moto-4.1.0-1.1.noarch.rpm"
RPM_HASH = "01aaa07fde36b4b3db6b90426530d55f008fe51f34008686555eac1e92f5f7a8e093a98cbd7364c2803b56690f9ae4d62155b60c8df7bd3ae97e0e166d5829cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.8dist-moto \
python38-moto \
python3dist-moto"

RDEPENDS:${PN} += "-python38-python-dateutil >= 2.1 with python38-python-dateutil < 3 \
/usr/bin/python3.8 \
/usr/bin/sh \
python-abi \
python38-Jinja2 \
python38-Werkzeug \
python38-boto3 \
python38-botocore \
python38-cryptography \
python38-requests \
python38-responses \
python38-xmltodict \
update-alternatives"

inherit rpm
