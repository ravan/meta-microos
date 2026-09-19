SUMMARY = "C/C++ with Lua Integration Tool"
DESCRIPTION = "tolua++ is an extended version of tolua, a tool to integrate C/C++ code with \
Lua. tolua++ includes new features oriented to c++ such as: \
* support for std::string as a basic type (this can be turned off by a command \
  line option) \
* support for class templates"
LICENSE = "MIT"

PV = "1.0.93"

RPM_NAME = "toluapp-5.5-1.0.93-13.4.aarch64.rpm"
RPM_HASH = "340372f28423981c388b05a9335f1beaac89425d890052f3d675dd0facf059f21200ee62bc55554d6dea73db7a26b69b482aed9b61d58192aabac6db04264e6e"

RPROVIDES:${PN} += "toluapp-5.5"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
liblua5.5.so.5 \
libm.so.6 \
libtolua++-5.5.so.1 \
update-alternatives"

inherit rpm
