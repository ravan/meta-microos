SUMMARY = "Tools for accessing JPEG2000 files"
DESCRIPTION = "Python interface to the OpenJPEG library"
LICENSE = "MIT"

PV = "0.14.8"

RPM_NAME = "python314-Glymur-0.14.8-1.2.noarch.rpm"
RPM_HASH = "55c46c7c2d32f5c8a709b09a7ad41f705bb692d3cadb9808dcc0f4f28c2c8d304211ccfbe91429b47cce4a959be7e89116c015583d7c9017514a8970acdffa4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-glymur \
python314-Glymur \
python3dist-glymur"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-lxml \
python314-numpy \
update-alternatives"

inherit rpm
