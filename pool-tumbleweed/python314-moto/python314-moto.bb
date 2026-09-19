SUMMARY = "Library to mock out tests based on AWS"
DESCRIPTION = "A library that allows your python tests to mock out AWS Services"
LICENSE = "Apache-2.0"

PV = "5.2.1"

RPM_NAME = "python314-moto-5.2.1-1.2.noarch.rpm"
RPM_HASH = "39e3c6ab7d50acbdbc48b19da83d4114eae0034c087f4e593904f5c59985922484b0870a0cf73d106750fd792e49e616909188f745a8604e97fd5eac4dd74fab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-moto \
python314-moto \
python3dist-moto"

RDEPENDS:${PN} += "-python314-python-dateutil >= 2.1 with python314-python-dateutil < 3 \
/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-Jinja2 \
python314-Werkzeug \
python314-boto3 \
python314-botocore \
python314-cryptography \
python314-requests \
python314-responses \
python314-xmltodict \
update-alternatives"

inherit rpm
