SUMMARY = "Python Image Sequence"
DESCRIPTION = "Python Image Sequence"
LICENSE = "BSD-3-Clause"

PV = "0.7"

RPM_NAME = "python314-pims-0.7-2.2.noarch.rpm"
RPM_HASH = "a55ad510f71b48a976e3e64905a668b509ce86bf1fc7b7f8d73dee1de68f641bf5b5f5a9ed2f6e7c7f29348146646e321508b8b99f2bad9ad67ee2fd1240ec07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pims \
python314-pims \
python3dist-pims"

RDEPENDS:${PN} += "python-abi \
python314-imageio \
python314-numpy \
python314-packaging \
python314-slicerator \
python314-tifffile"

inherit rpm
