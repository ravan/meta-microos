SUMMARY = "Python module for Digital Ocean droplets"
DESCRIPTION = "Python module to manage Digital Ocean droplets."
LICENSE = "LGPL-3.0-only"

PV = "1.17.0"

RPM_NAME = "python314-digitalocean-1.17.0-4.1.noarch.rpm"
RPM_HASH = "fa108167e59507e112bc2966b6fa001feb02847fdbf2154ea15f2463116d11e4d10a40aa43974beb85b531cff94ef3c675af9c2e7595bb7354c8b7fef7999cbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-digitalocean \
python314-digitalocean \
python3dist-python-digitalocean"

RDEPENDS:${PN} += "python-abi \
python314-jsonpickle \
python314-requests"

inherit rpm
