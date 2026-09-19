SUMMARY = "DKIM (DomainKeys Identified Mail)"
DESCRIPTION = "DKIM (DomainKeys Identified Mail)"
LICENSE = "BSD-2-Clause"

PV = "1.1.8"

RPM_NAME = "python313-dkimpy-1.1.8-2.5.noarch.rpm"
RPM_HASH = "1861825dfac5595345565a6dec95f6bf20bdad04c0ada8c9d85abc9a4a119c4850aacf163f00f41157c91c4405ef7f8c29269f9f291cdab518b96cae7851d543"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dkimpy \
python3.13dist-dkimpy \
python313-dkimpy \
python3dist-dkimpy"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-PyNaCl \
python313-authres \
python313-dnspython \
python313-setuptools"

inherit rpm
