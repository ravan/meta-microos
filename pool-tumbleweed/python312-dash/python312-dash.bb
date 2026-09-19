SUMMARY = "Python framework for building reactive web-apps"
DESCRIPTION = "Dash is a Python framework for building analytical web applications. \
No JavaScript required. \
 \
Build on top of Plotly.js, React, and Flask, Dash ties modern UI \
elements like dropdowns, sliders, and graphs directly to your \
analytical python code."
LICENSE = "MIT"

PV = "3.2.0"

RPM_NAME = "python312-dash-3.2.0-1.1.noarch.rpm"
RPM_HASH = "41909abae9c1d72978d2eaaef718b98988de006485220ada6ce0df797c0db485d917daeaaeb80b0962e7fb7efc8ebf59e9c405fd642202b991762b1602ce0684"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.12dist-dash \
python312-dash \
python3dist-dash"

RDEPENDS:${PN} += "/usr/bin/python3.12 \
/usr/bin/sh \
jupyter-dash \
python-abi \
python312-Flask \
python312-Werkzeug \
python312-beautifulsoup4 \
python312-importlib-metadata \
python312-nest-asyncio \
python312-percy \
python312-plotly \
python312-requests \
python312-retrying \
python312-setuptools \
python312-typing-extensions \
update-alternatives"

inherit rpm
