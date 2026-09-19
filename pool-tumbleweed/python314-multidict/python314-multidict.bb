SUMMARY = "Multidict implementation"
DESCRIPTION = "Multidicts are useful for working with HTTP headers, URL query \
arguments, etc. \
 \
The code was extracted from the aiohttp library."
LICENSE = "Apache-2.0"

PV = "6.7.1"

RPM_NAME = "python314-multidict-6.7.1-1.4.aarch64.rpm"
RPM_HASH = "71c8bdb8789bf3313834e1b78c6ca7b69e8c0757baef653dda59c62fa6da8c68574ebc91060dbc7f550485fe7561d222929b2b053bf577a4e9cd44db2cec4b7e"

RPROVIDES:${PN} += "python3.14dist-multidict \
python314-multidict \
python3dist-multidict"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
