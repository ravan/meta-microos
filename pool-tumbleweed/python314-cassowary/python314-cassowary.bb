SUMMARY = "A pure Python implementation of the Cassowary constraint solving algorithm"
DESCRIPTION = "A pure Python implementation of the Cassowary constraint-solving algorithm. \
Cassowary is the algorithm that forms the core of the OS X and iOS visual \
layout mechanism."
LICENSE = "BSD-3-Clause"

PV = "0.5.2"

RPM_NAME = "python314-cassowary-0.5.2-3.5.noarch.rpm"
RPM_HASH = "69ab89e5d75b135416cd10d2de882f044f5c8888da89ae12141449b790a8dc8eea0edd78702817fc9b50aebc07819c5a46a1c5c66f8d65906a4c25739dde0811"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-cassowary \
python314-cassowary \
python3dist-cassowary"

RDEPENDS:${PN} += "python-abi"

inherit rpm
