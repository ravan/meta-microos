SUMMARY = "The X11 Protocol collection (documentation)"
DESCRIPTION = "Documentation for X11 protocol headers."
LICENSE = "MIT"

PV = "2025.1"

RPM_NAME = "xorgproto-doc-2025.1-1.3.noarch.rpm"
RPM_HASH = "998de8fbb2132ec30b983b28f72f8261a515017f604a85027c8e238ca991bd613e10647b46139cf965764cc57d7f25fdbff25240ed4ccd4037b525aae278fae0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xorgproto-doc"

RDEPENDS:${PN} += ""

inherit rpm
