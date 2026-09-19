SUMMARY = "Sphinx extension to document argparse commands and options"
DESCRIPTION = "Sphinx extension that automatically documents argparse commands and options."
LICENSE = "MIT"

PV = "0.5.2"

RPM_NAME = "python313-sphinx-argparse-0.5.2-1.9.noarch.rpm"
RPM_HASH = "a2ea68a56ef6e1eb014a09ee78e2e0d4c1d55b614ec2b3ee05eaa0da407542b9b9c5786bce6c5c362d32d8a23e04b46dae84655399ffffb2cdd194d404cc3087"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-argparse \
python3.13dist-sphinx-argparse \
python313-sphinx-argparse \
python3dist-sphinx-argparse"

RDEPENDS:${PN} += "python-abi"

inherit rpm
