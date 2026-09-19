SUMMARY = "SQLAlchemy backend for the AWS X-Ray Python SDK"
DESCRIPTION = "The AWS X-Ray SDK for Python enables Python developers to record and \
emit information from within their applications to the AWS X-Ray service. \
 \
This package provides the SQLAlchemy backend for python313-aws-xray-sdk."
LICENSE = "Apache-2.0"

PV = "2.14.0"

RPM_NAME = "python313-aws-xray-sdk-SQLAlchemy-2.14.0-2.3.noarch.rpm"
RPM_HASH = "4f0cf9e9f203fe06b610856b84210437790cb254b56b1fa71fc875e4dbc36221683a9ecdc885f96163968e55e1e6942a8b1c975e5d3a8d90e9f96f5a28937c53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aws-xray-sdk-SQLAlchemy \
python313-aws-xray-sdk-SQLAlchemy"

RDEPENDS:${PN} += "python-abi \
python313-SQLAlchemy \
python313-aws-xray-sdk"

inherit rpm
