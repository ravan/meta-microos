SUMMARY = "Portable System Statistics Tools"
DESCRIPTION = "This package includes a couple of useful tools that use the libstatgrab library. \
- saidar: provides a curses-based interface to viewing the current state of the system \
This extends the use of libstatgrab to people writing scripts or anything else \
that can't easily make C function calls."
LICENSE = "GPL-2.0-or-later"

PV = "0.92.1"

RPM_NAME = "saidar-0.92.1-2.1.aarch64.rpm"
RPM_HASH = "c8916f5195c574d3959909c85ea1025ce2ed70e8f180cab0011a554bf889f98bb8464ffa971bfb642ea6ce58b3c55231a526dc7977634d7da5f6b65b9b5572cb"

RPROVIDES:${PN} += "saidar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses.so.6 \
libstatgrab.so.10 \
libstatgrab10 \
libtinfo.so.6"

inherit rpm
