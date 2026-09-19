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

RPM_NAME = "lua55-readline-3.0-5.3.aarch64.rpm"
RPM_HASH = "f5d9b94fbec217362a6dc6b950edfdb2f97afb83708879fb5407b2352df673e1d40ba0e3b0293eaa910035e5334a71367edb96869dba8860ed552ac56e7f5e05"

RPROVIDES:${PN} += "lua55-readline"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblua5.5.so.5 \
libreadline.so.8 \
lua55-luaposix"

inherit rpm
