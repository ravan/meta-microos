SUMMARY = "Tool to access multiple neuroimaging data formats"
DESCRIPTION = "This package provides read +/- write access to some common medical and \
neuroimaging file formats, including: ANALYZE (plain, SPM99, SPM2 and \
later), GIFTI, NIfTI1, NIfTI2, CIFTI-2, MINC1, MINC2, AFNI BRIK/HEAD, \
MGH and ECAT as well as Philips PAR/REC. We can read and write \
FreeSurfer geometry, annotation and morphometry files. There is some \
very limited support for DICOM."
LICENSE = "MIT"

PV = "5.4.2"

RPM_NAME = "python314-nibabel-5.4.2-1.3.noarch.rpm"
RPM_HASH = "2d1d56f535499de63ac69146f828ae2a68ed4d135a1df6cbff7ccc63c7c26fece8eefd8cae5f2f57184f91852f5c63afce68cdee8277fe9d4a2cc002d544c957"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-nibabel \
python314-nibabel \
python3dist-nibabel"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-numpy \
python314-packaging"

inherit rpm
