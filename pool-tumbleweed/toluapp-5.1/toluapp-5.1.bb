SUMMARY = "C/C++ with Lua Integration Tool"
DESCRIPTION = "tolua++ is an extended version of tolua, a tool to integrate C/C++ code with \
Lua. tolua++ includes new features oriented to c++ such as: \
* support for std::string as a basic type (this can be turned off by a command \
  line option) \
* support for class templates"
LICENSE = "MIT"

PV = "1.0.93"

RPM_NAME = "toluapp-5.1-1.0.93-13.4.aarch64.rpm"
RPM_HASH = "02091895945c2d33a3da36784080831dd055ec1f80c66f84c583d9f44d6435257c3e0cb884c848cbfdf17491aea2f62edfd354c3078bbd3385e885218bbbd0d9"

RPROVIDES:${PN} += "toluapp-5.1"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libluajit-5.1.so.2 \
libm.so.6 \
libtolua++-5.1.so.1 \
update-alternatives"

inherit rpm
