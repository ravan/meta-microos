SUMMARY = "The official unofficial pip API"
DESCRIPTION = "The official unofficial pip API."
LICENSE = "Apache-2.0"

PV = "0.0.34"

RPM_NAME = "python313-pip-api-0.0.34-3.4.noarch.rpm"
RPM_HASH = "9aa132d422d8e6aa51d78095a21825eb807bf7c1349fe2902bd7fe52b0ce8549de65afe0c6f99f615953d95d351ac00c60400bf8e6c6fec213222ce63f83c0ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pip-api \
python3.13dist-pip-api \
python313-pip-api \
python3dist-pip-api"

RDEPENDS:${PN} += "python-abi \
python313-pip \
python313-tomli"

inherit rpm
