SUMMARY = "A high level app and dashboarding solution for Python"
DESCRIPTION = "Panel is a Python library that lets you create custom interactive web apps and \
dashboards by connecting user-defined widgets to plots, images, tables, or \
text."
LICENSE = "BSD-3-Clause"

PV = "1.8.10"

RPM_NAME = "python313-panel-1.8.10-2.2.noarch.rpm"
RPM_HASH = "4c29f8b29b440e4ff198b26419efedb6d1552b2420513a19d0f2d9253da2ff8bff8a400c9384af2bac4d01ec54efd732913c740c64a584ca2256d6971ccef2d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-panel \
python3.13dist-panel \
python313-panel \
python3dist-panel"

RDEPENDS:${PN} += "-python313-bokeh >= 3.7.0 with python313-bokeh < 3.10 \
-python313-param >= 2.1 with python313-param < 3 \
/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-Markdown \
python313-bleach \
python313-linkify-it-py \
python313-markdown-it-py \
python313-mdit-py-plugins \
python313-narwhals \
python313-packaging \
python313-pandas \
python313-pyviz-comms \
python313-requests \
python313-tqdm \
python313-typing-extensions \
update-alternatives"

inherit rpm
