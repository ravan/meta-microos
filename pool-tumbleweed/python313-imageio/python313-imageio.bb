SUMMARY = "Python library for reading and writing image, video, and related formats"
DESCRIPTION = "Imageio is a Python library that provides an interface to read and \
write a wide range of image data, including animated images, volumetric \
data, and scientific formats."
LICENSE = "BSD-2-Clause"

PV = "2.37.4"

RPM_NAME = "python313-imageio-2.37.4-1.1.noarch.rpm"
RPM_HASH = "2c292bdd1cd7dcdff7ef863075b8a8b8a537a968d4ea7a806b767854a69430678b253d58809854565d8fb1ca470e92648f0f934c8e8b1211620393f6a6df2418"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-imageio \
python3.13dist-imageio \
python313-imageio \
python3dist-imageio"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-Pillow \
python313-numpy \
update-alternatives"

inherit rpm
