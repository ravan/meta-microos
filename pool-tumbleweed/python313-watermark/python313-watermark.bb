SUMMARY = "IPython magic function to psystem information"
DESCRIPTION = "An Jupyter magic extension for printing date and time stamps, version numbers, \
and hardware information."
LICENSE = "BSD-3-Clause"

PV = "2.6.0"

RPM_NAME = "python313-watermark-2.6.0-1.4.noarch.rpm"
RPM_HASH = "ce71710b24f1053e602d7b9cc2b3049a3f14afefa66fc42a8cd335c4fb113d0aedcefbc0e8e433a80ba975733366807f2d388fff468bfe3695948999ae43a0c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-watermark \
python3-jupyter-watermark \
python3-watermark \
python3.13dist-watermark \
python313-jupyter-watermark \
python313-watermark \
python3dist-watermark"

RDEPENDS:${PN} += "python-abi \
python313-importlib-metadata \
python313-ipython \
python313-setuptools"

inherit rpm
