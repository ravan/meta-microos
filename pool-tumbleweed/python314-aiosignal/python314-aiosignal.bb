SUMMARY = "a list of registered asynchronous callbacks"
DESCRIPTION = "A project to manage callbacks in asyncio projects. \
Signal is a list of registered asynchronous callbacks."
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "python314-aiosignal-1.4.0-1.5.noarch.rpm"
RPM_HASH = "faa0a031aa41a9b7c53fb7427d36b40f471faebee89c9cb6b3a2d8c17c71acc0324c2add9b51008f60592e54dbb4186feef2f0c1247f3949d845e289b8cc0dd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-aiosignal \
python314-aiosignal \
python3dist-aiosignal"

RDEPENDS:${PN} += "python-abi \
python314-frozenlist"

inherit rpm
