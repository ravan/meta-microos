SUMMARY = "The Readline Library"
DESCRIPTION = "The readline library is used by the Bourne Again Shell (bash, the \
standard command interpreter) for easy editing of command lines.  This \
includes history and search functionality."
LICENSE = "GPL-3.0-or-later"

PV = "8.3.3"

RPM_NAME = "libreadline8-8.3.3-2.6.aarch64.rpm"
RPM_HASH = "16585f4e408b195923f6e934c7cf398276942fa36fa309819870ff5b92bb6fb7d9fb7ce9891c0e2b94254ecada3e57a4bd213f41855ecce6ebc05371f8b0af68"

RPROVIDES:${PN} += "bash-/lib64/libreadline.so.8 \
libhistory.so.8 \
libreadline.so.8 \
libreadline8 \
readline"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtinfo.so.6"

inherit rpm
