SUMMARY = "Create cloud-init compatible image seeds"
DESCRIPTION = "Create cloud-init compatible image seeds"
LICENSE = "Apache-2.0"

PV = "0.3.0"

RPM_NAME = "python314-cloud-init-seed-0.3.0-4.5.noarch.rpm"
RPM_HASH = "f0d19830c24950ac214c39b0e5f79dad29195f8818e366ef69fea9149fa08faa728bdea79e4dc7f949ab190c89bcb9a5396a8ae094c3d312e6e1ac0d504c4417"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-cloud-init-seed \
python314-cloud-init-seed \
python3dist-cloud-init-seed"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
mkisofs \
python-abi"

inherit rpm
