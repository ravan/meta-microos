SUMMARY = "Python tools to interact with SAP HANA utilities"
DESCRIPTION = "API to expose SAP HANA functionalities"
LICENSE = "Apache-2.0"

PV = "0.3.13+git.1673855974.f208fad"

RPM_NAME = "python314-shaptools-0.3.13+git.1673855974.f208fad-1.17.noarch.rpm"
RPM_HASH = "4dfcdcfa2534d8f1b094882d6a5ce696e688b467203d09ff33c7a0a7350a9a42b87cb46473bb79f9c26ecae3308395b6ebaa4a205850470097271d9d6558691b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-shaptools \
python314-shaptools \
python3dist-shaptools"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
