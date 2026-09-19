SUMMARY = "TCP port monitoring utilities"
DESCRIPTION = "Use portend to monitor TCP ports for bound or unbound states. \
 \
The portend may also be executed directly. If the function succeeds, it \
returns nothing and exits with a status of 0. If it fails, it prints a \
message and exits with a status of 1. For example:: \
 \
Portend also exposes a ``find_available_local_port`` for identifying \
a suitable port for binding locally::"
LICENSE = "MIT"

PV = "3.2.1"

RPM_NAME = "python314-portend-3.2.1-1.5.noarch.rpm"
RPM_HASH = "355538320c4b8f424d59293c6ccba1032559a92ed21c9c055b4682c5ab4d4a540c9b67ae46bbeffcaa392a086df6def144690955dd2f3b3e571b5a8c9ae2dc72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-portend \
python314-portend \
python3dist-portend"

RDEPENDS:${PN} += "python-abi \
python314-tempora"

inherit rpm
