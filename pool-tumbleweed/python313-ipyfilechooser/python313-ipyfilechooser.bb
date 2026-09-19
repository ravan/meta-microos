SUMMARY = "File chooser widget for use in Jupyter/IPython"
DESCRIPTION = "Python file chooser widget for use in Jupyter/IPython in conjunction with ipywidgets"
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python313-ipyfilechooser-0.6.0-2.8.noarch.rpm"
RPM_HASH = "829daf0397bfbab24d39914b7300f0a579d11e5ac0bcdf22d4ded0fdd72c7e957c9cea7d8aca0b0c2e0621d6ad01122992950c0fea022c72b95f6e1574c77e00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ipyfilechooser \
python3.13dist-ipyfilechooser \
python313-ipyfilechooser \
python3dist-ipyfilechooser"

RDEPENDS:${PN} += "python-abi \
python313-ipywidgets"

inherit rpm
