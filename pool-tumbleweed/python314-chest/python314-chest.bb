SUMMARY = "Spill-to-disk dictionary for Python"
DESCRIPTION = "A dictionary that spills to disk. \
Chest acts like a dictionary, but it can write its contents to disk. \
This is useful in the following two occasions: \
1. Chest can hold datasets that are larger than memory \
2. Chest persists and so can be saved and loaded for later use"
LICENSE = "BSD-3-Clause"

PV = "0.2.3"

RPM_NAME = "python314-chest-0.2.3-5.5.noarch.rpm"
RPM_HASH = "84fdaf08cce97352ef64eada38933fb5969e8a35f3c4b73971086eb3dc2d551470785c1c87dafecf2b4b51d4c42cd9ec2c66a31b6d2261dff723a636e1cbea85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-chest \
python314-chest \
python3dist-chest"

RDEPENDS:${PN} += "python-abi \
python314-HeapDict"

inherit rpm
