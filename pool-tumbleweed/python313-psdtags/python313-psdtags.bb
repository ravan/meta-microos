SUMMARY = "Read and write layered TIFF ImageSourceData and ImageResources tags"
DESCRIPTION = "Psdtags is a Python library to read and write the Adobe Photoshop(r) specific \
ImageResources (#34377) and ImageSourceData (#37724) TIFF tags, which contain \
image resource blocks, layer and mask information found in a typical layered \
TIFF file created by Photoshop."
LICENSE = "BSD-3-Clause"

PV = "2026.1.29"

RPM_NAME = "python313-psdtags-2026.1.29-1.2.noarch.rpm"
RPM_HASH = "103b0f5a8313f35f0401b9173781dc4176d42677945918acc30582a9fd898f4e4edd4fddd47b3af861f42c2c00e5d6171c89e8c6c461f4273f32619815b6aca5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-psdtags \
python3.13dist-psdtags \
python313-psdtags \
python3dist-psdtags"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
