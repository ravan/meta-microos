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

PV = "3.10.21"

RPM_NAME = "python310-3.10.21-1.1.aarch64.rpm"
RPM_HASH = "f2b983ca6b63f81e17b84ed43ff04e25b13bec47df2b54004fb09617fc581295ca0f0014221fb9ce4423fbbeae1c5384c8ef5d4ced62646ffec7c34603164324"

RPROVIDES:${PN} += "python310 \
python310-readline \
python310-sqlite3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libreadline.so.8 \
libsqlite3.so.0 \
python-abi \
python310-base"

inherit rpm
