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

RPM_NAME = "python313-aiocsv-1.4.1-1.3.aarch64.rpm"
RPM_HASH = "0d8cd086d677da92c3b5e1aff6a6498047e4e948954e46c117f0c393dbe510bf33151bac8f528c42540b1a91d85e171f9c393d10956e2ed16dea3052195cc2d6"

RPROVIDES:${PN} += "python3-aiocsv \
python3.13dist-aiocsv \
python313-aiocsv \
python3dist-aiocsv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python313-typing-extensions"

inherit rpm
