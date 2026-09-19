SUMMARY = "A command-line fuzzy finder"
DESCRIPTION = "fzf is an interactive Unix filter for command-line that can be used with any list; files, \
command history, processes, hostnames, bookmarks, git commits, etc."
LICENSE = "MIT"

PV = "0.74.3"

RPM_NAME = "fzf-0.74.3-1.1.aarch64.rpm"
RPM_HASH = "40a779d093a1ecd914b795c88925a46dc037464f88add67fbbb921a89d0f4e83882a2640fcba5648973e8596b2d17ce3f404450a9281130ae0704f4e3b75365a"

RPROVIDES:${PN} += "fzf"

RDEPENDS:${PN} += "/usr/bin/bash \
libc.so.6"

inherit rpm
