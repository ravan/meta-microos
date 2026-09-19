SUMMARY = "Markdown URL utilities"
DESCRIPTION = "A Python port of the JavaScript mdurl package. Formats and parses URLs in Markdown-Format."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python313-mdurl-0.1.2-2.14.noarch.rpm"
RPM_HASH = "c46b1172f3779805a4e7c29a2f5d00728a80fb7fa9794551ad75f5d549f776c84cfb467b10e61fa1d682864e06bda5982e20a5547589fc215e80a6c3c0184315"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mdurl \
python3.13dist-mdurl \
python313-mdurl \
python3dist-mdurl"

RDEPENDS:${PN} += "python-abi"

inherit rpm
