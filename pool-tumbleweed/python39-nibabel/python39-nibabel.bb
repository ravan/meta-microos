SUMMARY = "Tool to access multiple neuroimaging data formats"
DESCRIPTION = "This package provides read +/- write access to some common medical and \
neuroimaging file formats, including: ANALYZE (plain, SPM99, SPM2 and \
later), GIFTI, NIfTI1, NIfTI2, CIFTI-2, MINC1, MINC2, AFNI BRIK/HEAD, \
MGH and ECAT as well as Philips PAR/REC. We can read and write \
FreeSurfer geometry, annotation and morphometry files. There is some \
very limited support for DICOM."
LICENSE = "MIT"

PV = "4.0.2"

RPM_NAME = "python39-nibabel-4.0.2-1.6.noarch.rpm"
RPM_HASH = "4f407e85a4e9bb73b578d819e40822e17c4a1f81943171cdffaf96ba46c9c2857e224174a78747e9b99fb521315b3ba7c8a366edbc4f4c16f43ddd0bd3818a68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-nibabel \
python39-nibabel \
python3dist-nibabel"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-numpy \
update-alternatives"

inherit rpm
