SUMMARY = "ANSI color to HTML converter"
DESCRIPTION = "aha (ANSI HTML Adapter) converts ANSI colors to HTML, e.g. if you \
want to publish the output of ls --color=yes, git diff, ccal or htop \
as static HTML somewhere."
LICENSE = "MPL-1.1 | LGPL-2.1-or-later"

PV = "0.5.1"

RPM_NAME = "aha-0.5.1-1.22.aarch64.rpm"
RPM_HASH = "f98a430c500993bbcc7987d7adb8b6c23e8d5722b01668ab8d367c1425594bc22766f2d02fdc9caa3b66c80b56598d14ddc2e1fc402a7e7f05d67392a0b416c4"

RPROVIDES:${PN} += "aha"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
