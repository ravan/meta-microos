SUMMARY = "Warewulf documentation and install recipes"
DESCRIPTION = "Warewulf is a scalable systems management suite originally developed to \
manage large high-performance Linux clusters. Focused on general \
scalable system management, it includes a framework for system \
configuration, management, provisioning/installation, monitoring, event \
notification, and more via a modular plugin architecture. \
 \
This package contains documentation for Warewulf, and installation \
recipes to assist in the deployment of a Warewulf cluster."
LICENSE = "BSD-3-Clause-LBNL"

PV = "3.8.1"

RPM_NAME = "warewulf-doc-3.8.1-14.10.noarch.rpm"
RPM_HASH = "fa048e985c0abf14aa4ea287ba8354262496adf04285b8ec315410b672bb04e42a46a27291aa449b5aa84a90ea1bdc4ad2ccb7367a1197e24fada6712c0e69bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "warewulf-doc"

RDEPENDS:${PN} += ""

inherit rpm
