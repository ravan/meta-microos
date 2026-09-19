SUMMARY = "A pure Python implementation of the Cassowary constraint solving algorithm"
DESCRIPTION = "A pure Python implementation of the Cassowary constraint-solving algorithm. \
Cassowary is the algorithm that forms the core of the OS X and iOS visual \
layout mechanism."
LICENSE = "BSD-3-Clause"

PV = "0.5.2"

RPM_NAME = "python313-cassowary-0.5.2-3.5.noarch.rpm"
RPM_HASH = "0c5cb18805a4b053998c16a58e8032d7fde3f866353e46444f22a0af1e537e9c801dacebf2674a4845bff233d28244beebae7ab17c4bc5454bcb14685c234cbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cassowary \
python3.13dist-cassowary \
python313-cassowary \
python3dist-cassowary"

RDEPENDS:${PN} += "python-abi"

inherit rpm
