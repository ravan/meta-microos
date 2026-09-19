SUMMARY = "OCI Registry as Storage Python SDK"
DESCRIPTION = "OCI Registry as Storage Python SDK"
LICENSE = "Apache-2.0"

PV = "0.2.43"

RPM_NAME = "python313-oras-0.2.43-1.1.noarch.rpm"
RPM_HASH = "55b0339104ad6342513d7e95ecc8f94913705ba8ba29bb524f6792067ecc82574312fb120d20aca74a52e5e2044dae90c3b8ce25b4290732e7818f12c01dd4f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oras \
python3.13dist-oras \
python313-oras \
python3dist-oras"

RDEPENDS:${PN} += "/usr/bin/bash \
python-abi \
python313-boto3 \
python313-jsonschema \
python313-requests"

inherit rpm
