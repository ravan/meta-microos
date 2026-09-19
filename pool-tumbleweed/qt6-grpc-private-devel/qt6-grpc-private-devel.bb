SUMMARY = "Non-ABI stable API for the Qt 6 Grpc Library"
DESCRIPTION = "This package provides private headers of libQt6Grpc that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-grpc-private-devel-6.11.2-1.3.aarch64.rpm"
RPM_HASH = "c135d74d808f5b92c3f7b2a7cf3b8fbb4aab7123899d2f814d8f9e4ceee5e08056878274da201fcb5818ba878e4d1b29e22ea31b2998fb36b69b5e5250ddb800"

RPROVIDES:${PN} += "cmake-Qt6GrpcPrivate \
cmake-Qt6GrpcQuickPrivate \
qt6-grpc-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Grpc"

inherit rpm
