SUMMARY = "A decorator for caching properties in classes"
DESCRIPTION = "A decorator for caching properties in classes. It makes caching of time or \
computational expensive properties quick and easy and it works in Python 2 \
and 3."
LICENSE = "BSD-3-Clause"

PV = "2.0.1"

RPM_NAME = "python314-cached-property-2.0.1-1.4.noarch.rpm"
RPM_HASH = "9662e7feaa6cbde7050f5e6cd360b0180e766f9264b87a2a6f12dc7011716efbe94832bbfead85fcbd21119b861bea59e8ad3fae85e20a2150e497bf2d30a783"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-cached-property \
python314-cached-property \
python3dist-cached-property"

RDEPENDS:${PN} += "python-abi"

inherit rpm
