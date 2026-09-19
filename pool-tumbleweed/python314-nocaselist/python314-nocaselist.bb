SUMMARY = "A case-insensitive list for Python"
DESCRIPTION = "Class `NocaseList`_ is a case-insensitive list that preserves the lexical case \
of its items."
LICENSE = "Apache-2.0"

PV = "2.2.1"

RPM_NAME = "python314-nocaselist-2.2.1-1.1.noarch.rpm"
RPM_HASH = "fb4e6a6da766ba555659e4af68eae36dfbe9e9184af28a3d0a71895848f3f4a145164dc7984d1df2b81a2526c54e8df980e507601bf555d5683af672f8b7404f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-nocaselist \
python314-nocaselist \
python3dist-nocaselist"

RDEPENDS:${PN} += "python-abi \
python314-typing-extensions"

inherit rpm
