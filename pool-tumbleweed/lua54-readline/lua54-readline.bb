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

RPM_NAME = "lua54-readline-3.0-5.3.aarch64.rpm"
RPM_HASH = "b76498c7da0152e199c63bf405db88106fe9a5ac97fe8b6c712dd37f4807c8d27e4864f76df444ff4dfd2615190393dd66999cc832a14c691944173d7278f40f"

RPROVIDES:${PN} += "lua-readline \
lua54-readline"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblua5.4.so.5 \
libreadline.so.8 \
lua54-luaposix"

inherit rpm
