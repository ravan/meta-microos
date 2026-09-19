SUMMARY = "C++ library to parse DICOM medical files"
DESCRIPTION = "Grassroots DiCoM (GDCM) is a C++ library for parsing DICOM medical files. \
It supports ACR-NEMA version 1 and 2 (huffman compression is not supported), \
RAW, JPEG, JPEG 2000, JPEG-LS, RLE and deflated transfer syntax. \
It comes with a scanner implementation to scan DICOM files. \
It supports SCU network operations (C-ECHO, C-FIND, C-STORE, \
C-MOVE). PS 3.3 & 3.6 are distributed as XML files. \
It also provides PS 3.15 certificates and password based mechanism to \
anonymize and de-identify DICOM datasets."
LICENSE = "BSD-3-Clause"

PV = "3.2.5"

RPM_NAME = "gdcm-3.2.5-2.3.aarch64.rpm"
RPM_HASH = "d4828b84b4e26a8ccb78a792ec6f147d35b454db5c85283b56ce8361dec9895a01efecd50940c9640602458d74d873d97da24de2570bb707cc5aabdaac3f8529"

RPROVIDES:${PN} += "gdcm"

RDEPENDS:${PN} += ""

inherit rpm
