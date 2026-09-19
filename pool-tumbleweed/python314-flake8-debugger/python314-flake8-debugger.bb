SUMMARY = "ipdb/pdb statement checker plugin for flake8"
DESCRIPTION = "ipdb/pdb statement checker plugin for flake8"
LICENSE = "MIT"

PV = "4.1.2"

RPM_NAME = "python314-flake8-debugger-4.1.2-3.5.noarch.rpm"
RPM_HASH = "431beb1e42f5a8df8595da7e44efc69d73a38bb14d329b13f1b244fc8c1b764f5d41a269c206e2a90ed3ddf4a63a074ddcfcc2468ad8557c25b4100666bcb4a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-flake8-debugger \
python314-flake8-debugger \
python3dist-flake8-debugger"

RDEPENDS:${PN} += "python-abi \
python314-flake8 \
python314-pycodestyle"

inherit rpm
