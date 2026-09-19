SUMMARY = "C/C++ with Lua Integration Tool"
DESCRIPTION = "tolua++ is an extended version of tolua, a tool to integrate C/C++ code with \
Lua. tolua++ includes new features oriented to c++ such as: \
* support for std::string as a basic type (this can be turned off by a command \
  line option) \
* support for class templates"
LICENSE = "MIT"

PV = "1.0.93"

RPM_NAME = "toluapp-5.4-1.0.93-13.4.aarch64.rpm"
RPM_HASH = "0cc53cf5354b832ccc0233c7c7dd22312538720d980b3fabc260ead8ed819ea5c421f683f6cf2d1ba9bdb4996384f7515e593f70bc74ac4d980fc10024164820"

RPROVIDES:${PN} += "toluapp-5.4"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
liblua5.4.so.5 \
libm.so.6 \
libtolua++-5.4.so.1 \
update-alternatives"

inherit rpm
