SUMMARY = "The Runtime for the Curses Development Kit - Shared library"
DESCRIPTION = "CDK is a widget set developed on top of the basic curses library. It \
contains 21 ready to use widgets, some of which are: a text entry \
field, a scrolling list, a selection list, an alphalist, a pull-down \
menu, a radio list, a viewer widget, and a dialog box."
LICENSE = "BSD-3-Clause"

PV = "5.0.20230201"

RPM_NAME = "libcdk6_3_4-5.0.20230201-1.11.aarch64.rpm"
RPM_HASH = "cd9595e90f4e4b89c240ef5a9f2614c9ea379f1dcb2a077b3a82a557b584f744d9899173b797a44244062d30297d90c005abf1c7d92dfe8f46be851e31ef4716"

RPROVIDES:${PN} += "libcdk.so.6.3.4 \
libcdk6-3-4 \
libcdkw.so.6.3.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses.so.6 \
libncursesw.so.6 \
libtinfo.so.6"

inherit rpm
