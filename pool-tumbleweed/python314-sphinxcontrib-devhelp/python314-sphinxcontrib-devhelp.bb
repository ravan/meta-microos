SUMMARY = "Sphinx extension which outputs Devhelp documents"
DESCRIPTION = "sphinxcontrib-devhelp is a sphinx extension which outputs Devhelp document."
LICENSE = "BSD-2-Clause"

PV = "2.0.0"

RPM_NAME = "python314-sphinxcontrib-devhelp-2.0.0-1.3.noarch.rpm"
RPM_HASH = "f80290afcf9d5461fd2acf7222cedacce6258f0132bb6ee9f31b438bd0970d9ff95cedb838d09b37f034fb7f47306b81b93ff8cb242d26da9d6bfd47f2e78324"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sphinxcontrib-devhelp \
python314-sphinxcontrib-devhelp \
python3dist-sphinxcontrib-devhelp"

RDEPENDS:${PN} += "python-abi"

inherit rpm
