SUMMARY = "Documentation for the OpenStack DNS as a Service - Client"
DESCRIPTION = "Documentation for the OpenStack DNS as a Service - Client."
LICENSE = "Apache-2.0"

PV = "7.0.0"

RPM_NAME = "python3-designateclient-doc-7.0.0-1.1.noarch.rpm"
RPM_HASH = "1401d3bdfe4341aa3916915d14c8f82c584948325fa0b692212bb8656c54d847fcd0ac8191652b056e96b5073f88b13c245797c8ceb26365bee4ce2bd0cca45f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-designateclient-doc"

RDEPENDS:${PN} += ""

inherit rpm
