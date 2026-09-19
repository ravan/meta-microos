SUMMARY = "Efficient Arrays of Booleans"
DESCRIPTION = "This module provides an object type which efficiently represents an \
array of booleans.  Bitarrays are sequence types and behave very \
much like usual lists. Eight bits are represented by one byte in a \
contiguous block of memory. The user can select between two \
representations; little-endian and big-endian. \
All of the functionality is implemented in C. Methods for accessing \
the machine representation are provided.  This can be useful when \
bit level access to binary files is required, such as portable \
bitmap image files (.pbm). \
Also, when dealing with compressed data which uses variable bit \
length encoding, you may find this module useful."
LICENSE = "Python-2.0"

PV = "3.10.0"

RPM_NAME = "python314-bitarray-3.10.0-1.1.aarch64.rpm"
RPM_HASH = "038d665fd51cc30136ffe5c5794a737d261dbaa1b8a222f2b80cec7d2589ddb8edf2b1b5d2847774b2e1e9645e35144b596c4ac6f4d842cf2765659279f7ccbd"

RPROVIDES:${PN} += "python3.14dist-bitarray \
python314-bitarray \
python3dist-bitarray"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
