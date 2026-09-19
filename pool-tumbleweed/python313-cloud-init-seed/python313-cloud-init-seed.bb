SUMMARY = "Create cloud-init compatible image seeds"
DESCRIPTION = "Create cloud-init compatible image seeds"
LICENSE = "Apache-2.0"

PV = "0.3.0"

RPM_NAME = "python313-cloud-init-seed-0.3.0-4.5.noarch.rpm"
RPM_HASH = "5f5d00a0ea3484d4e66d76299d73a65aced228c65eccbab511d78fe8df8be3d118ad5aefb7dcbf6c592e5b20bc67774f4286ffd5b12a19d9a2a1bcedb9673aa0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cloud-init-seed \
python3.13dist-cloud-init-seed \
python313-cloud-init-seed \
python3dist-cloud-init-seed"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
mkisofs \
python-abi"

inherit rpm
