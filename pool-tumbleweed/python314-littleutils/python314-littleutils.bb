SUMMARY = "Small personal collection of python utility functions"
DESCRIPTION = "Small personal collection of python utility functions"
LICENSE = "MIT"

PV = "0.2.4"

RPM_NAME = "python314-littleutils-0.2.4-1.8.noarch.rpm"
RPM_HASH = "7adc2a40a1e8878db23ff25629b9c53be4a64c8e29b3ffa80c4900b158357e0e1ccfaf85a9172783a1a77168154cd14af588a4d3b5cb5ce8ecfd9f960acb7249"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-littleutils \
python314-littleutils \
python3dist-littleutils"

RDEPENDS:${PN} += "python-abi"

inherit rpm
