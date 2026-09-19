SUMMARY = "A JavaScript bundler written for speed"
DESCRIPTION = "esbuild is a JavaScript bundler and minifier. \
 \
%{gopkg}"
LICENSE = "MIT"

PV = "0.28.2"

RPM_NAME = "esbuild-0.28.2-1.1.aarch64.rpm"
RPM_HASH = "5860653d851d3b94d8bb003a0cad82b8eb6daf91a3648f8db8e6f2889c8f5865f13b63a778b71e6bc3a6ce0674ee14bc7e3fd9a6b30c98438b21c5d210b25abd"

RPROVIDES:${PN} += "esbuild"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
