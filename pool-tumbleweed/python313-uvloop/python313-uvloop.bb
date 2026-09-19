SUMMARY = "An asyncio event loop on top of libuv"
DESCRIPTION = "uvloop is a drop-in replacement of the built-in asyncio \
event loop. uvloop is implemented in Cython and uses libuv \
under the hood."
LICENSE = "Apache-2.0 & MIT"

PV = "0.22.1"

RPM_NAME = "python313-uvloop-0.22.1-1.6.aarch64.rpm"
RPM_HASH = "56c5db011181d2cd59d80474986774fdfc23dc8521ebd231667abb5ed33dbcd5e2220dd3f949a261ac30069320226cc8f47bf12c2599ef19c61d95d3e89f0af8"

RPROVIDES:${PN} += "python3-uvloop \
python3.13dist-uvloop \
python313-uvloop \
python3dist-uvloop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libuv.so.1 \
python-abi"

inherit rpm
