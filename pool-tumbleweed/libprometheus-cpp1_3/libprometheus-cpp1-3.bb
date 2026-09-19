SUMMARY = "Shared libraries for prometheus-cpp"
DESCRIPTION = "Prometheus-cpp aims to enable Metrics-Driven Development for C++ services. It \
implements the Prometheus Data Model, a powerful abstraction on which to collect \
and expose metrics. It offers the possibility for metrics to be collected by \
Prometheus, but other push/pull collections can be added as plugins. \
 \
This package provides development files for prometheus-cpp."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "libprometheus-cpp1_3-1.3.0-1.3.aarch64.rpm"
RPM_HASH = "d80c858d1d771642c7de099a793670eefef6a4ab63473b861bb08a5dbeee550a4cd6cc6e8e275143bef305fae44a25bb43f3d72468941a1eb827ac99fd11cf5b"

RPROVIDES:${PN} += "libprometheus-cpp-core.so.1.3 \
libprometheus-cpp-pull.so.1.3 \
libprometheus-cpp-push.so.1.3 \
libprometheus-cpp1-3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
