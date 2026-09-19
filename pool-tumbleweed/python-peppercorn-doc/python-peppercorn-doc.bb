SUMMARY = "Documentation for Pyramid exceptions logger"
DESCRIPTION = "This package contains documentation for python-peppercorn."
LICENSE = "BSD-4-Clause & ZPL-2.1 & MIT"

PV = "0.6"

RPM_NAME = "python-peppercorn-doc-0.6-5.7.noarch.rpm"
RPM_HASH = "c8493895f52fb7d5a8246ac11d8c4bd33bdb04c984be2f0adb885dfc6acc66e32259ff88d024ed09071316bec0d3a5998e419aafb2fc1085a13b7d95ccd83907"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-peppercorn-doc"

RDEPENDS:${PN} += ""

inherit rpm
