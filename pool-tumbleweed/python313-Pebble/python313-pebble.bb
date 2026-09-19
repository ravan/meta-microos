SUMMARY = "Threading and multiprocessing eye-candy for Python"
DESCRIPTION = "Pebble provides an API to manage threads and processes within an application. \
It wraps Python’s standard library threading and multiprocessing objects."
LICENSE = "LGPL-3.0-only"

PV = "5.2.0"

RPM_NAME = "python313-Pebble-5.2.0-1.4.noarch.rpm"
RPM_HASH = "57c4396f12bca04a179f970290fbc7d94bf04c21854715f3309bdf60e3f9ab20f6038ece6593dc2e2023bbf8900b5bba39982777a1790c4f40f3c01eb0357454"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Pebble \
python3.13dist-pebble \
python313-Pebble \
python3dist-pebble"

RDEPENDS:${PN} += "python-abi"

inherit rpm
