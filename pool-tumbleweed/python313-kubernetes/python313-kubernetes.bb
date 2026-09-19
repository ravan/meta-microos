SUMMARY = "Kubernetes python client"
DESCRIPTION = "Python client for kubernetes http://kubernetes.io/"
LICENSE = "Apache-2.0"

PV = "35.0.0"

RPM_NAME = "python313-kubernetes-35.0.0-2.4.noarch.rpm"
RPM_HASH = "c3d9a280f7a707be1efb399bbcbd773ccffd31c5129b103dbdb65ac5d20c03e23a4336120eb9e227bf5591dd863e1a45a39a0aa1512fc0c922b09804aa9fc683"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-kubernetes \
python3.13dist-kubernetes \
python313-kubernetes \
python3dist-kubernetes"

RDEPENDS:${PN} += "python-abi \
python313-PyYAML \
python313-certifi \
python313-durationpy \
python313-google-auth \
python313-oauthlib \
python313-python-dateutil \
python313-requests \
python313-requests-oauthlib \
python313-six \
python313-urllib3 \
python313-websocket-client"

inherit rpm
