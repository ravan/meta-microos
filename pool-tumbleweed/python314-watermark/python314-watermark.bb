SUMMARY = "IPython magic function to psystem information"
DESCRIPTION = "An Jupyter magic extension for printing date and time stamps, version numbers, \
and hardware information."
LICENSE = "BSD-3-Clause"

PV = "2.6.0"

RPM_NAME = "python314-watermark-2.6.0-1.4.noarch.rpm"
RPM_HASH = "9eb5358dab41b6ce0a1c04e7eedbab790f0565063fdca2e03a10f81d33cb98c48f1b5ab0af62e38f9b5c1e7e5f735495fe02084a7c0ed57e02ff78784e24ad66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-watermark \
python314-jupyter-watermark \
python314-watermark \
python3dist-watermark"

RDEPENDS:${PN} += "python-abi \
python314-importlib-metadata \
python314-ipython \
python314-setuptools"

inherit rpm
