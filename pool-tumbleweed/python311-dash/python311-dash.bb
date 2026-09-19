SUMMARY = "Python framework for building reactive web-apps"
DESCRIPTION = "Dash is a Python framework for building analytical web applications. \
No JavaScript required. \
 \
Build on top of Plotly.js, React, and Flask, Dash ties modern UI \
elements like dropdowns, sliders, and graphs directly to your \
analytical python code."
LICENSE = "MIT"

PV = "3.2.0"

RPM_NAME = "python311-dash-3.2.0-1.1.noarch.rpm"
RPM_HASH = "a22b718477d33d72c84c0c25ee07120420d74478d834ff9ca8ca94f22fce846f60d0546447f1c0788f9c2cbaa0e5d2f1c9af290d68991e07952190c7ac114905"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-dash \
python311-dash \
python3dist-dash"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
jupyter-dash \
python-abi \
python311-Flask \
python311-Werkzeug \
python311-beautifulsoup4 \
python311-importlib-metadata \
python311-nest-asyncio \
python311-percy \
python311-plotly \
python311-requests \
python311-retrying \
python311-setuptools \
python311-typing-extensions \
update-alternatives"

inherit rpm
