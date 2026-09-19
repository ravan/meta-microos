SUMMARY = "Utilities for Google Media Downloads and Resumable Uploads"
DESCRIPTION = "Utilities for Google Media Downloads and Resumable Uploads"
LICENSE = "Apache-2.0"

PV = "2.10.2"

RPM_NAME = "python313-google-resumable-media-2.10.2-1.1.noarch.rpm"
RPM_HASH = "055b68b99e8ad29bce7a67689b3730e5d75c55dec130ce8b29adb7f8439ee68bc403db197f61f38ee843955ea471caa1416f415bd461451ac5815fa4862b41d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-resumable-media \
python3.13dist-google-resumable-media \
python313-google-resumable-media \
python3dist-google-resumable-media"

RDEPENDS:${PN} += "python-abi \
python313-google-crc32c"

inherit rpm
