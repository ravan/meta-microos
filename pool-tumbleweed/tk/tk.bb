SUMMARY = "Graphical User Interface Toolkit for Tcl"
DESCRIPTION = "Tk is a graphical user interface toolkit that takes developing desktop \
applications to a higher level than conventional approaches. Tk is the \
standard GUI not only for Tcl, but for many other dynamic languages, \
and can produce rich, native applications that run unchanged across \
Windows, Mac OS X, Linux and more. \
 \
 \
 \
Authors: \
-------- \
    The Tcl Core Team <tcl-core@lists.sourceforge.net>"
LICENSE = "TCL"

PV = "8.6.18"

RPM_NAME = "tk-8.6.18-1.3.aarch64.rpm"
RPM_HASH = "5eb835fcc8c85f477c0a64534732c83c8f4882c84f7730f3c9ceb57584c7d4d2e6d15f28823d19f7984790a4925fa28e33ec65af9cdeb2c9284c9f050ebf97a2"

RPROVIDES:${PN} += "libtk8.6.so \
tk \
tkcon \
wish \
wish8.6"

RDEPENDS:${PN} += "/usr/bin/rm \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXft.so.2 \
libXss.so.1 \
libc.so.6 \
libfontconfig.so.1 \
libtcl8.6.so \
tcl \
xhost"

inherit rpm
