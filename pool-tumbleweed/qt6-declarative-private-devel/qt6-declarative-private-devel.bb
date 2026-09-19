SUMMARY = "Qt 6 Declarative unstable ABI meta package"
DESCRIPTION = "This meta-package requires all the qt6-declarative development packages that do \
not have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-declarative-private-devel-6.11.2-2.1.noarch.rpm"
RPM_HASH = "18a555d3b3fcd1ae45a278f8cf4175ed0adeb95f5cf3a8294cfb96ba8caa464dfa6d559bbda7ad469f6d5aea3f5fa3236d9c03d0d2621141a54cb2c46786a572"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qt6-declarative-private-devel"

RDEPENDS:${PN} += "cmake-Qt6LabsStyleKit \
cmake-Qt6QmlCompilerPrivate \
cmake-Qt6QmlCorePrivate \
cmake-Qt6QmlLocalStoragePrivate \
cmake-Qt6QmlMetaPrivate \
cmake-Qt6QmlModelsPrivate \
cmake-Qt6QmlNetworkPrivate \
cmake-Qt6QmlPrivate \
cmake-Qt6QmlWorkerScriptPrivate \
cmake-Qt6QmlXmlListModelPrivate \
cmake-Qt6QuickControls2ImplPrivate \
cmake-Qt6QuickControls2Private \
cmake-Qt6QuickDialogs2Private \
cmake-Qt6QuickDialogs2QuickImplPrivate \
cmake-Qt6QuickDialogs2UtilsPrivate \
cmake-Qt6QuickEffectsPrivate \
cmake-Qt6QuickLayoutsPrivate \
cmake-Qt6QuickParticlesPrivate \
cmake-Qt6QuickPrivate \
cmake-Qt6QuickShapesPrivate \
cmake-Qt6QuickTemplates2Private \
cmake-Qt6QuickTestPrivate \
cmake-Qt6QuickVectorImagePrivate \
cmake-Qt6QuickWidgetsPrivate"

inherit rpm
