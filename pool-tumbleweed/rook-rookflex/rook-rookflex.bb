SUMMARY = "Rook FlexVolume driver"
DESCRIPTION = "Rook uses FlexVolume to integrate with Kubernetes for performing storage \
operations."
LICENSE = "Apache-2.0"

PV = "1.6.2+git0.ge8fd65f08"

RPM_NAME = "rook-rookflex-1.6.2+git0.ge8fd65f08-3.16.aarch64.rpm"
RPM_HASH = "d2259d143b796ea590befd28e4f3b27ec1736f827bc41f36fe8190efc623b7857cd8547828ee14ad4960ddb9f462120f693f1e1e52d8ec85a9785a5f8b3d399d"

RPROVIDES:${PN} += "rook-rookflex"

RDEPENDS:${PN} += ""

inherit rpm
