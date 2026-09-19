SUMMARY = "Provides scores for Emacs games"
DESCRIPTION = "This package provides capability to play games for members of the user \
group called 'games'."
LICENSE = "GPL-3.0-or-later"

PV = "31.1"

RPM_NAME = "emacs-games-31.1-3.1.aarch64.rpm"
RPM_HASH = "b30919a259592e59020548b8ba19a393a193d77c5b3e4506be56ee8f2c4dfa538cfda01cd1baba0e9222e17215b0c524d9d79b22c8353a9c5e3d719c2e650d6c"

RPROVIDES:${PN} += "emacs-/var/games/emacs \
emacs-games"

RDEPENDS:${PN} += "emacs \
group-games \
ld-linux-aarch64.so.1 \
libc.so.6 \
permissions \
user-games"

inherit rpm
