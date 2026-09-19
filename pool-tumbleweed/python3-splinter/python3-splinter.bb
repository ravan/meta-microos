SUMMARY = "Python3 bindings for splinter"
DESCRIPTION = "SPLINTER (SPLine INTERpolation) is a library for multivariate function \
approximation implemented in C++. The library can be used for function \
approximation, regression and data smoothing. \
 \
This package provides the python bindings for splinter."
LICENSE = "MPL-2.0"

PV = "3.0"

RPM_NAME = "python3-splinter-3.0-4.5.aarch64.rpm"
RPM_HASH = "6fd0d1f96716e5870e83dcad2455fb207fe233e69293ed4303a858a976bdddf08a82d5415f66c55347c2fa38db054c5a480d9ee394ba681f12839eccf73f05de"

RPROVIDES:${PN} += "python3-splinter \
python3.13dist-splinter \
python3dist-splinter"

RDEPENDS:${PN} += "python-abi"

inherit rpm
