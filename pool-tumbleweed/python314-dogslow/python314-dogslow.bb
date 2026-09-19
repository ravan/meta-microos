SUMMARY = "A Django middleware that logs tracebacks of slow requests"
DESCRIPTION = "A Django middleware that logs tracebacks of slow requests and allows further inspection."
LICENSE = "LGPL-2.1-only"

PV = "1.2"

RPM_NAME = "python314-dogslow-1.2-2.5.noarch.rpm"
RPM_HASH = "558ecb197015ab1c604bbc355d737e4e5073201a6196b3878645468ea6961cfa1568ea82152040c481b40559e66d72b94d9f3aa3542d805995414247b1e78960"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-dogslow \
python314-dogslow \
python3dist-dogslow"

RDEPENDS:${PN} += "python-abi"

inherit rpm
