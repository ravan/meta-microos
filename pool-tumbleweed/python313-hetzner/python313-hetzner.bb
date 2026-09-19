SUMMARY = "High level access to the Hetzner robot"
DESCRIPTION = "A high-level Python API for accessing the Hetzner robot."
LICENSE = "BSD-2-Clause"

PV = "0.8.3"

RPM_NAME = "python313-hetzner-0.8.3-3.5.noarch.rpm"
RPM_HASH = "dd875ca81babf71188c30ca4e14b07abcd9239104f1225c5c939bdfd18cd03e56ee2d78f19ae9873c0983acf9cf12ae7211d51eefd631dfd8174003015b065e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hetzner \
python3.13dist-hetzner \
python313-hetzner \
python3dist-hetzner"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
