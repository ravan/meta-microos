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

RPM_NAME = "python313-portend-3.2.1-1.5.noarch.rpm"
RPM_HASH = "6be35174c06e1ad4fd69567308b766afe64708ef58ea2c7865808a6c21d4c524c6e457a18a5874c1cb45b36c337f63bcd0916ed53fe4aab2421f98437476fd93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-portend \
python3.13dist-portend \
python313-portend \
python3dist-portend"

RDEPENDS:${PN} += "python-abi \
python313-tempora"

inherit rpm
