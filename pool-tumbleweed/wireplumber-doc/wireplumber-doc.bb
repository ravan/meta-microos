SUMMARY = "Wireplumber Session / policy manager documentation"
DESCRIPTION = "This package contains documentation for the WirePlumber \
session/policy manager for PipeWire."
LICENSE = "MIT"

PV = "0.5.17"

RPM_NAME = "wireplumber-doc-0.5.17-1.1.noarch.rpm"
RPM_HASH = "2a3b134cfdf58d9f6e111b7e0125e997e6fb22e37de18e6ea1dd41db0c2644f9ae25203bfb2f779af6100c4f4d85c3cf51aea8f3d2dc4b98a5cf2aeed3654d05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wireplumber-doc"

RDEPENDS:${PN} += ""

inherit rpm
