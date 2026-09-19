SUMMARY = "Development files for prometheus-cpp"
DESCRIPTION = "Prometheus-cpp aims to enable Metrics-Driven Development for C++ services. It \
implements the Prometheus Data Model, a powerful abstraction on which to collect \
and expose metrics. It offers the possibility for metrics to be collected by \
Prometheus, but other push/pull collections can be added as plugins. \
 \
This package provides development files for prometheus-cpp."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "prometheus-cpp-devel-1.3.0-1.3.aarch64.rpm"
RPM_HASH = "ee19b1c944b36efedd3a76e4692099c90eda8c6fdae0a9ed417b77d51ae8a847a75383791a37310d765dad69be05bec6d4be8f58890f85a17b85627053c2381e"

RPROVIDES:${PN} += "cmake-prometheus-cpp \
pkgconfig-prometheus-cpp-core \
pkgconfig-prometheus-cpp-pull \
pkgconfig-prometheus-cpp-push \
prometheus-cpp-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libprometheus-cpp1-3 \
pkgconfig-libcurl \
pkgconfig-prometheus-cpp-core \
pkgconfig-zlib"

inherit rpm
