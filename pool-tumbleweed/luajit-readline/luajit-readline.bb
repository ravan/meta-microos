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

RPM_NAME = "luajit-readline-3.0-5.3.aarch64.rpm"
RPM_HASH = "685a2e201fb505ad9dca6abcecf150e796940a7bd877917cc66f20c443c5ed1052ad283ce0ca0068765dbc7f2a921943565898d6a4a8bcf882efa2dbe7351350"

RPROVIDES:${PN} += "luajit-readline"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libluajit-5.1.so.2 \
libreadline.so.8 \
luajit-luaposix"

inherit rpm
