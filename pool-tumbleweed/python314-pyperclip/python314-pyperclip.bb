SUMMARY = "A clipboard module for Python"
DESCRIPTION = "A clipboard module for Python. It only handles plain text."
LICENSE = "BSD-3-Clause"

PV = "1.11.0"

RPM_NAME = "python314-pyperclip-1.11.0-1.4.noarch.rpm"
RPM_HASH = "a8101fb04c56a0c2e4687c8319b84bc226daa361822091ea5ba29b29cd1ded9a5c7ec2eee99f89fc57d8958e73818e26a521ed394a949789b585fcb464544c88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyperclip \
python314-pyperclip \
python3dist-pyperclip"

RDEPENDS:${PN} += "python-abi \
xclip \
xsel"

inherit rpm
