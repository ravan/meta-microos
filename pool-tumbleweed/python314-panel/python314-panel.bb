SUMMARY = "A high level app and dashboarding solution for Python"
DESCRIPTION = "Panel is a Python library that lets you create custom interactive web apps and \
dashboards by connecting user-defined widgets to plots, images, tables, or \
text."
LICENSE = "BSD-3-Clause"

PV = "1.8.10"

RPM_NAME = "python314-panel-1.8.10-2.2.noarch.rpm"
RPM_HASH = "4170125a8a340802c69890c610f406c0264f00668a376e9b241497504068d41595f20baa281cdaaeae749a29a27f924b6d42f6dcc8ed2907e172af8c5d9c7c2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-panel \
python314-panel \
python3dist-panel"

RDEPENDS:${PN} += "-python314-bokeh >= 3.7.0 with python314-bokeh < 3.10 \
-python314-param >= 2.1 with python314-param < 3 \
/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-Markdown \
python314-bleach \
python314-linkify-it-py \
python314-markdown-it-py \
python314-mdit-py-plugins \
python314-narwhals \
python314-packaging \
python314-pandas \
python314-pyviz-comms \
python314-requests \
python314-tqdm \
python314-typing-extensions \
update-alternatives"

inherit rpm
