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

RPM_NAME = "python313-bitarray-3.10.0-1.1.aarch64.rpm"
RPM_HASH = "d30713f9dd64999dd44cfbc91fc1adf8e1c0a24c43c66d8a2749c65ab387ae763ec949a248d019922f832a0fc724720debe49b9786c52398537a22a54e9b7606"

RPROVIDES:${PN} += "python3-bitarray \
python3.13dist-bitarray \
python313-bitarray \
python3dist-bitarray"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
