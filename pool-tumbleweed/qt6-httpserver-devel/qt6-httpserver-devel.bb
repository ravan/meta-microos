SUMMARY = "Qt 6 HttpServer library - Development files"
DESCRIPTION = "Development files for the Qt 6 HttpServer library."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-httpserver-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "5afe9754aeb463435d30aad2b8e3a5360e2ef8a16c442519e76b25b642d229ac6f1956a9200605beca89d1c704a4ea3db6416ee2b6eef3e62718818ce4192248"

RPROVIDES:${PN} += "cmake-Qt6HttpServer \
pkgconfig-Qt6HttpServer \
qt6-httpserver-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Network \
cmake-Qt6WebSockets \
libQt6HttpServer6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Network \
pkgconfig-Qt6WebSockets"

inherit rpm
