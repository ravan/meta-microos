SUMMARY = "HTTP traffic mocking and expectations"
DESCRIPTION = "HTTP traffic mocking and expectations."
LICENSE = "MIT"

PV = "2.1.6"

RPM_NAME = "python313-pook-2.1.6-2.1.noarch.rpm"
RPM_HASH = "a1475abeb866f2130fa22ad6da58b0a8cd39cfdd5316289cd854129cce4c540779b2b6f48feae4cfe38627f48ffa29608e6fb3c32567f9879f1669b9f8f6b513"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pook \
python3.13dist-pook \
python313-pook \
python3dist-pook"

RDEPENDS:${PN} += "python-abi \
python313-furl \
python313-jsonschema \
python313-xmltodict"

inherit rpm
