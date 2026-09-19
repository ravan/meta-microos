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

PV = "3.11.16"

RPM_NAME = "python311-3.11.16-1.1.aarch64.rpm"
RPM_HASH = "1e53c41c2b92ccb2e822063fbb79948d04d9174bf7e2482048c511fafd4a92ab38e388947a5bea0d25385491d727a4332d9c0a5a1d5fe925bbc536543fc7518f"

RPROVIDES:${PN} += "python311 \
python311-readline \
python311-sqlite3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libreadline.so.8 \
libsqlite3.so.0 \
python-abi \
python311-base"

inherit rpm
