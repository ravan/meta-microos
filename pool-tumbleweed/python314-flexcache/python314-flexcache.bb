SUMMARY = "Saves and loads to the cache a transformed versions of a source object"
DESCRIPTION = "Saves and loads to the cache a transformed versions of a source object."
LICENSE = "BSD-3-Clause"

PV = "0.3"

RPM_NAME = "python314-flexcache-0.3-3.4.noarch.rpm"
RPM_HASH = "6c7b5ef6ee17e44d25053396283c8b8618f9518a667b669c9e465ef28d4fab2f825f86e5035fd93580cb5b51d37e8c52fca9094f8acb257b2a80c4549b7426e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-flexcache \
python314-flexcache \
python3dist-flexcache"

RDEPENDS:${PN} += "python-abi \
python314-typing-extensions"

inherit rpm
