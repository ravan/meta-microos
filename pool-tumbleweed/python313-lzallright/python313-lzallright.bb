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

RPM_NAME = "python313-lzallright-0.2.6-1.4.aarch64.rpm"
RPM_HASH = "8bf2555c6ac9ceec8c16e61f07913e686de3fbcedb6360c1ea5eabbedab7562ac8063bcceee9b8eb6b77198837e884e3edc30c8ed80a2ccad6625d36385d3568"

RPROVIDES:${PN} += "python3-lzallright \
python3.13dist-lzallright \
python313-lzallright \
python3dist-lzallright"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi"

inherit rpm
