SUMMARY = "C/C++ with Lua Integration Tool"
DESCRIPTION = "tolua++ is an extended version of tolua, a tool to integrate C/C++ code with \
Lua. tolua++ includes new features oriented to c++ such as: \
* support for std::string as a basic type (this can be turned off by a command \
  line option) \
* support for class templates"
LICENSE = "MIT"

PV = "1.0.93"

RPM_NAME = "toluapp-5.3-1.0.93-13.4.aarch64.rpm"
RPM_HASH = "3a4155edf594fe8f6429fa1a07f7885d2eb29edef8992a0fb71ab76b7902cc83e5691d2997ee9f02fe4bb55f87b40ee7724d640d891ff14f73ee3229cf996a02"

RPROVIDES:${PN} += "toluapp-5.3"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
liblua5.3.so.5 \
libm.so.6 \
libtolua++-5.3.so.1 \
update-alternatives"

inherit rpm
