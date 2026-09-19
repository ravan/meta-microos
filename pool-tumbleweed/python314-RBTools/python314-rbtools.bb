SUMMARY = "Command line tools for interacting with Review Board"
DESCRIPTION = "RBTools is a set of client tools to use with Review Board. This \
consists of the rbt command, which provides a number of sub-commands to \
create and update review requests from local source trees and otherwise \
interact with a Review Board server, along with a Python API client to \
simplify interaction with the Review Board web API."
LICENSE = "MIT"

PV = "6.0"

RPM_NAME = "python314-RBTools-6.0-1.2.noarch.rpm"
RPM_HASH = "7e5ebae4a78ab98622f7408572c94dce6320b48b927cb7b5b00831907eaeeec656792abe9a690230e9be06bb1c85ff95030d291c2a434829374d5d8458955b6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "RBTools \
python3.14dist-rbtools \
python314-RBTools \
python3dist-rbtools"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-appdirs \
python314-certifi \
python314-colorama \
python314-housekeeping \
python314-importlib-metadata \
python314-importlib-resources \
python314-packaging \
python314-puremagic \
python314-pydiffx \
python314-texttable \
python314-tqdm \
python314-typelets \
python314-typing-extensions \
update-alternatives"

inherit rpm
