SUMMARY = "Google APIs Python Client"
DESCRIPTION = "Google APIs Client Library for Python"
LICENSE = "Apache-2.0"

PV = "2.200.0"

RPM_NAME = "python314-google-api-python-client-2.200.0-1.1.noarch.rpm"
RPM_HASH = "6ed0713297b93fdb9a8f2814343d418fe994d44d170e71bebb8ac9b5f37483da067eb7f29f963eaf142f749ef47f133a072323714ffd07ccb8aab5c273d4384b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-api-python-client \
python3.14dist-google-api-python-client \
python314-google-api-python-client \
python3dist-google-api-python-client"

RDEPENDS:${PN} += "python-abi \
python314-google-api-core \
python314-google-auth \
python314-google-auth-httplib2 \
python314-httplib2 \
python314-uritemplate"

inherit rpm
