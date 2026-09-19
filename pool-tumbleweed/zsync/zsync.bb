SUMMARY = "Client-side Implementation of the Rsync Algorithm over HTTP"
DESCRIPTION = "zsync is a implementation of rsync over HTTP. It allows updating of files from \
a remote Web server without requiring a full download or a special remote \
server application. It uses a metafile, which is created on the server, \
to determine which parts of a file the user already has; it then downloads \
the remaining parts via HTTP. No special server or Web server module is \
needed. It also works with gzip files, and content on the server can be \
compressed to further reduce download times."
LICENSE = "Artistic-2.0"

PV = "0.6.3"

RPM_NAME = "zsync-0.6.3-1.6.aarch64.rpm"
RPM_HASH = "9308d7acbddf23fd289b88657b689a11618f7655a8e25aeec237abf7e855de66c98858de3eb8c0bf54c35acaf5433ba214682b3f50a5b9b0e384c7b3765124f1"

RPROVIDES:${PN} += "zsync"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
