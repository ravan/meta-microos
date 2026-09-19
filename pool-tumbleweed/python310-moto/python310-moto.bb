SUMMARY = "Library to mock out tests based on AWS"
DESCRIPTION = "A library that allows your python tests to mock out AWS Services"
LICENSE = "Apache-2.0"

PV = "4.1.0"

RPM_NAME = "python310-moto-4.1.0-1.1.noarch.rpm"
RPM_HASH = "843843b23fa4972c4b418aacfaa48fe94fe25fb9240019a7911d895d96d18d78c261f55f06e787a4983236a5558ed53eb45ec97d910409a6cb6efb7687515f21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-moto \
python3.10dist-moto \
python310-moto \
python3dist-moto"

RDEPENDS:${PN} += "-python310-python-dateutil >= 2.1 with python310-python-dateutil < 3 \
/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-Jinja2 \
python310-Werkzeug \
python310-boto3 \
python310-botocore \
python310-cryptography \
python310-requests \
python310-responses \
python310-xmltodict \
update-alternatives"

inherit rpm
