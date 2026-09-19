SUMMARY = "Documentation for OpenStack Glance API Client"
DESCRIPTION = "This is a client for the OpenStack Glance API. There's a Python API (the \
glanceclient module), and a command-line script (glance). Each implements \
100% of the OpenStack Glance API. \
This package contains auto-generated documentation."
LICENSE = "Apache-2.0"

PV = "4.13.0"

RPM_NAME = "python3-glanceclient-doc-4.13.0-1.1.noarch.rpm"
RPM_HASH = "c57cd42087cd42425164aec58659a966ea2bb51991e64351ac962c36b47cc064ddbc9d0a072ae5cf7328651388bead9241b642896bc5e5539ef9211e6c66d4fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-glanceclient-doc"

RDEPENDS:${PN} += ""

inherit rpm
