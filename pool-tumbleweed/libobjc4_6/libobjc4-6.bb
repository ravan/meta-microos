SUMMARY = "GNUstep Objective-C Runtime"
DESCRIPTION = "The GNUstep Objective-C runtime is designed as a drop-in replacement for the \
GCC runtime.  It supports both a legacy and a modern ABI, allowing code \
compiled with old versions of GCC to be supported without requiring \
recompilation.  The modern ABI adds the following features: \
 \
- Non-fragile instance variables. \
- Protocol uniquing. \
- Object planes support. \
- Declared property introspection."
LICENSE = "MIT"

PV = "2.3"

RPM_NAME = "libobjc4_6-2.3-1.4.aarch64.rpm"
RPM_HASH = "a104b77f89c9260f44a4889956a58ee405d86aaaf2e17200cf0794d88986ff2c11f6fd5392c60cd67bf9704d055e059935421b72866356f46ecec964137733e3"

RPROVIDES:${PN} += "libobjc.so.4.6 \
libobjc4-6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
