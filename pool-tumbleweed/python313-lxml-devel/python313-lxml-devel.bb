SUMMARY = "Development files for python-lxml"
DESCRIPTION = "lxml is a Pythonic binding for the libxml2 and libxslt libraries. It \
provides convenient access to these libraries using the ElementTree \
API. It extends the ElementTree API significantly to offer support for XPath, \
RelaxNG, XML Schema, XSLT and C14N. \
 \
This package contains header files needed to use lxml's C API."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "6.1.1"

RPM_NAME = "python313-lxml-devel-6.1.1-2.2.aarch64.rpm"
RPM_HASH = "19b8b8be0b697ddb8e38d5ecab6b12a74cf4108adefc61c4e96c530d1fbe85d3127b85426bba8f71f158f4f2210d609045fdecd55458ba86b08d39c7803503db"

RPROVIDES:${PN} += "python3-lxml-devel \
python313-lxml-devel"

RDEPENDS:${PN} += "python313-lxml"

inherit rpm
