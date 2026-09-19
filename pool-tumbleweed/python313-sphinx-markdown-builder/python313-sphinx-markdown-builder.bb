SUMMARY = "A Sphinx extension to add markdown generation support"
DESCRIPTION = "A Sphinx extension to add markdown generation support."
LICENSE = "MIT"

PV = "0.6.10"

RPM_NAME = "python313-sphinx-markdown-builder-0.6.10-1.2.noarch.rpm"
RPM_HASH = "2fc49ab4e796e1b96af3943a66eec512eeee202ecf3147056d6bead8cb3d555e2e1d7b6a9b283b1f03000d3fede4461f943966a42bee4d05bf695fc5087bd88a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-markdown-builder \
python3.13dist-sphinx-markdown-builder \
python313-sphinx-markdown-builder \
python3dist-sphinx-markdown-builder"

RDEPENDS:${PN} += "python-abi \
python313-Sphinx \
python313-docutils \
python313-tabulate"

inherit rpm
