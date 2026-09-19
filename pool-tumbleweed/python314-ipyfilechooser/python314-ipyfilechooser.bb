SUMMARY = "File chooser widget for use in Jupyter/IPython"
DESCRIPTION = "Python file chooser widget for use in Jupyter/IPython in conjunction with ipywidgets"
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python314-ipyfilechooser-0.6.0-2.8.noarch.rpm"
RPM_HASH = "2dc83963b160adc9d7d82ee8a3219d9f211dd5239666c3925bdbd47448b32db73c2b5090373888b59b9e5dacf921caf37c608a733eb57ad4e25a119ad068a74a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ipyfilechooser \
python314-ipyfilechooser \
python3dist-ipyfilechooser"

RDEPENDS:${PN} += "python-abi \
python314-ipywidgets"

inherit rpm
