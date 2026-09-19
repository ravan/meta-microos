SUMMARY = "Sphinx extension to support docstrings in Numpy format"
DESCRIPTION = "Numpy's documentation uses several custom extensions to Sphinx.  These \
are shipped in this numpydoc package, in case you want to make use \
of them in third-party projects."
LICENSE = "BSD-3-Clause"

PV = "1.10.0"

RPM_NAME = "python314-numpydoc-1.10.0-1.3.noarch.rpm"
RPM_HASH = "c74cbd2f043ccb3dbc193acde904be8a2712b7072e5cda2e25e1d31c0795e6066139b76783845607b1d29442b308ad5ecd271635516d74c4e353a1f185eb14cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-numpydoc \
python314-numpydoc \
python3dist-numpydoc"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-Sphinx \
update-alternatives"

inherit rpm
