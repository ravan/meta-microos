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

RPM_NAME = "python313-pydicom-3.0.2-1.3.noarch.rpm"
RPM_HASH = "00e101591077a50290e9e5907f5750bc8eccd639fa24cf786876bc140a32fec137584838d0e5ce5277a069c86e278af3117b2b4ae28036fbd13e2bf46854864e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pydicom \
python3.13dist-pydicom \
python313-pydicom \
python3dist-pydicom"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
