SUMMARY = "A high level app and dashboarding solution for Python"
DESCRIPTION = "Panel is a Python library that lets you create custom interactive web apps and \
dashboards by connecting user-defined widgets to plots, images, tables, or \
text."
LICENSE = "BSD-3-Clause"

PV = "1.5.0"

RPM_NAME = "python310-panel-1.5.0-2.1.noarch.rpm"
RPM_HASH = "4a08bd059901eb414bc91d6bfae81799d71818ffdb6670a2802f05dcad548068a2d061f93b165088987234bed90b5e4c7c76a01e069be8c2c5fcac63ffd20300"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-panel \
python310-panel \
python3dist-panel"

RDEPENDS:${PN} += "-python310-bokeh >= 3.5.0 with python310-bokeh < 3.6 \
-python310-param >= 2.1 with python310-param < 3 \
/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-Markdown \
python310-bleach \
python310-linkify-it-py \
python310-markdown-it-py \
python310-mdit-py-plugins \
python310-packaging \
python310-pandas \
python310-pyviz-comms \
python310-requests \
python310-tqdm \
python310-typing-extensions \
update-alternatives"

inherit rpm
