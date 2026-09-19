SUMMARY = "PKI testing tool"
DESCRIPTION = "PKI testing tool"
LICENSE = "MIT"

PV = "0.14.0"

RPM_NAME = "python313-certomancer-0.14.0-1.2.noarch.rpm"
RPM_HASH = "f56a2d2307b115152590284b9d20909cf8d542844e2026ad59df437c1fca7bf48ec8d838e287b0ca5bd235553a714d8f4e1316a141246bf37141d101aa1e87d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-certomancer \
python3.13dist-certomancer \
python313-certomancer \
python3dist-certomancer"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-PyYAML \
python313-asn1crypto \
python313-click \
python313-cryptography \
python313-python-dateutil \
python313-tzlocal"

inherit rpm
