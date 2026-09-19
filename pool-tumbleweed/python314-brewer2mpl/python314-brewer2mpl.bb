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

RPM_NAME = "python314-brewer2mpl-1.4.1-4.5.noarch.rpm"
RPM_HASH = "1ab23e4109b486224ddb1e150363e5b7085dab9480e4038348b5c0e16fc3c0cc7f88d75426cae96d484bd081178ea065889cd61229b6c188fbe4d9315b2c3c6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-brewer2mpl \
python314-brewer2mpl \
python3dist-brewer2mpl"

RDEPENDS:${PN} += "python-abi"

inherit rpm
