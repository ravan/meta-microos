SUMMARY = "Spill-to-disk dictionary for Python"
DESCRIPTION = "A dictionary that spills to disk. \
Chest acts like a dictionary, but it can write its contents to disk. \
This is useful in the following two occasions: \
1. Chest can hold datasets that are larger than memory \
2. Chest persists and so can be saved and loaded for later use"
LICENSE = "BSD-3-Clause"

PV = "0.2.3"

RPM_NAME = "python313-chest-0.2.3-5.5.noarch.rpm"
RPM_HASH = "77441c47a2ef3b03a42ef52ea2051536cf605e852cbac496a9ccf5c016de21650104a682c86d83639d91e7fea2f4735aafd110d0c6a0fd682e9f069beb7c1b02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-chest \
python3.13dist-chest \
python313-chest \
python3dist-chest"

RDEPENDS:${PN} += "python-abi \
python313-HeapDict"

inherit rpm
