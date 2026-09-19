SUMMARY = "Library for building terminal user interfaces"
DESCRIPTION = "OpenTUI is a library for building terminal user interfaces. Layout, text \
shaping, buffer diffing and rendering are done by a native core written in \
Zig, which TypeScript programs drive over FFI. \
 \
This package contains that native core. The TypeScript that calls it is in \
opentui-devel."
LICENSE = "MIT & (Unlicense | MIT-0)"

PV = "0.4.5"

RPM_NAME = "opentui-0.4.5-1.1.aarch64.rpm"
RPM_HASH = "dde7276f2f13d264afebc4db1f6cbc76add24c518e7a9003170eb43a487342981876668ecab7211b478c805afe501339d1e8900e65aa9b704ba5e57d9954bbda"

RPROVIDES:${PN} += "bundled-miniaudio \
bundled-uucode \
bundled-yoga \
libopentui.so \
opentui"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6"

inherit rpm
