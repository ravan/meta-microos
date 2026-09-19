SUMMARY = "Unicode to ASCII transliteration"
DESCRIPTION = "Converts Unicode characters to their best ASCII representation."
LICENSE = "ISC"

PV = "0.3.3"

RPM_NAME = "python314-anyascii-0.3.3-1.5.noarch.rpm"
RPM_HASH = "58b8026979086c7ec3dd3c0c572d236bab2eb1d4de5f7b5120155834388ece0d4727fa2f53d2008db1b3f496626c281d84ee459e572229b70572d1a2eea12599"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-anyascii \
python314-anyascii \
python3dist-anyascii"

RDEPENDS:${PN} += "python-abi"

inherit rpm
