SUMMARY = "Tool to access multiple neuroimaging data formats"
DESCRIPTION = "This package provides read +/- write access to some common medical and \
neuroimaging file formats, including: ANALYZE (plain, SPM99, SPM2 and \
later), GIFTI, NIfTI1, NIfTI2, CIFTI-2, MINC1, MINC2, AFNI BRIK/HEAD, \
MGH and ECAT as well as Philips PAR/REC. We can read and write \
FreeSurfer geometry, annotation and morphometry files. There is some \
very limited support for DICOM."
LICENSE = "MIT"

PV = "4.0.2"

RPM_NAME = "python38-nibabel-4.0.2-1.1.noarch.rpm"
RPM_HASH = "11f8762229f502be824491ea84ebff3b77a31ee72b99e632221afd4f7122c0742f8d700929804bb33a601da303954900032ba294655cd6c0da5fdc5bc3435d4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.8dist-nibabel \
python38-nibabel \
python3dist-nibabel"

RDEPENDS:${PN} += "/usr/bin/python3.8 \
/usr/bin/sh \
python-abi \
python38-numpy \
update-alternatives"

inherit rpm
