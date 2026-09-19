SUMMARY = "Tcl/Tk Front-End for hfsutils"
DESCRIPTION = "A Tcl interface for scriptable access to volumes and  Tk-based \
front-end for browsing and copying files through a variety of transfer \
modes (MacBinary, BinHex, text, etc.) for hfsutils."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.6"

RPM_NAME = "xhfsutil-3.2.6-1247.9.aarch64.rpm"
RPM_HASH = "05a5952dc8e65dd9d72892184aac4f869dc52052ead7f50fb510949e34bd0144de2c438dbf4ef80841aae3ee6b753c6408fc8aae601425d0714a45351f74a9c0"

RPROVIDES:${PN} += "xhfsutil"

RDEPENDS:${PN} += "/usr/bin/sh \
hfsutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtcl8.6.so \
libtk8.6.so"

inherit rpm
