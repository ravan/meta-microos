SUMMARY = "Travel through time in your tests"
DESCRIPTION = "This library mocks all functions from Python's standard library that return the current date or datetime. \
It can be used independently, as a function decorator, or as a context manager."
LICENSE = "MIT"

PV = "3.2.0"

RPM_NAME = "python314-time-machine-3.2.0-2.3.aarch64.rpm"
RPM_HASH = "64af69ad7cfecc2cd4585340e5b01dccbd593eb8ff1844460c859dd52f7766d9cad1249c61bada39e0272b351db0693d88a270074f0f0371c96783d07702eaf7"

RPROVIDES:${PN} += "python3.14dist-time-machine \
python314-time-machine \
python3dist-time-machine"

RDEPENDS:${PN} += "python-abi \
python314-python-dateutil \
python314-tokenize-rt \
timezone"

inherit rpm
