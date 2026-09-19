SUMMARY = "WebDriver service implementation for WPE  WebKit"
DESCRIPTION = "WPE allows embedders to create simple and performant systems based on \
Web platform technologies. It is designed with hardware acceleration \
in mind, leveraging common 3D graphics APIs for best performance."
LICENSE = "BSD-3-Clause & LGPL-2.1-only"

PV = "2.52.6"

RPM_NAME = "WPEWebDriver-2.52.6-1.1.aarch64.rpm"
RPM_HASH = "16c82f6a393813bc202aa2a747c60343354130c6b1feee99b408d446ef502b48e96d21fe3c2c96e8de06126b705c36c277f2f4c0855617757a9b134711a59cd7"

RPROVIDES:${PN} += "WPEWebDriver"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbacktrace.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libicui18n.so.78 \
libicuuc.so.78 \
libm.so.6 \
libsoup-3.0.so.0 \
libstdc++.so.6 \
libsystemd.so.0"

inherit rpm
