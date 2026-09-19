SUMMARY = "Luabind headers"
DESCRIPTION = "Luabind is a library that helps you create bindings between C++ and Lua. \
It has the ability to expose functions and classes, written in C++, to Lua. \
This package contains needed development files like headers."
LICENSE = "MIT"

PV = "0.9.1+git20150408.a0edf58"

RPM_NAME = "luabind-devel-0.9.1+git20150408.a0edf58-4.4.aarch64.rpm"
RPM_HASH = "91626388e5f69cc7e184e31f98ce9c15dd5ab8e22351548f627eb4432491da03561da6f1aed4df67b9c4985c6a00b699ee06cb096be03bd9dc5821bf662bcf3f"

RPROVIDES:${PN} += "luabind-devel \
pkgconfig-luabind"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libluabind0-9-1 \
lua53-devel"

inherit rpm
