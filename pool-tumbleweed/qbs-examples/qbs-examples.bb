SUMMARY = "Examples for qbs"
DESCRIPTION = "This package contains examples to show different qbs usages."
LICENSE = "LGPL-3.0-only"

PV = "3.3.1"

RPM_NAME = "qbs-examples-3.3.1-1.1.aarch64.rpm"
RPM_HASH = "9e17a94c5cb4397cd634b94f25571b4fa7305165162b40ff1ded7f9b4d83389c1d3c9ace65ff132e878392903043f905cbd6b9b31f09098691910160550b2bcf"

RPROVIDES:${PN} += "qbs-examples"

RDEPENDS:${PN} += "qbs \
qt6qmlimport-QtQml.Models \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.2 \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Window.2"

inherit rpm
