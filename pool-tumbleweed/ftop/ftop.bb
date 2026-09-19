SUMMARY = "Open File Monitoring"
DESCRIPTION = "Ftop is to files what top is to processes. The progress of all open files and \
file systems can be monitored. If run as a regular user, the set of open files \
will be limited to those in that user's processes (which is generally all that \
is of interest to the user). In any case, the selection of which files to \
display is possible through a wide assortment of options. As with top, the \
items are displayed in order from most to least active."
LICENSE = "GPL-3.0-only"

PV = "1.0"

RPM_NAME = "ftop-1.0-3.9.aarch64.rpm"
RPM_HASH = "d747290594db9b0ace1a0c88bb2d245f6b3cd0fc0ca55b7cabba31a22b83f277317195db04510a7c5cf5cc06f61c0dd3729b84ecbec4ac033a4a0bb0edea956d"

RPROVIDES:${PN} += "ftop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
