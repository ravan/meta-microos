SUMMARY = "Travel through time in your tests"
DESCRIPTION = "This library mocks all functions from Python's standard library that return the current date or datetime. \
It can be used independently, as a function decorator, or as a context manager."
LICENSE = "MIT"

PV = "3.2.0"

RPM_NAME = "python313-time-machine-3.2.0-2.3.aarch64.rpm"
RPM_HASH = "83548295d340bb88e1c9e38664cbab14545a1284fa6020f46aa4ac5dfdccd8fa0ade8ff0b5d5c9b441bd37e5bb7a9835029551241ba8fa361f0fd69cbafc0208"

RPROVIDES:${PN} += "python3-time-machine \
python3.13dist-time-machine \
python313-time-machine \
python3dist-time-machine"

RDEPENDS:${PN} += "python-abi \
python313-python-dateutil \
python313-tokenize-rt \
timezone"

inherit rpm
