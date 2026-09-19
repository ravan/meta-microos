SUMMARY = "Read and write layered TIFF ImageSourceData and ImageResources tags"
DESCRIPTION = "Psdtags is a Python library to read and write the Adobe Photoshop(r) specific \
ImageResources (#34377) and ImageSourceData (#37724) TIFF tags, which contain \
image resource blocks, layer and mask information found in a typical layered \
TIFF file created by Photoshop."
LICENSE = "BSD-3-Clause"

PV = "2026.1.29"

RPM_NAME = "python314-psdtags-2026.1.29-1.2.noarch.rpm"
RPM_HASH = "1c3f4012ebab307e029380cb36208356e9ad2147b4a18c0681ae35bfa1d61a0a58a150e4f08a5cc230d944e0033a916c15a0b63ac67726d7aad52bbe5e0faa92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-psdtags \
python314-psdtags \
python3dist-psdtags"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
