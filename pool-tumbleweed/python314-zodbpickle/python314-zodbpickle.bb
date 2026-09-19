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

RPM_NAME = "python314-zodbpickle-4.4-1.3.aarch64.rpm"
RPM_HASH = "b6cc582a54e99fe1b0b96b463ef5fa18e273116a7330d38e843191591a0520c10da226de2a594f5393345e7f55db4e0b1915bc7d7d47d2cdc8ed539fcdd3ed63"

RPROVIDES:${PN} += "python3.14dist-zodbpickle \
python314-zodbpickle \
python3dist-zodbpickle"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
