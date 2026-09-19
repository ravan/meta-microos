SUMMARY = "Zstandard bindings for Python"
DESCRIPTION = "Zstandard bindings for Python"
LICENSE = "BSD-3-Clause"

PV = "0.25.0"

RPM_NAME = "python314-zstandard-0.25.0-2.2.aarch64.rpm"
RPM_HASH = "175c02444e5a1455c0e7386e623da380ba109657faeb1ade73049895a9f3ad7f9a1aae8c305d2fe826ac8875574fa447ac641367f686e10684bb037a3cc993a9"

RPROVIDES:${PN} += "python3.14dist-zstandard \
python314-zstandard \
python3dist-zstandard"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libzstd.so.1 \
libzstd1 \
python-abi \
python314-cffi"

inherit rpm
