SUMMARY = "Designing beautiful, view size responsive web components"
DESCRIPTION = "A sphinx extension for designing beautiful, view size responsive web components."
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "python314-sphinxcontrib-jinja-1.2.1-2.4.noarch.rpm"
RPM_HASH = "514e505ce72f5e7074ba4ece6bdd3300a84a52eeea0e4af9c5019bde41f7d278475921dcc879ca39032bec42f21130f245dac655730410803c15476a43dce082"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sphinx-jinja \
python314-sphinxcontrib-jinja \
python3dist-sphinx-jinja"

RDEPENDS:${PN} += "python-abi \
python314-Jinja2 \
python314-Sphinx \
python314-docutils"

inherit rpm
