SUMMARY = "A library for querying and capturing from cameras"
DESCRIPTION = "A library for querying and capturing from cameras, based on nokhwa crate."
LICENSE = "MIT"

PV = "0.6.1"

RPM_NAME = "python314-omni-camera-0.6.1-2.13.aarch64.rpm"
RPM_HASH = "1aa171474c77c4625debdeab80ab5f1688f85b05f44bda1fe6f9f5b1e14e668cde0828760278a478651ba9c5baa63e7b2a704d20e0930ca0faa00b837e9e550e"

RPROVIDES:${PN} += "python3.14dist-omni-camera \
python314-omni-camera \
python3dist-omni-camera"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
python-abi"

inherit rpm
