SUMMARY = "DKIM (DomainKeys Identified Mail)"
DESCRIPTION = "DKIM (DomainKeys Identified Mail)"
LICENSE = "BSD-2-Clause"

PV = "1.1.8"

RPM_NAME = "python314-dkimpy-1.1.8-2.5.noarch.rpm"
RPM_HASH = "85bd011ccfc8330ee9d4052f9a85a24586cfbeba990dc0cdf9303a6d9cb93c88b246b9e16644dfd0ede457d97b6b3911fbc4ec0fa737038d4448a2e2bbe2eb4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-dkimpy \
python314-dkimpy \
python3dist-dkimpy"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-PyNaCl \
python314-authres \
python314-dnspython \
python314-setuptools"

inherit rpm
