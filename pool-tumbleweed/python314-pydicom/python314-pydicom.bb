SUMMARY = "Pure python package for DICOM medical file reading and writing"
DESCRIPTION = "pydicom is a pure python package for parsing DICOM files \
into natural pythonic structures for further manipulation. \
Modified datasets can be written again to DICOM format files. \
 \
DICOM is a standard (http://medical.nema.org) for communicating \
medical images and related information such as reports \
and radiotherapy objects."
LICENSE = "MIT"

PV = "3.0.2"

RPM_NAME = "python314-pydicom-3.0.2-1.3.noarch.rpm"
RPM_HASH = "d69f02b96fa8ec8196cbf1251e76570c6be1b797dc7ee6c67bccdd4d05a2d328bf543c8aca37916d4c2aa66ccdb77c880d467064f6b3e66bca85fdbf40837fda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pydicom \
python314-pydicom \
python3dist-pydicom"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
