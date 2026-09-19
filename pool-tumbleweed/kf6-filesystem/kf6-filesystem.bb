SUMMARY = "RPM macros for KDE packages using Qt6"
DESCRIPTION = "This package contains macros which are used when building KDE packages."
LICENSE = "MIT"

PV = "20260508"

RPM_NAME = "kf6-filesystem-20260508-1.2.aarch64.rpm"
RPM_HASH = "45b951e6dd14ae42cb87117ef057b146aa1bb707e7ed5dfe7f7409c5fe4ccdc06dc8cba74469715dcbe6e3346afed745a95a67a6196f15b3617d21e987ef8219"

RPROVIDES:${PN} += "kf6-filesystem \
rpm-macro--kf6-applicationsdir \
rpm-macro--kf6-appsdir \
rpm-macro--kf6-appstreamdir \
rpm-macro--kf6-bindir \
rpm-macro--kf6-cmakedir \
rpm-macro--kf6-configdir \
rpm-macro--kf6-configkcfgdir \
rpm-macro--kf6-datadir \
rpm-macro--kf6-dbusinterfacesdir \
rpm-macro--kf6-dbuspolicydir \
rpm-macro--kf6-debugdir \
rpm-macro--kf6-htmldir \
rpm-macro--kf6-iconsdir \
rpm-macro--kf6-importdir \
rpm-macro--kf6-includedir \
rpm-macro--kf6-knsrcfilesdir \
rpm-macro--kf6-kxmlguidir \
rpm-macro--kf6-libdir \
rpm-macro--kf6-libexecdir \
rpm-macro--kf6-localedir \
rpm-macro--kf6-mandir \
rpm-macro--kf6-mkspecsdir \
rpm-macro--kf6-notificationsdir \
rpm-macro--kf6-pkgconfigdir \
rpm-macro--kf6-plasmadir \
rpm-macro--kf6-plugindir \
rpm-macro--kf6-pluginsdir \
rpm-macro--kf6-prefix \
rpm-macro--kf6-qchdir \
rpm-macro--kf6-qmldir \
rpm-macro--kf6-sbindir \
rpm-macro--kf6-sharedir \
rpm-macro--kf6-sysconfdir \
rpm-macro--kf6-wallpapersdir \
rpm-macro-cmake-kf6 \
rpm-macro-kf6-build \
rpm-macro-kf6-install \
rpm-macro-kf6-use-make"

RDEPENDS:${PN} += "cmake \
hicolor-icon-theme \
ninja"

inherit rpm
