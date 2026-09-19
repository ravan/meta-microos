SUMMARY = "a simple interface to the readline and history libraries"
DESCRIPTION = "This Lua module offers a simple calling interface to the GNU \
Readline/History Library. \
 \
The function readline() is a wrapper, which invokes the GNU readline, \
adds the line to the end of the History List, and then returns the line. \
Usually you call save_history() before the program exits, so that the \
History List is saved to the histfile. \
 \
Various options can be changed using the set_options{} function. \
 \
This module does not work lua -i because that runs its own readline, and \
the two conflict with each other."
LICENSE = "MIT"

PV = "3.0"

RPM_NAME = "lua53-readline-3.0-5.3.aarch64.rpm"
RPM_HASH = "52dcbcc919fa7ececfe51b7b81838db9cfa6078b1eb008090e07737d19e54ced378810c812a807dd8d8bc0f5a1bd71d727649a664f6cbb84e0c2e11a32a8e60c"

RPROVIDES:${PN} += "lua53-readline"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblua5.3.so.5 \
libreadline.so.8 \
lua53-luaposix"

inherit rpm
