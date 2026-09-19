SUMMARY = "Python implementation of 3-way merge"
DESCRIPTION = "Python implementation of 3-way merge"
LICENSE = "GPL-2.0-or-later"

PV = "0.0.16"

RPM_NAME = "python313-merge3-0.0.16-1.4.noarch.rpm"
RPM_HASH = "52468cfbcf3ed5582fe895fcfe8118a6c86abc00a96aa7fccf051054494f9132cdfd1c768e054949502765b9454983c4a26490dc45537bc54c8f292f661b5780"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-merge3 \
python3.13dist-merge3 \
python313-merge3 \
python3dist-merge3"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
