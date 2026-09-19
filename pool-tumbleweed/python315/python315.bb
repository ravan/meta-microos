SUMMARY = "Python 3 Interpreter"
DESCRIPTION = "Python 3 is modern interpreted, object-oriented programming language, \
often compared to Tcl, Perl, Scheme, or Java.  You can find an overview \
of Python in the documentation and tutorials included in the python3-doc \
package. \
 \
This package supplies rich command line features provided by readline, \
and sqlite3 support for the interpreter core, thus forming a so called \
'extended' runtime. \
Installing 'python3' is sufficient for the vast majority of usecases. \
In addition, recommended packages provide UI toolkit support (python3-curses, \
python3-tk), legacy UNIX database bindings (python3-dbm), and the IDLE \
development environment (python3-idle)."
LICENSE = "Python-2.0"

PV = "3.15.0~rc2"

RPM_NAME = "python315-3.15.0~rc2-1.1.aarch64.rpm"
RPM_HASH = "8f2c3e2d473930712fdadd251d36526c07c20c185575838c81373017e65a32acc6d9536e9df24b445a9e1b3e8a8b5537c0af8418ec7d9fea7b1d31c66e8fc94f"

RPROVIDES:${PN} += "python315 \
python315-readline \
python315-sqlite3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libreadline.so.8 \
libsqlite3.so.0 \
python-abi \
python315-base"

inherit rpm
