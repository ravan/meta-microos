SUMMARY = "A drop in replacement for xpyb, an XCB python binding"
DESCRIPTION = "The xcffib package is intended to be a (mostly) drop-in \
replacement for xpyb."
LICENSE = "Apache-2.0"

PV = "1.12.0"

RPM_NAME = "python314-xcffib-1.12.0-1.3.noarch.rpm"
RPM_HASH = "6c7fad69bdf2c644ad3338e124aafd6c130124bf1c674c4a5e6cd7c41118166dd5e1441b9272347217488b905a3df60a7d941ca88d339c53cf7010bd70c41523"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-xcffib \
python314-xcffib \
python3dist-xcffib"

RDEPENDS:${PN} += "python-abi \
python314-cffi"

inherit rpm
