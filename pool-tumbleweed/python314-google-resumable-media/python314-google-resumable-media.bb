SUMMARY = "Utilities for Google Media Downloads and Resumable Uploads"
DESCRIPTION = "Utilities for Google Media Downloads and Resumable Uploads"
LICENSE = "Apache-2.0"

PV = "2.10.2"

RPM_NAME = "python314-google-resumable-media-2.10.2-1.1.noarch.rpm"
RPM_HASH = "d78289954651af6bfb77fbbd933fea5d78a657aaf5a7b7e72066cb3b1b0011e4a71ec053e16d99ad0d67aa1534040cacf9a163ed404ac97a4d64a50f04d2f11e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-google-resumable-media \
python314-google-resumable-media \
python3dist-google-resumable-media"

RDEPENDS:${PN} += "python-abi \
python314-google-crc32c"

inherit rpm
