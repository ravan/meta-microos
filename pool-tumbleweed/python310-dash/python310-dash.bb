SUMMARY = "Python framework for building reactive web-apps"
DESCRIPTION = "Dash is a Python framework for building analytical web applications. \
No JavaScript required. \
 \
Build on top of Plotly.js, React, and Flask, Dash ties modern UI \
elements like dropdowns, sliders, and graphs directly to your \
analytical python code."
LICENSE = "MIT"

PV = "2.16.1"

RPM_NAME = "python310-dash-2.16.1-2.1.noarch.rpm"
RPM_HASH = "3efc986d169bdd4d6b558ae176fe6d7369b4ef638ad0ad25e36b72059ba170ce37e0250caec46265cd340695f5e62ff76a33cffab8c606e5c02c8a6d70d1ed33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-dash \
python310-dash \
python3dist-dash"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
jupyter-dash \
python-abi \
python310-Flask \
python310-Werkzeug \
python310-beautifulsoup4 \
python310-dash-core-components \
python310-dash-html-components \
python310-dash-table \
python310-importlib-metadata \
python310-nest-asyncio \
python310-percy \
python310-plotly \
python310-requests \
python310-retrying \
python310-setuptools \
python310-typing-extensions \
update-alternatives"

inherit rpm
