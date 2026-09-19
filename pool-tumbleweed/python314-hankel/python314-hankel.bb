SUMMARY = "Hankel Transformations using method of Ogata 2005"
DESCRIPTION = "Hankel is a Python library to perform simple and accurate Hankel \
transformations using the method of Ogata 2005."
LICENSE = "MIT"

PV = "1.2.2"

RPM_NAME = "python314-hankel-1.2.2-3.5.noarch.rpm"
RPM_HASH = "8c346c3090464ece025a40edd38b8c25039d5519755311ee02c8067be2b89fe9167600ff301fa6016c417ee517834b01cb783af59026abca1ee777cfec849185"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-hankel \
python314-hankel \
python3dist-hankel"

RDEPENDS:${PN} += "python-abi \
python314-mpmath \
python314-numpy \
python314-scipy"

inherit rpm
