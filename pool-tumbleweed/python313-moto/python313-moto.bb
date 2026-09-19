SUMMARY = "Library to mock out tests based on AWS"
DESCRIPTION = "A library that allows your python tests to mock out AWS Services"
LICENSE = "Apache-2.0"

PV = "5.2.1"

RPM_NAME = "python313-moto-5.2.1-1.2.noarch.rpm"
RPM_HASH = "b080be531044b75e42cc53de2a9b11a409f1884e6860173710a56bdc7d9f31ef6c3a656e7c74f45ce18e0fbba25146f13ddfcd7a06809a57c2c626a7b8ef407c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-moto \
python3.13dist-moto \
python313-moto \
python3dist-moto"

RDEPENDS:${PN} += "-python313-python-dateutil >= 2.1 with python313-python-dateutil < 3 \
/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-Jinja2 \
python313-Werkzeug \
python313-boto3 \
python313-botocore \
python313-cryptography \
python313-requests \
python313-responses \
python313-xmltodict \
update-alternatives"

inherit rpm
