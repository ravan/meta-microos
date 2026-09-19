SUMMARY = "A Markdown parser in pure Python"
DESCRIPTION = "A Markdown parser in pure Python, designed to be fast, \
spec-compliant and fully customizable."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "python313-mistletoe-1.5.1-1.3.noarch.rpm"
RPM_HASH = "1361243be46bf4288d53fa7bcfe068ce37271fd01a2b78fc2deb4d0d1df297d12bac401062f37471ecd8b33e727bb6ee11dc14e7f3dd9b05b49a9039d33d006f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mistletoe \
python3.13dist-mistletoe \
python313-mistletoe \
python3dist-mistletoe"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
