SUMMARY = "Documentation of libqxp API"
DESCRIPTION = "The libqxp-doc package contains documentation files for libqxp."
LICENSE = "MPL-2.0"

PV = "0.0.3"

RPM_NAME = "libqxp-doc-0.0.3-2.3.noarch.rpm"
RPM_HASH = "c63c17b5b5687201d7dbecce484bb652801bb13a46500095ca420ca8f659e76e937a08b5571b08d3a79dcd0de6279c3d6905d5924b6302f74ca85e8fdd20c424"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqxp-doc"

RDEPENDS:${PN} += ""

inherit rpm
