SUMMARY = "A simple statsd client"
DESCRIPTION = "statsd is a front-end to Graphite. This is a Python client \
for the statsd daemon."
LICENSE = "MIT"

PV = "4.0.1"

RPM_NAME = "python314-statsd-4.0.1-1.8.noarch.rpm"
RPM_HASH = "b7ad49a1e55e558a6803c2c4be0248f2661d860b75a87d81d5dc334eb9fe9ca56f30d0967998ebf8b61560ff00a2eb958bdd09e9deefef4af601329967142d4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-statsd \
python314-statsd \
python3dist-statsd"

RDEPENDS:${PN} += "python-abi"

inherit rpm
