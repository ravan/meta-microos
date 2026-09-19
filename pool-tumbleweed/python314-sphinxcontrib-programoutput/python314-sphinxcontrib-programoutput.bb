SUMMARY = "Sphinx extension to include program output"
DESCRIPTION = "A Sphinx extension to literally insert the output of arbitrary commands into \
documents, helping you to keep your command examples up to date."
LICENSE = "BSD-2-Clause"

PV = "0.18"

RPM_NAME = "python314-sphinxcontrib-programoutput-0.18-1.7.noarch.rpm"
RPM_HASH = "82845ce87f8c59c90e69942bf7682827cd539e4cd817faa4de052badb1fba0e598e8e13c37d7e82312416859216ed9b0b1a0ee617f39636aeab4eb3d20439c44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sphinxcontrib-programoutput \
python314-sphinxcontrib-programoutput \
python3dist-sphinxcontrib-programoutput"

RDEPENDS:${PN} += "python-abi \
python314-Sphinx"

inherit rpm
