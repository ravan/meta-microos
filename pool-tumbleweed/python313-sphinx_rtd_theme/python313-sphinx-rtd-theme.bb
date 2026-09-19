SUMMARY = "ReadTheDocs.org theme for Sphinx"
DESCRIPTION = "This is a prototype mobile-friendly sphinx theme I made for readthedocs.org. It's \
currently in development and includes some rtd variable checks that can be ignored \
if you're just trying to use it on your project outside of that site."
LICENSE = "Apache-2.0 & MIT & OFL-1.1"

PV = "3.1.0"

RPM_NAME = "python313-sphinx_rtd_theme-3.1.0-1.4.noarch.rpm"
RPM_HASH = "36a40e6ef3ac7821139b1a99666588e91895ef8c7136a44fe06a6275cf0606a84f312389d60fd53e2eb7716a3bbc3c11a5cc7bbc9e3b26272eab62d0f32f89bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-rtd-theme \
python3.13dist-sphinx-rtd-theme \
python313-sphinx-rtd-theme \
python3dist-sphinx-rtd-theme"

RDEPENDS:${PN} += "python-abi \
python313-Sphinx \
python313-docutils \
python313-sphinxcontrib-jquery"

inherit rpm
