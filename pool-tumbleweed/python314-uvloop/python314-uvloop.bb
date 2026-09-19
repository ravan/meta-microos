SUMMARY = "An asyncio event loop on top of libuv"
DESCRIPTION = "uvloop is a drop-in replacement of the built-in asyncio \
event loop. uvloop is implemented in Cython and uses libuv \
under the hood."
LICENSE = "Apache-2.0 & MIT"

PV = "0.22.1"

RPM_NAME = "python314-uvloop-0.22.1-1.6.aarch64.rpm"
RPM_HASH = "dd8d8a421e840cbd1addd7503bf0de30f54df9a1ef81f846e60e8dc0a898d44756c33271efb1f2e76c34e1ce0df13f5ba550443189d5289fe551fdbc11245a12"

RPROVIDES:${PN} += "python3.14dist-uvloop \
python314-uvloop \
python3dist-uvloop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libuv.so.1 \
python-abi"

inherit rpm
