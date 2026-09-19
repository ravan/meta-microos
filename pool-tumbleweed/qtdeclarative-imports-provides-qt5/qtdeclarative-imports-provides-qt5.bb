SUMMARY = "RPM provides for QML modules from qtdeclarative"
DESCRIPTION = "A separately built package to avoid a build cycle."
LICENSE = "GPL-3.0-or-later"

PV = "1.0"

RPM_NAME = "qtdeclarative-imports-provides-qt5-1.0-1.36.aarch64.rpm"
RPM_HASH = "2154638c99455818c1dbcac927ac8c903fd109a3607ce16ca4781406f9aa477103a977854f1393c726f0b90faf930d437ec5618a7dd08645a91d93e55660fce8"

RPROVIDES:${PN} += "qt5qmlimport-Qt.labs.animation.1 \
qt5qmlimport-Qt.labs.folderlistmodel.1 \
qt5qmlimport-Qt.labs.folderlistmodel.2 \
qt5qmlimport-Qt.labs.qmlmodels.1 \
qt5qmlimport-Qt.labs.settings.1 \
qt5qmlimport-Qt.labs.sharedimage.1 \
qt5qmlimport-Qt.labs.wavefrontmesh.1 \
qt5qmlimport-QtQml.2 \
qt5qmlimport-QtQml.Models.2 \
qt5qmlimport-QtQml.StateMachine.1 \
qt5qmlimport-QtQml.WorkerScript.2 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-QtQuick.LocalStorage.2 \
qt5qmlimport-QtQuick.Particles.2 \
qt5qmlimport-QtQuick.Shapes.1 \
qt5qmlimport-QtQuick.Window.2 \
qtdeclarative-imports-provides-qt5"

RDEPENDS:${PN} += "libQtQuick5"

inherit rpm
