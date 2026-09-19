SUMMARY = "Helpful mixins for unittest classes"
DESCRIPTION = "Helpful mixins for unittest classes."
LICENSE = "Apache-2.0"

PV = "1.6"

RPM_NAME = "python314-unittest-mixins-1.6-3.9.noarch.rpm"
RPM_HASH = "e0e18ccd35a47506cdc5ad5879e07f2b6f6b249a3309379073d2afcf86621195187e3c298b51cbc08fbb36e8d851bfcc868622b5bc2e3726f495cd13e1b8e6bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-unittest-mixins \
python314-unittest-mixins \
python3dist-unittest-mixins"

RDEPENDS:${PN} += "python-abi"

inherit rpm
