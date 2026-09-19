SUMMARY = "Native file dialog library with C and C++ bindings"
DESCRIPTION = "A small C library with that portably invokes native file open, folder \
select and file save dialogs. Write dialog code once and have it pop up \
native dialogs on all supported platforms. Avoid linking large \
dependencies like wxWidgets and Qt. \
This library is based on Michael Labbe's Native File Dialog \
(mlabbe/nativefiledialog)."
LICENSE = "Zlib"

PV = "1.2.1"

RPM_NAME = "libnfd1-1.2.1-1.5.aarch64.rpm"
RPM_HASH = "a585a97f72cea2231c971039d2494d1e0fc95344f423ef1e50283118065194589ae929cd94840e65ff69e2324d20a52c561f44e97027ea65b8cc99991fabc802"

RPROVIDES:${PN} += "libnfd.so.1 \
libnfd1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
