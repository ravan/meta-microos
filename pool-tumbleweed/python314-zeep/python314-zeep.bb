SUMMARY = "A Python SOAP client based on lxml/requests"
DESCRIPTION = "Python SOAP client based on python-lxml and python-requests"
LICENSE = "MIT"

PV = "4.3.3"

RPM_NAME = "python314-zeep-4.3.3-1.2.noarch.rpm"
RPM_HASH = "728b0e1e263ab6eab15890ac369ddd48959859b9e4746549a05a8fecda4ef88e8738e460f28bc407d902e7abf04bf9d457d98e65e3150be1532c2f3828a755a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-zeep \
python314-zeep \
python3dist-zeep"

RDEPENDS:${PN} += "python-abi \
python314-attrs \
python314-isodate \
python314-lxml \
python314-platformdirs \
python314-pytz \
python314-requests \
python314-requests-file \
python314-requests-toolbelt"

inherit rpm
