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

PV = "3.12.14"

RPM_NAME = "python312-3.12.14-1.1.aarch64.rpm"
RPM_HASH = "6352b9ef5ed36a04950d13e8ddaa2256e1cea1e7028775e6fd6ded862f78362d8e404e0cce08b2570958f3eae0e250bc8c737b30efc2b9d31238b169e8f6283d"

RPROVIDES:${PN} += "python312 \
python312-readline \
python312-sqlite3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libreadline.so.8 \
libsqlite3.so.0 \
python-abi \
python312-base"

inherit rpm
