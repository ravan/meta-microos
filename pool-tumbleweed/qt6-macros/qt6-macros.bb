SUMMARY = "RPM macros for Qt6 packages"
DESCRIPTION = "This package provides macros which are used by Qt6 packages."
LICENSE = "MIT"

PV = "20260508"

RPM_NAME = "qt6-macros-20260508-1.2.aarch64.rpm"
RPM_HASH = "b71a5868281467d484a2779e3010b1c3911a0973631175c5b59e7ae60102f54ed5513fbfb39ce58bea683f57b913195f5f60c6dde2037b2268c009f360b2f090"

RPROVIDES:${PN} += "qt6-macros \
rpm-macro--qt6-archdatadir \
rpm-macro--qt6-bindir \
rpm-macro--qt6-cmakedir \
rpm-macro--qt6-datadir \
rpm-macro--qt6-descriptionsdir \
rpm-macro--qt6-docdir \
rpm-macro--qt6-examplesdir \
rpm-macro--qt6-importsdir \
rpm-macro--qt6-includedir \
rpm-macro--qt6-libdir \
rpm-macro--qt6-libexecdir \
rpm-macro--qt6-metatypesdir \
rpm-macro--qt6-mkspecsdir \
rpm-macro--qt6-pkgconfigdir \
rpm-macro--qt6-pluginsdir \
rpm-macro--qt6-prefix \
rpm-macro--qt6-qmldir \
rpm-macro--qt6-sharedir \
rpm-macro--qt6-sysconfdir \
rpm-macro--qt6-testsdir \
rpm-macro--qt6-translationsdir \
rpm-macro-cmake-qt6 \
rpm-macro-qmake6 \
rpm-macro-qmake6-build \
rpm-macro-qmake6-install \
rpm-macro-qt6-build \
rpm-macro-qt6-build-docs \
rpm-macro-qt6-doc-packages \
rpm-macro-qt6-docs-flavor \
rpm-macro-qt6-examples-package \
rpm-macro-qt6-install \
rpm-macro-qt6-install-docs \
rpm-macro-qt6-link-executables \
rpm-macro-qt6-use-make"

RDEPENDS:${PN} += "cmake \
ninja"

inherit rpm
