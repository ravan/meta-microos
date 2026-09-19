SUMMARY = "psycopg2 backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the psycopg2 backend for python313-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.14.0"

RPM_NAME = "python313-aws-xray-sdk-psycopg2-2.14.0-2.3.noarch.rpm"
RPM_HASH = "1661afe620cf897c53915a1a7f521a38b1f6dfcd9c22d7ee844d49dd38baad668b8c50cc0f13f1a1bee257139d1cc866a014fa447b3fccdaf1e015024d57e0f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aws-xray-sdk-psycopg2 \
python313-aws-xray-sdk-psycopg2"

RDEPENDS:${PN} += "python-abi \
python313-aws-xray-sdk \
python313-psycopg2"

inherit rpm
