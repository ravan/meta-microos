SUMMARY = "File identification library for Python"
DESCRIPTION = "File identification library for Python, including license file SPDX identifier."
LICENSE = "MIT"

PV = "2.6.19"

RPM_NAME = "python313-identify-2.6.19-1.2.noarch.rpm"
RPM_HASH = "51aa44441d16b9cb5686fbb1433a3fec7b64ede7ac5032c6b2c19e41b2e1b1b0ad8eadf81fdbef3c72fc9e5d4b6f6ad739aac97226ebce53ba020c8f3c9de903"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-identify \
python3.13dist-identify \
python313-identify \
python3dist-identify"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
