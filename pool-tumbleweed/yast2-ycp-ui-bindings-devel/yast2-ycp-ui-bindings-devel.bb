SUMMARY = "YaST2 - YCP Bindings for the YaST2 User Interface Engine"
DESCRIPTION = "This is the development package that makes the generic YaST2 user \
interface engine available for YCP applications (YCP is the scripting \
language in which most YaST2 modules are written)."
LICENSE = "GPL-2.0-only"

PV = "5.0.1"

RPM_NAME = "yast2-ycp-ui-bindings-devel-5.0.1-1.8.aarch64.rpm"
RPM_HASH = "a9c28b53fba392f7c46f432471b1e4b346317d95d56621ee2922fab522cc28ae79b48cfa6766202521e5ed77a9441920f57701ff1797a0b0e10abcd853d51ab1"

RPROVIDES:${PN} += "pkgconfig-yast2-ycp-ui-bindings \
yast2-ycp-ui-bindings-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
boost-devel \
glibc-devel \
libstdc++-devel \
libyui-devel \
yast2-core-devel \
yast2-devtools \
yast2-ycp-ui-bindings"

inherit rpm
