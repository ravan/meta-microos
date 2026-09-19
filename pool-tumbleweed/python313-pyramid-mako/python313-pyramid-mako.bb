SUMMARY = "Mako template bindings for the Pyramid web framework"
DESCRIPTION = "Mako template bindings for the Pyramid web framework."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python313-pyramid-mako-1.1.0-4.5.noarch.rpm"
RPM_HASH = "550ec2759e6e14aae5efdd555f746f5eb86bd9fec245fda466e7a7c419e68a59d6771c1b1f171d2701644741c6f1de93b6e580ff375694492e3c91a799e568dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyramid-mako \
python3.13dist-pyramid-mako \
python313-pyramid-mako \
python3dist-pyramid-mako"

RDEPENDS:${PN} += "python-abi \
python313-Mako \
python313-pyramid"

inherit rpm
