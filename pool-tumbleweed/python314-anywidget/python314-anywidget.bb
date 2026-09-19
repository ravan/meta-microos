SUMMARY = "Custom jupyter widgets made easy"
DESCRIPTION = "Custom jupyter widgets made easy \
 \
- create widgets **without complicated cookiecutter templates** \
- **publish to PyPI** like any other Python package \
- prototype **within** `.ipynb` or `.py` files \
- run in **Jupyter**, **JupyterLab**, **Google Colab**, **VSCode**, and more \
- develop with **instant HMR**, like modern web frameworks"
LICENSE = "MIT"

PV = "0.9.21"

RPM_NAME = "python314-anywidget-0.9.21-1.4.noarch.rpm"
RPM_HASH = "3fd720c040d275f752e1fbd1a5405919a6db06ec4b9a0ad772e4192c4ea2d217fdc86c0bdacdf7b01b3bbfb00cfa9929418fac9738176edfdd193580b093ed2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-anywidget \
python314-anywidget \
python3dist-anywidget"

RDEPENDS:${PN} += "python-abi \
python314-ipywidgets \
python314-psygnal \
python314-typing-extensions"

inherit rpm
