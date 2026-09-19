SUMMARY = "Compute distance between the two texts"
DESCRIPTION = "Compute distance between sequences. 30+ algorithms, pure python \
implementation, common interface, optional external libs usage."
LICENSE = "MIT"

PV = "4.6.3"

RPM_NAME = "python313-textdistance-4.6.3-2.5.noarch.rpm"
RPM_HASH = "49f4f9e1f38eb030b61f36a0fea25d5991b54ca8ce8bb905d5b95a059239406d761a23501454d8e9d2d4684d6faa7ef5e390e54087f5ffeccc9f38098e9a95e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-textdistance \
python3.13dist-textdistance \
python313-textdistance \
python3dist-textdistance"

RDEPENDS:${PN} += "python-abi"

inherit rpm
