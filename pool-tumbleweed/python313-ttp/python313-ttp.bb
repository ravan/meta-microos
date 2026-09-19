SUMMARY = "Template Text Parser"
DESCRIPTION = "TTP is a Python library for semi-structured text parsing using templates."
LICENSE = "MIT"

PV = "0.10.1"

RPM_NAME = "python313-ttp-0.10.1-1.3.noarch.rpm"
RPM_HASH = "2f90f2bd99cd53e964270fc285fb30dd3e2af44fd2fb7c50869c0e0a1af307c42d1b36dc3a1f620ea21dd3574daef52849f48d7336f9e2d54db00f9e194d64cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ttp \
python3.13dist-ttp \
python313-ttp \
python3dist-ttp"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
