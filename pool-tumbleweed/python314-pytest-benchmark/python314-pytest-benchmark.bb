SUMMARY = "A py.test fixture for benchmarking code"
DESCRIPTION = "A py.test fixture for benchmarking code. It will group the tests into \
rounds that are calibrated to the chosen timer."
LICENSE = "BSD-2-Clause"

PV = "5.2.3"

RPM_NAME = "python314-pytest-benchmark-5.2.3-1.4.noarch.rpm"
RPM_HASH = "ecd2634ccee7caed4f918e6d615e365dd2659b1cf5def459076b80ebceff7206c1e1755b649839338cb6fdd7e002b76987c694dc7fdc3c6f7ea8ee78f39df421"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-benchmark \
python314-pytest-benchmark \
python3dist-pytest-benchmark"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-py-cpuinfo \
python314-pytest"

inherit rpm
