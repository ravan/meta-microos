SUMMARY = "A Markdown parser in pure Python"
DESCRIPTION = "A Markdown parser in pure Python, designed to be fast, \
spec-compliant and fully customizable."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "python314-mistletoe-1.5.1-1.3.noarch.rpm"
RPM_HASH = "8c215d62c8b58974ef6de1b5917a0bc7129c3d21cc333c1e8d3262f8be53c08537e9008f66e1a4682e4cbc369ba87be3aef0d167e3c8f4bfbfb5d5007405ffa3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-mistletoe \
python314-mistletoe \
python3dist-mistletoe"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
