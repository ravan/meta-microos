SUMMARY = "Module to parse and manipulate version numbers"
DESCRIPTION = "parver allows parsing and manipulation of `PEP 440`_ version numbers."
LICENSE = "MIT"

PV = "0.5"

RPM_NAME = "python313-parver-0.5-2.12.noarch.rpm"
RPM_HASH = "83c29198c4df9e7b9e64b8e1f5046592d9de828b48a55d18ae0586e603a4fdd37dfbf6b70925f9b6ff9d60bf5a8e40a982b29ce533c56236c601f8e74181b489"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-parver \
python3.13dist-parver \
python313-parver \
python3dist-parver"

RDEPENDS:${PN} += "python-abi \
python313-Arpeggio \
python313-attrs \
python313-typing-extensions"

inherit rpm
