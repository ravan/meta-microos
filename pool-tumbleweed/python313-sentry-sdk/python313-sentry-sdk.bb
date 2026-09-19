SUMMARY = "Python SDK for Sentry.io"
DESCRIPTION = "A Python SDK for Sentry.io. \
https://sentry.io/for/python/"
LICENSE = "BSD-2-Clause"

PV = "2.66.1"

RPM_NAME = "python313-sentry-sdk-2.66.1-1.1.noarch.rpm"
RPM_HASH = "d6cad0c4a77a9996697153f31a66c1a8eaa72257495335d119bd9b8dc20454baf8b19a98dc8db4383afe6eb8dc6f8f167022963401ccb20dad92a4598fc1792c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sentry-sdk \
python3.13dist-sentry-sdk \
python313-sentry-sdk \
python3dist-sentry-sdk"

RDEPENDS:${PN} += "python-abi \
python313-certifi \
python313-urllib3"

inherit rpm
