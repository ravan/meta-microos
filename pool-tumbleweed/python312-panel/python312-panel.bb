SUMMARY = "A high level app and dashboarding solution for Python"
DESCRIPTION = "Panel is a Python library that lets you create custom interactive web apps and \
dashboards by connecting user-defined widgets to plots, images, tables, or \
text."
LICENSE = "BSD-3-Clause"

PV = "1.7.1"

RPM_NAME = "python312-panel-1.7.1-1.1.noarch.rpm"
RPM_HASH = "98e5dbd6ec2b4efd0c65a07ecee10299f2cf08c8b904952f5824232af4870fe27ca1f4464f18a4afd0fee007911419cb6ab4c430ed77fd272c75878baf592a24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.12dist-panel \
python312-panel \
python3dist-panel"

RDEPENDS:${PN} += "-python312-bokeh >= 3.5.0 with python312-bokeh < 3.7 \
-python312-param >= 2.1 with python312-param < 3 \
/usr/bin/python3.12 \
/usr/bin/sh \
python-abi \
python312-Markdown \
python312-bleach \
python312-linkify-it-py \
python312-markdown-it-py \
python312-mdit-py-plugins \
python312-packaging \
python312-pandas \
python312-pyviz-comms \
python312-requests \
python312-tqdm \
python312-typing-extensions \
update-alternatives"

inherit rpm
