SUMMARY = "Cisco-like telnet command-line library"
DESCRIPTION = "libcli provides a shared library for including a Cisco-like command-line \
interface into other software. It's a telnet interface which supports \
command-line editing, history, authentication and callbacks for a \
user-definable function tree."
LICENSE = "LGPL-2.1-only"

PV = "1.10.7+git.20211009"

RPM_NAME = "libcli1_10-1.10.7+git.20211009-3.8.aarch64.rpm"
RPM_HASH = "56a4b0d349cc4536137c3dc234ed7323533598aadf4ec8700c592fde6c2763f22629621d39c7832564cbfed5748bdebb7466251b1aa9fb46f0429a04eba9b7ba"

RPROVIDES:${PN} += "libcli.so.1.10 \
libcli1-10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1"

inherit rpm
