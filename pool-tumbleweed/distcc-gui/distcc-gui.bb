SUMMARY = "GUI monitor for distcc server/client"
DESCRIPTION = "distcc is a program to distribute builds of C, C++, Objective C or \
Objective C++ code across several machines on a network, thereby \
completing the task in less time. distcc should always generate the \
same results as a local build."
LICENSE = "GPL-2.0-or-later"

PV = "3.4"

RPM_NAME = "distcc-gui-3.4-6.7.aarch64.rpm"
RPM_HASH = "7d4f14b50a101403d3a6b0188b04146d3dfbcff759461d99abf49841f95916abb7417efad6b737c54680d398a59cfb6922b62ea45ddfcf8e67401c254d728ec0"

RPROVIDES:${PN} += "distcc-gui"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
