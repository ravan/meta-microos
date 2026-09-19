SUMMARY = "Template Text Parser"
DESCRIPTION = "TTP is a Python library for semi-structured text parsing using templates."
LICENSE = "MIT"

PV = "0.10.1"

RPM_NAME = "python314-ttp-0.10.1-1.3.noarch.rpm"
RPM_HASH = "3ccab653506e44fd4a5ecd94b9b22caba9b743b0666f86541e547fed7ad9331854300c121ebb97f1ffcd145e894e9065485cd088ed54b1e7c71643bfd380f228"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ttp \
python314-ttp \
python3dist-ttp"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
