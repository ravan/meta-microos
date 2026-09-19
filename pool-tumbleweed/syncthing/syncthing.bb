SUMMARY = "Continuous File Synchronisation"
DESCRIPTION = "Syncthing is an application that synchronises files across multiple \
devices. This means the creation, modification or deletion of files \
on one machine will automatically be replicated to other devices."
LICENSE = "MPL-2.0"

PV = "2.1.5"

RPM_NAME = "syncthing-2.1.5-1.1.aarch64.rpm"
RPM_HASH = "b4f44eacee89da822deefbd98325b981903aa73356541143ccf700d415c933a628c9f5593be2409e38dfcf429a24fa8652b5ed4ed0b54c962f9a164edc8de0ae"

RPROVIDES:${PN} += "syncthing"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libsqlite3.so.0"

inherit rpm
