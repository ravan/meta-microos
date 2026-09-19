SUMMARY = "Interpret strings as packed binary data"
DESCRIPTION = "This module is intended to have a similar interface as the python struct \
module, but working on bits instead of primitive data types (char, int, ...)."
LICENSE = "MIT"

PV = "8.22.1"

RPM_NAME = "python314-bitstruct-8.22.1-1.6.aarch64.rpm"
RPM_HASH = "3ad4259c8684b6bb3e5ee9eaa100d5719595285443fd5d305fd76bbfb3e9cc39b8ce1a2c2bf905fcfd621c90af338a93c8738c64eb327e727bb824cdf5ec196b"

RPROVIDES:${PN} += "python3.14dist-bitstruct \
python314-bitstruct \
python3dist-bitstruct"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
