SUMMARY = "XCB utility module for the Render extension"
DESCRIPTION = "The XCB util modules provide a number of libraries which sit on top \
of libxcb, the core X protocol library, and some of the extension \
libraries. \
 \
Included in this package is: \
 \
- renderutil: Convenience functions for the Render extension."
LICENSE = "MIT"

PV = "0.3.10"

RPM_NAME = "libxcb-render-util0-0.3.10-1.12.aarch64.rpm"
RPM_HASH = "5945bc74c874cf04c61accd1fac6dcd214ae1d1a9a98c15388240530f1ff8fe34d88d6648445a6392e23fa10d19c943a2b2b2760a8fbff6a7d4f6e42fabc2782"

RPROVIDES:${PN} += "libxcb-render-util.so.0 \
libxcb-render-util0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb-render.so.0 \
libxcb.so.1"

inherit rpm
