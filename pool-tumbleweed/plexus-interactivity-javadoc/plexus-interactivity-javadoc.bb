SUMMARY = "API documentation for plexus-interactivity"
DESCRIPTION = "This package provides API documentation for plexus-interactivity."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "plexus-interactivity-javadoc-1.5.1-2.2.noarch.rpm"
RPM_HASH = "9eafe89c89b23d287758cdc9aedc020fe0ced8a2aca481d0e6164174a254482d430abd895bcf087546aca417e1bafc650a112d85fee39605786db384b728e56b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-interactivity-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
