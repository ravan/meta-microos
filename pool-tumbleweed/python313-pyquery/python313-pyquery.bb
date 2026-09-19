SUMMARY = "A jQuery-like library for python"
DESCRIPTION = "Pyquery allows you to make jQuery queries on XML documents. The API is \
as much as possible the similar to jQuery. Pyquery uses lxml for fast \
XML and HTML manipulation."
LICENSE = "BSD-3-Clause"

PV = "2.1.0"

RPM_NAME = "python313-pyquery-2.1.0-1.1.noarch.rpm"
RPM_HASH = "7888f064ec82c568fcfd7795b515879e8adf7aea96a44885cddb74b5cf0fecfead7507a08e8baae17793b8f7a82859ec2538f640bccbf5f2ad3351d3402d7432"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyquery \
python3.13dist-pyquery \
python313-pyquery \
python3dist-pyquery"

RDEPENDS:${PN} += "python-abi \
python313-cssselect \
python313-lxml"

inherit rpm
