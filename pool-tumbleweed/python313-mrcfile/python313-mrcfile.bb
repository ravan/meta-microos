SUMMARY = "MRC file I/O library"
DESCRIPTION = "A Python implementation of the MRC2014 file format, which \
is used in structural biology to store image and volume data."
LICENSE = "BSD-3-Clause"

PV = "1.5.4"

RPM_NAME = "python313-mrcfile-1.5.4-3.1.noarch.rpm"
RPM_HASH = "07cb5140e0c5f4f069e33675d42aa45ddd94791435b4f7b0848263a11e3d6e49829205ea37fdb3b286a53b2771d3650910ade95c80af7f562889d7fcd1715446"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mrcfile \
python3.13dist-mrcfile \
python313-mrcfile \
python3dist-mrcfile"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-numpy \
update-alternatives"

inherit rpm
