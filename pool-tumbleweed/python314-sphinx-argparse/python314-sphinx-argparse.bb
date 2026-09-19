SUMMARY = "Sphinx extension to document argparse commands and options"
DESCRIPTION = "Sphinx extension that automatically documents argparse commands and options."
LICENSE = "MIT"

PV = "0.5.2"

RPM_NAME = "python314-sphinx-argparse-0.5.2-1.9.noarch.rpm"
RPM_HASH = "ff3f80159bc5c486f8d9f0a48f4b2bf5d484276c62cb7bc32a0dbacd017f19ffd8a424b771e2d50fcd68d38b12168cf90e9abdd69315df5d0c4225e905b9ea44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sphinx-argparse \
python314-sphinx-argparse \
python3dist-sphinx-argparse"

RDEPENDS:${PN} += "python-abi"

inherit rpm
