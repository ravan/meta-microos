SUMMARY = "Tool to access multiple neuroimaging data formats"
DESCRIPTION = "This package provides read +/- write access to some common medical and \
neuroimaging file formats, including: ANALYZE (plain, SPM99, SPM2 and \
later), GIFTI, NIfTI1, NIfTI2, CIFTI-2, MINC1, MINC2, AFNI BRIK/HEAD, \
MGH and ECAT as well as Philips PAR/REC. We can read and write \
FreeSurfer geometry, annotation and morphometry files. There is some \
very limited support for DICOM."
LICENSE = "MIT"

PV = "4.0.2"

RPM_NAME = "python310-nibabel-4.0.2-1.6.noarch.rpm"
RPM_HASH = "699a4c84740ecfb0e949d56524de3f1a87d1e003dfe9c15bdb79b023716b38b75940a4330851dbf36b2a5d1ccb43082e46533861dfa09b8975d07d8dd63fd027"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-nibabel \
python310-nibabel \
python3dist-nibabel"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-numpy \
update-alternatives"

inherit rpm
