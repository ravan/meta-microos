SUMMARY = "Tool to access multiple neuroimaging data formats"
DESCRIPTION = "This package provides read +/- write access to some common medical and \
neuroimaging file formats, including: ANALYZE (plain, SPM99, SPM2 and \
later), GIFTI, NIfTI1, NIfTI2, CIFTI-2, MINC1, MINC2, AFNI BRIK/HEAD, \
MGH and ECAT as well as Philips PAR/REC. We can read and write \
FreeSurfer geometry, annotation and morphometry files. There is some \
very limited support for DICOM."
LICENSE = "MIT"

PV = "4.0.2"

RPM_NAME = "python311-nibabel-4.0.2-1.6.noarch.rpm"
RPM_HASH = "e8bb3c9bbaecf26cf1a5c4b0ea9f9bffe15afc9016c4befb8524c687f9d527fcd628c0a644ebbdcaef7e1b0be764111b5d6f61def981ff07ca3919a2375c0063"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nibabel \
python3.11dist-nibabel \
python311-nibabel \
python3dist-nibabel"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-numpy \
update-alternatives"

inherit rpm
