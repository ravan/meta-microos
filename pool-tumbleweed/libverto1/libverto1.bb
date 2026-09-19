SUMMARY = "Runtime libraries for libverto"
DESCRIPTION = "libverto provides a way for libraries to expose asynchronous \
interfaces without having to choose a particular event loop, \
offloading this decision to the end application which consumes the \
library. \
 \
If you are packaging an application, not library, based on libverto, \
you should depend either on a specific implementation module or you \
can depend on the virtual provides 'libverto-module-base'. This will \
ensure that you have at least one module installed that provides io, \
timeout and signal functionality. Currently glib is the only module \
that does not provide these three because it lacks signal. However, \
glib will support signal in the future."
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "libverto1-0.3.2-3.11.aarch64.rpm"
RPM_HASH = "bceaea1f4c3029d17002b580c6450749efdefbf051db4f1b90c683e740951f7d9d69993aaf341c0d170065854998c9741e61aeedffd2a337cbb035da4b4029bb"

RPROVIDES:${PN} += "libverto.so.1 \
libverto1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
