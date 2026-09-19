SUMMARY = "A fuzzy text selector"
DESCRIPTION = "fzy can be used to filter any list: files, command history, processes, \
hostnames, bookmarks, git commits, etc. It's designed to be used both as an \
editor plugin and on the command line. Rather than clearing the screen, fzy \
displays its interface directly below the current cursor position, scrolling \
the screen if necessary."
LICENSE = "MIT"

PV = "1.1"

RPM_NAME = "fzy-1.1-1.5.aarch64.rpm"
RPM_HASH = "8637a9d70452c081f981797f2b9f71dc24aff7592dfdbe8ad20aa0f418645547f7bffa90e51c86c4a1a30e988da8d1a618ae397a07d7b5eaddac8a0c3be568b3"

RPROVIDES:${PN} += "fzy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
