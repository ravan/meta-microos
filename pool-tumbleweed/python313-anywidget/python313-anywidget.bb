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

RPM_NAME = "python313-anywidget-0.9.21-1.4.noarch.rpm"
RPM_HASH = "b62d9dde44d6989f0421a1503d6a49c377db14b803cbde7806c579ddb77939a354d0d6dfb7f1b9ca1c46259e1f1d6413abe554213b6bc5745e158ad06403c479"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-anywidget \
python3.13dist-anywidget \
python313-anywidget \
python3dist-anywidget"

RDEPENDS:${PN} += "python-abi \
python313-ipywidgets \
python313-psygnal \
python313-typing-extensions"

inherit rpm
