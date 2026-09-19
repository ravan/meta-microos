SUMMARY = "Product Composer"
DESCRIPTION = "The new product builder for ALP family and beyond. \
WARNING: please be aware that the code is still on the move and is \
         likely to break with productcompose file syntax changes."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.8"

RPM_NAME = "product-composer-0.9.8-1.2.noarch.rpm"
RPM_HASH = "4d37c20e8eba8e63db8f082d4748914058c3a0d2f481db16de62b6e93d9c2878435c17541ae253441683a0b6b74412373f742dd13b0f68a8b099f6948933629f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "product-composer \
python3.13dist-productcomposer \
python3dist-productcomposer"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
build \
checkmedia \
createrepo-c \
inst-source-utils \
libsolv-tools \
mkisofs \
mksusecd \
python-abi \
python3-PyYAML \
python3-pydantic \
python3-rpm \
python3-zstandard"

inherit rpm
