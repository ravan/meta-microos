SUMMARY = "A py.test fixture for benchmarking code"
DESCRIPTION = "A py.test fixture for benchmarking code. It will group the tests into \
rounds that are calibrated to the chosen timer."
LICENSE = "BSD-2-Clause"

PV = "5.2.3"

RPM_NAME = "python313-pytest-benchmark-5.2.3-1.4.noarch.rpm"
RPM_HASH = "83aed20df54ad621299ed2293a329183855709efd61d95e947b0e90f65a5be3e87c21b21d85bafc68c941685c3c351a4d72678b8804af7f8fab435177800c39d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-benchmark \
python3.13dist-pytest-benchmark \
python313-pytest-benchmark \
python3dist-pytest-benchmark"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-py-cpuinfo \
python313-pytest"

inherit rpm
