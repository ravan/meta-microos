SUMMARY = "Serial Attached SCSI (SAS) utilities"
DESCRIPTION = "sasutils is a set of command-line tools, udev scripts and a Python \
library to ease the administration of Serial Attached SCSI (SAS) \
storage devices."
LICENSE = "Apache-2.0"

PV = "0.5.0"

RPM_NAME = "sasutils-0.5.0-1.11.noarch.rpm"
RPM_HASH = "920ffbef2048eb7a23180d898bb6c10000b48ffa54bb9bd644aab3fe658173b6c46da79ca7ff5288cd50de9c83c248f55816d2ee5f42c95ce2377e0ae11de389"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-sasutils \
python3dist-sasutils \
sasutils"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-setuptools \
sg3-utils \
smp-utils"

inherit rpm
