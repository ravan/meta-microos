SUMMARY = "A Python 38+ binding for LZ👌(lzokay) library"
DESCRIPTION = " \
 \
A Python 3.8+ binding for [LZ👌](https://github.com/jackoalan/lzokay) library which is \
 \
> A minimal, C++14 implementation of the \
> [LZO compression format](http://www.oberhumer.com/opensource/lzo/). \
 \
Licensed under the friendly MIT license. \
 \
Wheels are built statically without any external dependencies."
LICENSE = "MIT"

PV = "0.2.6"

RPM_NAME = "python314-lzallright-0.2.6-1.4.aarch64.rpm"
RPM_HASH = "ea6ea412f588d9ef7b3b9e8e4fb64b40d6dc000a12faa93879650d54b7ca8941947928b8876f5bb9c729cc8f7cfe30de21ad91d27c266b612990a2c2725adf02"

RPROVIDES:${PN} += "python3.14dist-lzallright \
python314-lzallright \
python3dist-lzallright"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi"

inherit rpm
