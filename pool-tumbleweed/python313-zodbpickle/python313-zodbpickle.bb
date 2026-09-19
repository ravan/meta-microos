SUMMARY = "Fork of Python 3 pickle module"
DESCRIPTION = "This package presents a uniform pickling interface for ZODB: \
 * Under Python2, this package forks both Python 2.7’s pickle and \
   cPickle modules, adding support for the protocol 3 opcodes. \
   It also provides a new subclass of bytes, zodbpickle.binary, \
   which Python2 applications can use to pickle binary values such \
   that they will be unpickled as bytes under Py3k. \
 * Under Py3k, this package forks the pickle module (and the \
   supporting C extension) from both Python 3.2 and Python 3.3. \
   The fork add support for the noload operations used by ZODB."
LICENSE = "Python-2.0 & ZPL-2.1"

PV = "4.4"

RPM_NAME = "python313-zodbpickle-4.4-1.3.aarch64.rpm"
RPM_HASH = "fa624ae4db7bd45c47a32c4ab24ee62c27d897dc7e4597198cb9dc0b4785209b21c702a68ce5ab419ed99d391c809b40ede71559a9b321e4a477a2de1fa26643"

RPROVIDES:${PN} += "python3-zodbpickle \
python3.13dist-zodbpickle \
python313-zodbpickle \
python3dist-zodbpickle"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
