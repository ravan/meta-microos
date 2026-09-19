SUMMARY = "Inspect binary from sparse"
DESCRIPTION = "test-inspect is a gtk frontend for sparse."
LICENSE = "MIT"

PV = "0.6.5~rc1+20251218"

RPM_NAME = "sparse-inspect-0.6.5~rc1+20251218-1.2.aarch64.rpm"
RPM_HASH = "ac306b7b9558929f2d2a1798cd7097005d61d923cdf2446b791e53942d3a095f5aaf30613d993dc4488b4dd687ef3c9e9ed0ea6c3180f95a76f0bea7cc391dbe"

RPROVIDES:${PN} += "sparse-inspect"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
