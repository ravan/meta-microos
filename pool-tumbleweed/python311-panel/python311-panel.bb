SUMMARY = "A high level app and dashboarding solution for Python"
DESCRIPTION = "Panel is a Python library that lets you create custom interactive web apps and \
dashboards by connecting user-defined widgets to plots, images, tables, or \
text."
LICENSE = "BSD-3-Clause"

PV = "1.7.1"

RPM_NAME = "python311-panel-1.7.1-1.1.noarch.rpm"
RPM_HASH = "38a086038238d1aa0392c463d15e92c7e723124b6150fec9f0418deb07aa639e2751a1d57964f378827f110a5fb57fd1678a4e8cfac66f11959f3605674d71d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-panel \
python311-panel \
python3dist-panel"

RDEPENDS:${PN} += "-python311-bokeh >= 3.5.0 with python311-bokeh < 3.7 \
-python311-param >= 2.1 with python311-param < 3 \
/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-Markdown \
python311-bleach \
python311-linkify-it-py \
python311-markdown-it-py \
python311-mdit-py-plugins \
python311-packaging \
python311-pandas \
python311-pyviz-comms \
python311-requests \
python311-tqdm \
python311-typing-extensions \
update-alternatives"

inherit rpm
