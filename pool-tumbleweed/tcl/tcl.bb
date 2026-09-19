SUMMARY = "The Tcl Programming Language"
DESCRIPTION = "Tcl (Tool Command Language) is a very powerful but easy to learn \
dynamic programming language, suitable for a very wide range of uses, \
including web and desktop applications, networking, administration, \
testing and many more. Open source and business-friendly, Tcl is a \
mature yet evolving language that is truly cross platform, easily \
deployed and highly extensible. \
 \
For more information on Tcl see https://www.tcl-lang.org and \
https://wiki.tcl-lang.org ."
LICENSE = "TCL"

PV = "8.6.18"

RPM_NAME = "tcl-8.6.18-2.1.aarch64.rpm"
RPM_HASH = "e9e6bd93d3c652127f02e1cf6866e44481c28b84dbb30ebcc6223ca6d52af94f42e3ae2b07836ccfe611a4612ba40d832a3e1a5ca06c300bde1653e6ea5fe0a5"

RPROVIDES:${PN} += "itcl \
libitcl4.3.7.so \
libtcl8.6.so \
libtdbc1.1.13.so \
libtdbcmysql1.1.13.so \
libtdbcodbc1.1.13.so \
libtdbcpostgres1.1.13.so \
libthread2.8.13.so \
rpm-macro-tcl-archdir \
rpm-macro-tcl-noarchdir \
rpm-macro-tcl-version \
rpm-macro-tclscriptdir \
tcl \
tclsh \
tclsh8.6"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libz.so.1 \
sqlite3-tcl"

inherit rpm
