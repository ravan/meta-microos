SUMMARY = "Python framework for building reactive web-apps"
DESCRIPTION = "Dash is a Python framework for building analytical web applications. \
No JavaScript required. \
 \
Build on top of Plotly.js, React, and Flask, Dash ties modern UI \
elements like dropdowns, sliders, and graphs directly to your \
analytical python code."
LICENSE = "MIT"

PV = "4.1.0"

RPM_NAME = "python314-dash-4.1.0-1.2.noarch.rpm"
RPM_HASH = "0312e0c9f6293f2471e9868af57d5cf955af13244c5870412c533e5bbc3797d52fc97132c2cca557b915e3f4d8102beb776609d19a168eebb3fb22621e3dbdda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-dash \
python314-dash \
python3dist-dash"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
jupyter-dash \
python-abi \
python314-Flask \
python314-Werkzeug \
python314-beautifulsoup4 \
python314-importlib-metadata \
python314-nest-asyncio \
python314-percy \
python314-plotly \
python314-requests \
python314-retrying \
python314-setuptools \
python314-typing-extensions \
update-alternatives"

inherit rpm
