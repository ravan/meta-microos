SUMMARY = "Python SDK for Sentry.io"
DESCRIPTION = "A Python SDK for Sentry.io. \
https://sentry.io/for/python/"
LICENSE = "BSD-2-Clause"

PV = "2.66.1"

RPM_NAME = "python314-sentry-sdk-2.66.1-1.1.noarch.rpm"
RPM_HASH = "18b8b1fa0d17bc841e94ed05ba9b36fce9b859869d2f64f3c18c49fb744749277a5f2dbe47d0c8d7014c40d304ac07f463fd91166c82596b412359be45314ef9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sentry-sdk \
python314-sentry-sdk \
python3dist-sentry-sdk"

RDEPENDS:${PN} += "python-abi \
python314-certifi \
python314-urllib3"

inherit rpm
