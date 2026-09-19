SUMMARY = "Sphinx extension which outputs QtHelp"
DESCRIPTION = "sphinxcontrib-qthelp is a sphinx extension which outputs QtHelp document."
LICENSE = "BSD-2-Clause"

PV = "2.0.0"

RPM_NAME = "python313-sphinxcontrib-qthelp-2.0.0-1.7.noarch.rpm"
RPM_HASH = "0edc253686c46f76487398247335ec518ef1146300d26c44d4c79bef16cbb5d7aa1fc52e3ef3abafe96d172e4adbd6d233e3656c5aacab1c0015ee732aeab6b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-qthelp \
python3.13dist-sphinxcontrib-qthelp \
python313-sphinxcontrib-qthelp \
python3dist-sphinxcontrib-qthelp"

RDEPENDS:${PN} += "python-abi"

inherit rpm
