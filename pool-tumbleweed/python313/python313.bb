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

PV = "3.13.14"

RPM_NAME = "python313-3.13.14-2.1.aarch64.rpm"
RPM_HASH = "d11544539551a61a7203fb3e10035cfb3860837d096ef008ca21001e326b6e73cc20aad61d0300bf5cd50360f7148180f5f5bb5bab48a1921382b597064f6c55"

RPROVIDES:${PN} += "python3 \
python3-readline \
python3-sqlite3 \
python313 \
python313-readline \
python313-sqlite3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libreadline.so.8 \
libsqlite3.so.0 \
python-abi \
python313-base"

inherit rpm
