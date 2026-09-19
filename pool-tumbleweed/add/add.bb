SUMMARY = "Fixed-point calculator that operates as a full-screen editor"
DESCRIPTION = "add is a fixed-point calculator that operates as a full-screen editor. It is \
designed for use as a checkbook or expense-account balancing tool. \
 \
add maintains a running result for each operation. You may scroll to any \
position in the expression list and modify the list. Enter data by typing \
numbers (with optional decimal point), separated by operators. \
 \
An output transcript may be saved and reloaded for further editing."
LICENSE = "MIT"

PV = "20250914"

RPM_NAME = "add-20250914-1.4.aarch64.rpm"
RPM_HASH = "92a731467cd1a3bf6585016a349793b8f4fce42a09c3a04706d7c66695d0458f9e94777527da3d68366b8d4688af49a79cabafb0c08f8cb2e97dd8710fa80d88"

RPROVIDES:${PN} += "add"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
