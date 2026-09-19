SUMMARY = "Cisco-like telnet command-line library"
DESCRIPTION = "libcli provides a shared library for including a Cisco-like command-line \
interface into other software. It's a telnet interface which supports \
command-line editing, history, authentication and callbacks for a \
user-definable function tree."
LICENSE = "LGPL-2.1-only"

PV = "1.10.7+git.20211009"

RPM_NAME = "libcli-devel-1.10.7+git.20211009-3.8.aarch64.rpm"
RPM_HASH = "be2e56d09fa4c9299ab605ba05c9166f82bb494694f98d2ab6a5d649a87b62247749dc2d79cef13af0ff20d3766931fed4c2cc7e37f9e05c9c122e8a4b44dbd5"

RPROVIDES:${PN} += "libcli-devel"

RDEPENDS:${PN} += "libcli1-10"

inherit rpm
