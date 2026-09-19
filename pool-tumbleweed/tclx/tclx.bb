SUMMARY = "TclX - Extended Tcl"
DESCRIPTION = "Extended Tcl is a superset of standard Tcl. Extended Tcl has three \
basic functional areas: A set of new commands, a Tcl shell (a Unix \
shell-style command line and interactive environment), and a \
user-extensible library of useful Tcl procedures, any of which can be \
automatically loaded on the first attempt to execute it. \
 \
In addition, a detailed help system is available for Tcl/Tk: tclhelp."
LICENSE = "BSD-3-Clause & SUSE-Permissive"

PV = "8.6.3"

RPM_NAME = "tclx-8.6.3-1.3.aarch64.rpm"
RPM_HASH = "3ffdca1ca0ac38b8597d7add70c642ce41bc8aa3d153e67520f60f3d11770495e76caf9dfcb3659e49fabf29c0ba9830dfd3c13f724a62067064b077baf164b0"

RPROVIDES:${PN} += "libtclx8.6.so \
tclx"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
