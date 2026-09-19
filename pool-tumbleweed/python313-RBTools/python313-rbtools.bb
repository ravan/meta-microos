SUMMARY = "Command line tools for interacting with Review Board"
DESCRIPTION = "RBTools is a set of client tools to use with Review Board. This \
consists of the rbt command, which provides a number of sub-commands to \
create and update review requests from local source trees and otherwise \
interact with a Review Board server, along with a Python API client to \
simplify interaction with the Review Board web API."
LICENSE = "MIT"

PV = "6.0"

RPM_NAME = "python313-RBTools-6.0-1.2.noarch.rpm"
RPM_HASH = "c9b0fec34f2576631a429ad349eb023ce260b07b1d38dbc587ae1a6c5ed7443153a295e720b6763d9dfce5c52e28bd31419052f7309bcdc3be4179205dc9493e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "RBTools \
python3-RBTools \
python3.13dist-rbtools \
python313-RBTools \
python3dist-rbtools"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-appdirs \
python313-certifi \
python313-colorama \
python313-housekeeping \
python313-importlib-metadata \
python313-importlib-resources \
python313-packaging \
python313-puremagic \
python313-pydiffx \
python313-texttable \
python313-tqdm \
python313-typelets \
python313-typing-extensions \
update-alternatives"

inherit rpm
