SUMMARY = "SQLAlchemy backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the SQLAlchemy backend for python314-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.14.0"

RPM_NAME = "python314-aws-xray-sdk-SQLAlchemy-2.14.0-2.3.noarch.rpm"
RPM_HASH = "b3ab4c36ade40e7c02b4d07e050776ac7db20d4d2b8d42baf764a44985cca5b7396363c5d6ad96ae80da01a16da8a997d2773d3d49d96e8f8d7a488aefa9bb7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-aws-xray-sdk-SQLAlchemy"

RDEPENDS:${PN} += "python-abi \
python314-SQLAlchemy \
python314-aws-xray-sdk"

inherit rpm
