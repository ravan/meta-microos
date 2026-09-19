SUMMARY = "The eppic extension for crash"
DESCRIPTION = "EPPIC is a C interpreter that permits easy access to the symbol and type \
information stored in a executable image like a coredump or live memory \
interfaces (e.g. /dev/kmem, /dev/mem). Although it has a strong association \
with live or postmortem kernel analysis, it is not constraint to it and can be \
embedded in any tools that is C friendly. \
 \
This package provides the extension for the crash utility."
LICENSE = "GPL-2.0-or-later"

PV = "4.99.git.1773318907.51b15e7"

RPM_NAME = "crash-eppic-4.99.git.1773318907.51b15e7-1.4.aarch64.rpm"
RPM_HASH = "b4045d93237299f8ead170ad29aca82fabde8f6af24a583c7bb4c9d4b57278b9519e33873dc6dfd742b9b6927c28807f31feb3d098a3bad46b7082607eb9ec9a"

RPROVIDES:${PN} += "crash-eppic"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
