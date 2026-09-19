SUMMARY = "Python library for reading and writing image, video, and related formats"
DESCRIPTION = "Imageio is a Python library that provides an interface to read and \
write a wide range of image data, including animated images, volumetric \
data, and scientific formats."
LICENSE = "BSD-2-Clause"

PV = "2.37.4"

RPM_NAME = "python314-imageio-2.37.4-1.1.noarch.rpm"
RPM_HASH = "c422b82e1fa18b0ba9664d8b6a0d027488738ea0d516dfa96460ccc1eb0dd57dd51d577e3fc8fe811618b930621561fe303e57d60c99360c48c7eb59758e417f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-imageio \
python314-imageio \
python3dist-imageio"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-Pillow \
python314-numpy \
update-alternatives"

inherit rpm
