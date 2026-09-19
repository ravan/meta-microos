SUMMARY = "Pure-Python Reed Solomon encoder/decoder"
DESCRIPTION = "A pure-python universal errors-and-erasures Reed-Solomon Codec, based on the wonderful tutorial at Wikiversity, \
written by 'Bobmath' and 'LRQ3000'. If you are just starting with Reed-Solomon error correction codes, \
the Wikiversity article is a good beginner's introduction. This is a burst-type implementation, \
so that it supports any Galois field higher than 2^3, but not binary streams."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python313-reedsolo-1.7.0-2.5.noarch.rpm"
RPM_HASH = "5ef1d243eeac504da80659b8f8aabc00de56f86167682362b301dbbc9af6eb5c66670322e663425bec3dc95404109d21d450ac594ef3dbb8ab739a109d0a782a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-reedsolo \
python3.13dist-reedsolo \
python313-reedsolo \
python3dist-reedsolo"

RDEPENDS:${PN} += "python-abi"

inherit rpm
