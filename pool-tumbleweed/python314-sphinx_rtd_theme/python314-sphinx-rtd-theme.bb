SUMMARY = "ReadTheDocs.org theme for Sphinx"
DESCRIPTION = "This is a prototype mobile-friendly sphinx theme I made for readthedocs.org. It's \
currently in development and includes some rtd variable checks that can be ignored \
if you're just trying to use it on your project outside of that site."
LICENSE = "Apache-2.0 & MIT & OFL-1.1"

PV = "3.1.0"

RPM_NAME = "python314-sphinx_rtd_theme-3.1.0-1.4.noarch.rpm"
RPM_HASH = "c738b072ea01d72e15171545a3f33ab5fa22b42272824ae6d2ec65b3f05bb7aa8a72410dd867647a06f4f10e9122d32789c8ac4b8f648c0a8387766f3e5453da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sphinx-rtd-theme \
python314-sphinx-rtd-theme \
python3dist-sphinx-rtd-theme"

RDEPENDS:${PN} += "python-abi \
python314-Sphinx \
python314-docutils \
python314-sphinxcontrib-jquery"

inherit rpm
