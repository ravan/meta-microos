SUMMARY = "Designing beautiful, view size responsive web components"
DESCRIPTION = "A sphinx extension for designing beautiful, view size responsive web components."
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "python313-sphinxcontrib-jinja-1.2.1-2.4.noarch.rpm"
RPM_HASH = "bf1c999f832230fb05a1c74520f481c4dd07974570105b03bc106d73f1c14f1632e74d7813808d98e76dd7f2db47656199a83502d617530000c7b0a83025816c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-jinja \
python3.13dist-sphinx-jinja \
python313-sphinxcontrib-jinja \
python3dist-sphinx-jinja"

RDEPENDS:${PN} += "python-abi \
python313-Jinja2 \
python313-Sphinx \
python313-docutils"

inherit rpm
