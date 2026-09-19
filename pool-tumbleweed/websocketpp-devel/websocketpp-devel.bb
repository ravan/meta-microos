SUMMARY = "Development files for websocketpp, a C++ WebSocket Protocol Library"
DESCRIPTION = "WebSocket++ is a header-only C++ library \
that implements RFC6455, the WebSocket protocol. It allows integrating \
WebSocket client and server functionality into C++ programs. It uses \
interchangeable network transport modules including one based on C++ \
iostreams and one based on Boost Asio."
LICENSE = "BSD-3-Clause"

PV = "0.8.2"

RPM_NAME = "websocketpp-devel-0.8.2-5.4.noarch.rpm"
RPM_HASH = "0d49be7e68fed4e5daf3ba512c1305fe8347075f3b2c156ee2118f5550bec2fa8ee2b1f861b941d71be5c9101308eec32571742c7fc20e03e2b3b2552249f991"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cmake-websocketpp \
pkgconfig-websocketpp \
websocketpp-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
