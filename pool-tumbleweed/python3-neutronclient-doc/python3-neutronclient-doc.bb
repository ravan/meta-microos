SUMMARY = "Documentation for OpenStack Neutron API Client"
DESCRIPTION = "Client library and command line utility for interacting with OpenStack \
Neutron's API."
LICENSE = "Apache-2.0"

PV = "14.0.0"

RPM_NAME = "python3-neutronclient-doc-14.0.0-1.1.noarch.rpm"
RPM_HASH = "3f7b1b211f2862b8cbda4e763db04d4c95bcf14f2ebbe1b4e417f6190e21407151e4a0bcb6b976365ef07bbc31ebb1e89f7b085aab127a940a1aca7e2630d7e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-neutronclient-doc"

RDEPENDS:${PN} += ""

inherit rpm
