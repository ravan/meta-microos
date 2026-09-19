SUMMARY = "LeechCraft Development Files"
DESCRIPTION = "This package provides files required for development of \
new LeechCraft modules."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-devel-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "09546a28ec9ef8fa1e3da5e804760693b67ceb9d3fda9595da2ae713f1239a932c0b3ad8b3dd38f5c5b1c0cac82ccc9c7abaeff89b3bc623498895445b933e43"

RPROVIDES:${PN} += "leechcraft-devel"

RDEPENDS:${PN} += "cmake \
cmake-Qt6LinguistTools \
leechcraft \
libleechcraft-util-azoth-qt6-0-6-75 \
libleechcraft-util-db-qt6-0-6-75 \
libleechcraft-util-gui-qt6-0-6-75 \
libleechcraft-util-lmp-qt6-0-6-75 \
libleechcraft-util-models-qt6-0-6-75 \
libleechcraft-util-monocle-qt6-0-6-75 \
libleechcraft-util-network-qt6-0-6-75 \
libleechcraft-util-qml-qt6-0-6-75 \
libleechcraft-util-shortcuts-qt6-0-6-75 \
libleechcraft-util-sll-qt6-0-6-75 \
libleechcraft-util-svcauth-qt6-0-6-75 \
libleechcraft-util-sys-qt6-0-6-75 \
libleechcraft-util-tags-qt6-0-6-75 \
libleechcraft-util-x11-qt6-0-6-75 \
libleechcraft-util-xdg-qt6-0-6-75 \
libleechcraft-util-xpc-qt6-0-6-75 \
libleechcraft-util-xsd-qt6-0-6-75 \
pkgconfig-Qt6Network \
pkgconfig-Qt6QuickWidgets \
pkgconfig-Qt6Qwt6 \
pkgconfig-Qt6Sql \
pkgconfig-Qt6StateMachine \
pkgconfig-Qt6Test \
pkgconfig-Qt6Xml"

inherit rpm
