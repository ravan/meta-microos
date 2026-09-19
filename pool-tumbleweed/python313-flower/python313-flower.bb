SUMMARY = "A web frontend for monitoring and administrating Celery clusters"
DESCRIPTION = "Flower is a web based tool for monitoring and administrating Celery clusters."
LICENSE = "BSD-3-Clause"

PV = "2.0.1"

RPM_NAME = "python313-flower-2.0.1-2.5.noarch.rpm"
RPM_HASH = "f9b22842237a66e7c9d84604e02a59552ea08fb64c64e842e3a68e7d8ab8197c41ff811c9b1941a67c12851cc2026ef44ea76487ebeeb9b3eeb0e169e3bca66c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flower \
python3.13dist-flower \
python313-flower \
python3dist-flower"

RDEPENDS:${PN} += "python-abi \
python313-celery \
python313-humanize \
python313-prometheus-client \
python313-pytz \
python313-tornado"

inherit rpm
