SUMMARY = "To simplify exif manipulations with python. Writing, reading, and more"
DESCRIPTION = "To simplify exif manipulations with python. Writing, reading, and more."
LICENSE = "MIT"

PV = "1.1.3"

RPM_NAME = "python314-piexif-1.1.3-1.14.noarch.rpm"
RPM_HASH = "04da5a790f99fc91c51a105966eb94710fb7ad6047fc3d43cb08775b3a9c9f83ef4219192bdad121f583fc0a234c939a9edd11b523fe0229f34ed44c64372c3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-piexif \
python314-piexif \
python3dist-piexif"

RDEPENDS:${PN} += "python-abi"

inherit rpm
