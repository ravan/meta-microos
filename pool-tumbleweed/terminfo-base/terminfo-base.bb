SUMMARY = "A terminal descriptions database"
DESCRIPTION = "This is the terminfo basic database, maintained in the ncurses package. \
This database is the official successor to the 4.4BSD termcap file and \
contains information about any known terminal. The ncurses library \
makes use of this database to use terminals correctly."
LICENSE = "MIT"

PV = "6.6.20260815"

RPM_NAME = "terminfo-base-6.6.20260815-111.1.aarch64.rpm"
RPM_HASH = "9056fc1537c4f9d6fd6de58c895cbe9f691525abf034efce08859ae8dd1dc68126b5cabd22776d3aa815da279ffc44a8c41095b84f7844d88915195c1490e016"

RPROVIDES:${PN} += "config-terminfo-base \
ncurses-/usr/share/tabset \
terminfo-base"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtinfo.so.6"

inherit rpm
