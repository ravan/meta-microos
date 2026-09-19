SUMMARY = "Greatly simplifies the integration of C/C++ code with Lua"
DESCRIPTION = "tolua is a tool that greatly simplifies the integration of \
C/C++ code with Lua. \
 \
Based on a 'cleaned' header file, tolua automatically generates \
the binding code to access C/C++ features from Lua. \
 \
Using Lua-5.0 API and tag method facilities, the current version \
automatically maps C/C++ constants, external variables, functions, \
namespace, classes, and methods to Lua. It also provides \
facilities to create Lua modules."
LICENSE = "GPL-2.0-or-later"

PV = "5.2.4"

RPM_NAME = "tolua-5.2.4-5.9.aarch64.rpm"
RPM_HASH = "c12255df137240d51513f396a9861c8892568e682d8b8996eedf4d320d132aadad2fc8e0d87a39309b1fd109c0420e49efe6cbe41ebceff527e7da996f4ce168"

RPROVIDES:${PN} += "tolua"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblua5.4.so.5 \
libtolua5"

inherit rpm
