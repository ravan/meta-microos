SUMMARY = "Development files for python-lxml"
DESCRIPTION = "lxml is a Pythonic binding for the libxml2 and libxslt libraries. It \
provides convenient access to these libraries using the ElementTree \
API. It extends the ElementTree API significantly to offer support for XPath, \
RelaxNG, XML Schema, XSLT and C14N. \
 \
This package contains header files needed to use lxml's C API."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "6.1.1"

RPM_NAME = "python314-lxml-devel-6.1.1-2.2.aarch64.rpm"
RPM_HASH = "4eb0c584e6c14831a3d0553474622883f67ccbfc12c4ea4af001f55d74e8ddc709b18383c283ee20c3cb693e0fbf1e9ea4c08928b83058903e4327f8a4cb1e16"

RPROVIDES:${PN} += "python314-lxml-devel"

RDEPENDS:${PN} += "python314-lxml"

inherit rpm
