SUMMARY = "Qt 6 Declarative QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Declarative module."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-declarative-imports-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "6c7fb076183c20ecfeb4214e1b741c860aec185b593ad18a3ae79296636be5e0ea1fbb01cbb9f8817f35c0a7a086ff68897dbaf81fc5c8d784c7d531ec2175e8"

RPROVIDES:${PN} += "libeffectsplugin.so \
liblabsanimationplugin.so \
liblabsmodelsplugin.so \
liblabsplatformplugin.so \
liblabsstylekitimplplugin.so \
liblabsstylekitplugin.so \
liblabssynchronizerplugin.so \
libmodelsplugin.so \
libparticlesplugin.so \
libqmlfolderlistmodelplugin.so \
libqmllocalstorageplugin.so \
libqmlnetworkplugin.so \
libqmlplugin.so \
libqmlsettingsplugin.so \
libqmlshapesplugin.so \
libqmlwavefrontmeshplugin.so \
libqmlxmllistmodelplugin.so \
libqquicklayoutsplugin.so \
libqquickvectorimagehelpersplugin.so \
libqquickvectorimageplugin.so \
libqtqmlcoreplugin.so \
libqtquick2plugin.so \
libqtquickcontrols2basicstyleimplplugin.so \
libqtquickcontrols2basicstyleplugin.so \
libqtquickcontrols2fluentwinui3styleimplplugin.so \
libqtquickcontrols2fluentwinui3styleplugin.so \
libqtquickcontrols2fusionstyleimplplugin.so \
libqtquickcontrols2fusionstyleplugin.so \
libqtquickcontrols2imaginestyleimplplugin.so \
libqtquickcontrols2imaginestyleplugin.so \
libqtquickcontrols2implplugin.so \
libqtquickcontrols2materialstyleimplplugin.so \
libqtquickcontrols2materialstyleplugin.so \
libqtquickcontrols2plugin.so \
libqtquickcontrols2universalstyleimplplugin.so \
libqtquickcontrols2universalstyleplugin.so \
libqtquickdialogs2quickimplplugin.so \
libqtquickdialogsplugin.so \
libqtquickshapesdesignhelpersplugin.so \
libqtquicktemplates2plugin.so \
libquickcontrolstestutilsprivateplugin.so \
libquicktestplugin.so \
libquicktoolingplugin.so \
libquickwindowplugin.so \
libsharedimageplugin.so \
libworkerscriptplugin.so \
qt6-declarative-imports \
qt6-quickcontrols2-imports"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6LabsAnimation.so.6 \
libQt6LabsFolderListModel.so.6 \
libQt6LabsPlatform.so.6 \
libQt6LabsQmlModels.so.6 \
libQt6LabsSettings.so.6 \
libQt6LabsSharedImage.so.6 \
libQt6LabsStyleKit.so.6 \
libQt6LabsStyleKitImpl.so.6 \
libQt6LabsSynchronizer.so.6 \
libQt6LabsWavefrontMesh.so.6 \
libQt6Qml.so.6 \
libQt6QmlCore.so.6 \
libQt6QmlLocalStorage.so.6 \
libQt6QmlMeta.so.6 \
libQt6QmlModels.so.6 \
libQt6QmlNetwork.so.6 \
libQt6QmlWorkerScript.so.6 \
libQt6QmlXmlListModel.so.6 \
libQt6Quick.so.6 \
libQt6QuickControls2.so.6 \
libQt6QuickControls2Basic.so.6 \
libQt6QuickControls2BasicStyleImpl.so.6 \
libQt6QuickControls2FluentWinUI3StyleImpl.so.6 \
libQt6QuickControls2Fusion.so.6 \
libQt6QuickControls2FusionStyleImpl.so.6 \
libQt6QuickControls2Imagine.so.6 \
libQt6QuickControls2ImagineStyleImpl.so.6 \
libQt6QuickControls2Impl.so.6 \
libQt6QuickControls2Material.so.6 \
libQt6QuickControls2MaterialStyleImpl.so.6 \
libQt6QuickControls2Universal.so.6 \
libQt6QuickControls2UniversalStyleImpl.so.6 \
libQt6QuickDialogs2.so.6 \
libQt6QuickDialogs2QuickImpl.so.6 \
libQt6QuickEffects.so.6 \
libQt6QuickLayouts.so.6 \
libQt6QuickParticles.so.6 \
libQt6QuickShapes.so.6 \
libQt6QuickShapesDesignHelpers.so.6 \
libQt6QuickTemplates2.so.6 \
libQt6QuickTest.so.6 \
libQt6QuickVectorImage.so.6 \
libQt6QuickVectorImageHelpers.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
