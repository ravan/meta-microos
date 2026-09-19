SUMMARY = "A Sphinx extension to add markdown generation support"
DESCRIPTION = "A Sphinx extension to add markdown generation support."
LICENSE = "MIT"

PV = "0.6.10"

RPM_NAME = "python314-sphinx-markdown-builder-0.6.10-1.2.noarch.rpm"
RPM_HASH = "7639881dd3c3f495cbec74e04511bbfa8b08ee429d1a37088fad36c4f45d70723ae98985d71117d48eb478699d0f06c20bd602e747d5480658f043b304cabead"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sphinx-markdown-builder \
python314-sphinx-markdown-builder \
python3dist-sphinx-markdown-builder"

RDEPENDS:${PN} += "python-abi \
python314-Sphinx \
python314-docutils \
python314-tabulate"

inherit rpm
