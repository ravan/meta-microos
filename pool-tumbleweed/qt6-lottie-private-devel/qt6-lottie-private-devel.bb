SUMMARY = "Non-ABI stable API for the Qt6 6 Lottie library"
DESCRIPTION = "This package provides private headers of libQt6Lottie that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-lottie-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "fc301c9e5fd8f2919818889aa8d4f637ab6aba6d7d422292422e7c029a83d9be960ba7c40c17814843a8057b8d3b0bbfcd152b8fec52b1d069e2215df691da26"

RPROVIDES:${PN} += "cmake-Qt6LottiePrivate \
qt6-lottie-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Lottie"

inherit rpm
