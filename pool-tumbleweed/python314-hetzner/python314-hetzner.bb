SUMMARY = "High level access to the Hetzner robot"
DESCRIPTION = "A high-level Python API for accessing the Hetzner robot."
LICENSE = "BSD-2-Clause"

PV = "0.8.3"

RPM_NAME = "python314-hetzner-0.8.3-3.5.noarch.rpm"
RPM_HASH = "d599bc0930f45fa27fa7b3b3f416d6e6a6c37b441fed5376649d6f4454a89982bced6179783e6de057723851316c2b111be66c34de1de4ac36dedf0a29f1eebf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-hetzner \
python314-hetzner \
python3dist-hetzner"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
