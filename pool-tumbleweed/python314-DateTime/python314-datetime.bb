SUMMARY = "Zope DateTime data type"
DESCRIPTION = "This package provides a DateTime data type, as known from Zope. \
Unless you need to communicate with Zope APIs, you're probably \
better off using Python's built-in datetime module."
LICENSE = "ZPL-2.1"

PV = "6.0"

RPM_NAME = "python314-DateTime-6.0-1.1.noarch.rpm"
RPM_HASH = "76318c34ce77311bf6df34afcd0c7aaa462c27efb52d32d6a69db76254daeb5d5f6ceb410090ff630d1079dde2e968ce69ad88ab264e7cc6086c0762710202b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-datetime \
python314-DateTime \
python3dist-datetime"

RDEPENDS:${PN} += "python-abi \
python314-pytz \
python314-zope.interface"

inherit rpm
