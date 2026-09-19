SUMMARY = "Interactive System Activity Grapher for sysstat"
DESCRIPTION = "This package includes the isag command, which graphically displays the \
system activity data stored in a binary data produced by a sar command \
from a sysstat package."
LICENSE = "GPL-2.0-or-later"

PV = "12.7.9"

RPM_NAME = "sysstat-isag-12.7.9-1.3.aarch64.rpm"
RPM_HASH = "1cde84d1d6f1a94d55f1ebe6a78b415bfe674e6f2a687b9eab8eee054598cadd6b133133e0dced729f3943d5466483c017fdbcbf8fd2b93e1a693ef175b341bf"

RPROVIDES:${PN} += "sysstat-isag"

RDEPENDS:${PN} += "/usr/bin/sh \
gnuplot \
sysstat \
tk"

inherit rpm
