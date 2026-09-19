SUMMARY = "Kubernetes python client"
DESCRIPTION = "Python client for kubernetes http://kubernetes.io/"
LICENSE = "Apache-2.0"

PV = "35.0.0"

RPM_NAME = "python314-kubernetes-35.0.0-2.4.noarch.rpm"
RPM_HASH = "2cd536eed36a0a4255855c51088637cfa9e100165126d76baea3514f22865bc2f3bd1922edec68e67925bb33099420f6ea2f299a679b9ba3e5868959ee58def8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-kubernetes \
python314-kubernetes \
python3dist-kubernetes"

RDEPENDS:${PN} += "python-abi \
python314-PyYAML \
python314-certifi \
python314-durationpy \
python314-google-auth \
python314-oauthlib \
python314-python-dateutil \
python314-requests \
python314-requests-oauthlib \
python314-six \
python314-urllib3 \
python314-websocket-client"

inherit rpm
