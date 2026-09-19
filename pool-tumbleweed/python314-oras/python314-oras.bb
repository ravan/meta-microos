SUMMARY = "OCI Registry as Storage Python SDK"
DESCRIPTION = "OCI Registry as Storage Python SDK"
LICENSE = "Apache-2.0"

PV = "0.2.43"

RPM_NAME = "python314-oras-0.2.43-1.1.noarch.rpm"
RPM_HASH = "f9badbfe09e2a65ab683527c0f6fdbe4c21f253b55396dcce3ff572c4d5f604c2d82b981e0b4581cd1addcf5b98361ebed09b0daf2e6a546b9bfb3f7320f85ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-oras \
python314-oras \
python3dist-oras"

RDEPENDS:${PN} += "/usr/bin/bash \
python-abi \
python314-boto3 \
python314-jsonschema \
python314-requests"

inherit rpm
