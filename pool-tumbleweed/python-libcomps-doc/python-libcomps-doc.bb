SUMMARY = "Documentation files for python bindings libcomps library"
DESCRIPTION = "Documentation files for python bindings libcomps library."
LICENSE = "GPL-2.0-or-later"

PV = "0.1.21"

RPM_NAME = "python-libcomps-doc-0.1.21-2.7.noarch.rpm"
RPM_HASH = "215c7a1f9a684c642cef50284dd1e32bdceca0684f9a299bd14223ed109f6d67ca4bb8662dca5fc74a0465f6ef55cfeaa086392f8dc6cbc04ed7202bb407d2e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-libcomps-doc"

RDEPENDS:${PN} += ""

inherit rpm
