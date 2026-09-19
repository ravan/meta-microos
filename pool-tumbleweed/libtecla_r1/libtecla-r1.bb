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

RPM_NAME = "libtecla_r1-1.6.3-4.9.aarch64.rpm"
RPM_HASH = "4ab8e0fa6ae0a99300d7674e8c55b0045e3e8244a452ea40e3903a0ff19d2337cf1ac4f3238d1a48dace93809ce182df1bbb631daca57b5d01cc7b2dc43a9cde"

RPROVIDES:${PN} += "libtecla-r.so.1 \
libtecla-r1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtinfo.so.6"

inherit rpm
