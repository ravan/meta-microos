SUMMARY = "A line-oriented text editor"
DESCRIPTION = "GNU ed is a line-oriented text editor. It is used to create, display, \
modify and otherwise manipulate text files, both interactively and via \
shell scripts. A restricted version of ed, red, can only edit files in \
the current directory and cannot execute shell commands. Ed is the \
'standard' text editor in the sense that it is the original editor for \
Unix, and thus widely available. For most purposes, however, it is \
superseded by full-screen editors such as GNU Emacs or GNU Moe."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.22.6"

RPM_NAME = "ed-1.22.6-1.1.aarch64.rpm"
RPM_HASH = "2344ef56dfc2643f378f06bcc0b396b3612cbedbc0231fd83e99cfc2e97624d0040f9c1214221d1e7654d4348214e657f0e5a3ed9f7a06b814b0c9b7535c3d77"

RPROVIDES:${PN} += "ed"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6"

inherit rpm
