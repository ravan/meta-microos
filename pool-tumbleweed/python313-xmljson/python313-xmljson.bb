SUMMARY = "Converts XML into JSON/Python dicts/arrays and vice-versa"
DESCRIPTION = "Converts XML into JSON/Python dicts/arrays and vice-versa"
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python313-xmljson-0.2.1-1.2.noarch.rpm"
RPM_HASH = "9c3dcfa89fa38eabcdf7220a19d0b2306b7c075be91abbcc0e46e9253ad4fd5fb18dad7d97413edad67301ede4140fa22ac8059494e959fcdb2ed36e2818c9b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xmljson \
python3.13dist-xmljson \
python313-xmljson \
python3dist-xmljson"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
