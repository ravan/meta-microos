SUMMARY = "Python tools to interact with SAP HANA utilities"
DESCRIPTION = "API to expose SAP HANA functionalities"
LICENSE = "Apache-2.0"

PV = "0.3.13+git.1673855974.f208fad"

RPM_NAME = "python313-shaptools-0.3.13+git.1673855974.f208fad-1.17.noarch.rpm"
RPM_HASH = "4d4eeb247b41c4f17ba6ec8dd940285cbb75912e914cbed5211fb113430614dae1e2ff2898aa694a41a01d8ed3f11475e62c8a2ef4b1c597240d579ffdafd090"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-shaptools \
python3.13dist-shaptools \
python313-shaptools \
python3dist-shaptools"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
