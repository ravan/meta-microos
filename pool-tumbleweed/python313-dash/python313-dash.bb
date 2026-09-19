SUMMARY = "Python framework for building reactive web-apps"
DESCRIPTION = "Dash is a Python framework for building analytical web applications. \
No JavaScript required. \
 \
Build on top of Plotly.js, React, and Flask, Dash ties modern UI \
elements like dropdowns, sliders, and graphs directly to your \
analytical python code."
LICENSE = "MIT"

PV = "4.1.0"

RPM_NAME = "python313-dash-4.1.0-1.2.noarch.rpm"
RPM_HASH = "5708165c60e2be78e8d4b05bcff2e5490178735bf796ab90ab5e64eede81d277fda62288f11597f19911722e6f024196bc3cbb5abdce703e0453f5328a158849"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dash \
python3.13dist-dash \
python313-dash \
python3dist-dash"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
jupyter-dash \
python-abi \
python313-Flask \
python313-Werkzeug \
python313-beautifulsoup4 \
python313-importlib-metadata \
python313-nest-asyncio \
python313-percy \
python313-plotly \
python313-requests \
python313-retrying \
python313-setuptools \
python313-typing-extensions \
update-alternatives"

inherit rpm
