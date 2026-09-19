SUMMARY = "Asynchronous CSV reading/writing in Python"
DESCRIPTION = "Asynchronous CSV reading and writing \
 \
AsyncReader & AsyncDictReader accept any object that has a read(size: int) coroutine, \
which should return a string. \
 \
AsyncWriter & AsyncDictWriter accept any object that has a write(b: str) coroutine. \
 \
Reading is implemented using a custom CSV parser, which should behave exactly like \
the CPython parser. \
 \
Writing is implemented using the synchronous csv.writer and csv.DictWriter objects - \
the serializers write data to a StringIO, and that buffer is then rewritten to the \
underlying asynchronous file."
LICENSE = "MIT"

PV = "1.4.1"

RPM_NAME = "python314-aiocsv-1.4.1-1.3.aarch64.rpm"
RPM_HASH = "9168715db735ba870302e3c0d06fc8cd7558593571563cbf750f7fdc5b0fc86d0d9a293ac2e432bfa066f3a7b031fb65d64a739df30ecde8886e1dc1401d4e22"

RPROVIDES:${PN} += "python3.14dist-aiocsv \
python314-aiocsv \
python3dist-aiocsv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python314-typing-extensions"

inherit rpm
