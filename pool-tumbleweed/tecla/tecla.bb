SUMMARY = "Interactive command line editing library"
DESCRIPTION = "The tecla library provides programs with interactive command line \
editing facilities, similar to those of the tcsh shell. \
In addition to simple command-line editing, it supports recall of \
previously entered command lines, TAB completion of file names or \
other tokens, and in-line wild-card expansion of filenames. The \
internal functions which perform file-name completion and wild-card \
expansion are also available externally for optional use by programs."
LICENSE = "X11"

PV = "1.6.3"

RPM_NAME = "tecla-1.6.3-4.9.aarch64.rpm"
RPM_HASH = "057bb32c8cb0628ae4389db512305ec61e8f09834cca9dba323ca68a5712fd5e5b0eaf5a4e5de1dea3a3efacbe5988c80ecbe6fd767e706dffaeb7a2a8f3b16e"

RPROVIDES:${PN} += "tecla"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtecla-r.so.1"

inherit rpm
