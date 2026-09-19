SUMMARY = "colorbrewer2org color maps for Python and matplotlib"
DESCRIPTION = "brewer2mpl is a pure Python package for accessing colorbrewer2.org \
color maps from Python. With brewer2mpl, the raw RGB colors of all 165 \
colorbrewer2.org color maps can be retrieved. The color map data ships with \
brewer2mpl, so that no network connection is required. \
 \
For more information and to view some of the color maps, see the wiki at \
https://github.com/jiffyclub/brewer2mpl/wiki."
LICENSE = "Apache-2.0 & MIT"

PV = "1.4.1"

RPM_NAME = "python313-brewer2mpl-1.4.1-4.5.noarch.rpm"
RPM_HASH = "34e5cee21f9cd3d4fc6acb09037984365a452369fd0e6c7c5db418178bdcf5bb03ec40aeeba1a767677116216c273ebf82543ae4523ce977861b7fea20069271"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-brewer2mpl \
python3.13dist-brewer2mpl \
python313-brewer2mpl \
python3dist-brewer2mpl"

RDEPENDS:${PN} += "python-abi"

inherit rpm
