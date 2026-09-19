SUMMARY = "Example & demo files for CGAL library usage"
DESCRIPTION = "This package provides the sources of examples and demos of \
CGAL algorithms. You can study them, compile and test CGAL \
library."
LICENSE = "BSL-1.0 & GPL-3.0-or-later & LGPL-3.0-or-later & MIT"

PV = "6.2.1"

RPM_NAME = "cgal-demo-examples-devel-6.2.1-1.1.noarch.rpm"
RPM_HASH = "cc9b65d8c8f8417637c2f6e61868720f2acaa3f5a563512d30e4254a184b7a143f842ab36d67aae713e0733392b7c173a37ac805d3bed89ad4b741ca058c2ecd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cgal-demo-examples-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
cgal-devel"

inherit rpm
