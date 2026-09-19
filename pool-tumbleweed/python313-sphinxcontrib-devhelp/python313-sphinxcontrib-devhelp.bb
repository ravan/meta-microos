SUMMARY = "Sphinx extension which outputs Devhelp documents"
DESCRIPTION = "sphinxcontrib-devhelp is a sphinx extension which outputs Devhelp document."
LICENSE = "BSD-2-Clause"

PV = "2.0.0"

RPM_NAME = "python313-sphinxcontrib-devhelp-2.0.0-1.3.noarch.rpm"
RPM_HASH = "e41610cf880bb9d85a26a0bc7538873186f477b524c0b19bcd7ae115b6abc144eb6b436752ac74d7f2c8b549cc136e33f82922ea58632bf120112009085999b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-devhelp \
python3.13dist-sphinxcontrib-devhelp \
python313-sphinxcontrib-devhelp \
python3dist-sphinxcontrib-devhelp"

RDEPENDS:${PN} += "python-abi"

inherit rpm
