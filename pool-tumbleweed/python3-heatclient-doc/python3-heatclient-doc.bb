SUMMARY = "Documentation for OpenStack Heat API Client"
DESCRIPTION = "This is a client for the OpenStack Heat API. There's a Python API (the \
heatclient module), and a command-line script (heat). Each implements 100% of \
the OpenStack Heat API. \
This package contains auto-generated documentation."
LICENSE = "Apache-2.0"

PV = "5.3.0"

RPM_NAME = "python3-heatclient-doc-5.3.0-1.1.noarch.rpm"
RPM_HASH = "4e80ebf9892c75441015f4dd7d4a48b3df41d820e1275e4eb13a076b5c53ca61817f30eee5da966d34a6c4e406bd9a846fadd7c08389286be7428e42c622684b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-heatclient-doc"

RDEPENDS:${PN} += ""

inherit rpm
