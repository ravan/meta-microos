SUMMARY = "Documentation for OpenStack service library"
DESCRIPTION = "oslo.service provides a framework for defining new long-running services using \
the patterns established by other OpenStack applications. It also includes \
utilities long-running applications might need for working with SSL or WSGI, \
performing periodic operations, interacting with systemd, etc. \
This package contains the documentation."
LICENSE = "Apache-2.0"

PV = "4.8.0"

RPM_NAME = "python-oslo.service-doc-4.8.0-1.1.noarch.rpm"
RPM_HASH = "0a13c951909641ac8f2982f90ac62f2b82441eda9a451d244de1e4558d4342ea560816143932c43ef01d766132f196793590de91083eabc2983f3d891cfe13fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-oslo.service-doc"

RDEPENDS:${PN} += ""

inherit rpm
