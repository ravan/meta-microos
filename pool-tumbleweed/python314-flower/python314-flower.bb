SUMMARY = "A web frontend for monitoring and administrating Celery clusters"
DESCRIPTION = "Flower is a web based tool for monitoring and administrating Celery clusters."
LICENSE = "BSD-3-Clause"

PV = "2.0.1"

RPM_NAME = "python314-flower-2.0.1-2.5.noarch.rpm"
RPM_HASH = "a023dd75869a2aba67b70c92b17c2a41db7631de124563b0621652f4390710cf53a707a04b58158a9285625d6c7a8fbdb9debe2e5c75b9ce5c48acd03b93ace5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-flower \
python314-flower \
python3dist-flower"

RDEPENDS:${PN} += "python-abi \
python314-celery \
python314-humanize \
python314-prometheus-client \
python314-pytz \
python314-tornado"

inherit rpm
