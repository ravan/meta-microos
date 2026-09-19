SUMMARY = "A clipboard module for Python"
DESCRIPTION = "A clipboard module for Python. It only handles plain text."
LICENSE = "BSD-3-Clause"

PV = "1.11.0"

RPM_NAME = "python313-pyperclip-1.11.0-1.4.noarch.rpm"
RPM_HASH = "383a5c9f6b38243fca03c3d5f49856731dcfb18908a116d6ecb3bfaf3d47a5c41d2dcf9e8a30f0ff6067d98ccedcbbc855557e8430a77d1c6f0271a4a6d93a77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyperclip \
python3.13dist-pyperclip \
python313-pyperclip \
python3dist-pyperclip"

RDEPENDS:${PN} += "python-abi \
xclip \
xsel"

inherit rpm
