SUMMARY = "Documentation and tutorial for the Performance Co-Pilot"
DESCRIPTION = "Documentation and tutorial for the Performance Co-Pilot \
Performance Co-Pilot (PCP) provides a framework and services to support \
system-level performance monitoring and performance management. \
 \
The pcp-doc package provides useful information on using and \
configuring the Performance Co-Pilot (PCP) toolkit for system \
level performance management.  It includes tutorials, HOWTOs, \
and other detailed documentation about the internals of core \
PCP utilities and daemons, and the PCP graphical tools."
LICENSE = "GPL-2.0+ & CC-BY-SA-3.0"

PV = "6.3.8"

RPM_NAME = "pcp-doc-6.3.8-3.1.noarch.rpm"
RPM_HASH = "0a948baac7964c4d5f8edb83aab7e8abb5d82041fb9370cd4b2e9e06b00b010a5f82f840a6aa0a871c2502e4fa0bb5b378c792425833ae4ec7741a85076aff3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pcp-doc"

RDEPENDS:${PN} += ""

inherit rpm
