SUMMARY = "Zope DateTime data type"
DESCRIPTION = "This package provides a DateTime data type, as known from Zope. \
Unless you need to communicate with Zope APIs, you're probably \
better off using Python's built-in datetime module."
LICENSE = "ZPL-2.1"

PV = "6.0"

RPM_NAME = "python313-DateTime-6.0-1.1.noarch.rpm"
RPM_HASH = "ea2ebd86d69f88212141899689e47c94cc71da64dec243c4e05abbac2c1f563a8515267f78cb22305c9db764b3808a81cda058519b584283b1f67b7ffbb4d9a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-DateTime \
python3.13dist-datetime \
python313-DateTime \
python3dist-datetime"

RDEPENDS:${PN} += "python-abi \
python313-pytz \
python313-zope.interface"

inherit rpm
