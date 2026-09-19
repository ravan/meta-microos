SUMMARY = "Tool to access multiple neuroimaging data formats"
DESCRIPTION = "This package provides read +/- write access to some common medical and \
neuroimaging file formats, including: ANALYZE (plain, SPM99, SPM2 and \
later), GIFTI, NIfTI1, NIfTI2, CIFTI-2, MINC1, MINC2, AFNI BRIK/HEAD, \
MGH and ECAT as well as Philips PAR/REC. We can read and write \
FreeSurfer geometry, annotation and morphometry files. There is some \
very limited support for DICOM."
LICENSE = "MIT"

PV = "5.4.2"

RPM_NAME = "python313-nibabel-5.4.2-1.3.noarch.rpm"
RPM_HASH = "7d477e23d7572d5691fdd388918d5336a09232ce13b28652ff31ffeca857b5963418ddc801bc96c040f5205335af62f47dfbbd5adbd202c12a962c6a47d9d2d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nibabel \
python3.13dist-nibabel \
python313-nibabel \
python3dist-nibabel"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-numpy \
python313-packaging"

inherit rpm
