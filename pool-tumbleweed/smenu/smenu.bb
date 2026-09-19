SUMMARY = "A standard input word picker"
DESCRIPTION = "This tool reads words from a file or standard input, presents them in an \
interactive window after the current line on the terminal, and writes the \
selected words, if any, to standard output."
LICENSE = "GPL-2.0-only"

PV = "1.5.0"

RPM_NAME = "smenu-1.5.0-1.5.aarch64.rpm"
RPM_HASH = "1c21580d038dfa0657511f2c41f9b76efe2625a8bb4f7eb76e9f43d3caf38100c2c6ea3131dc036aaaf905faeacb8994f58b65063dc32644f4e117de4e2b5d58"

RPROVIDES:${PN} += "smenu"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtinfo.so.6"

inherit rpm
