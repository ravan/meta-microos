SUMMARY = "An implementation of the edit distance (Levenshtein distance)"
DESCRIPTION = "An implementation of the edit distance (Levenshtein distance). \
 \
This library implements Levenshtein distance with C++ and Cython. \
 \
The algorithm used in this library is proposed by Heikki Hyyrö, \
'Explaining and extending the bit-parallel approximate string \
matching algorithm of Myers', (2001)."
LICENSE = "MIT"

PV = "0.8.1"

RPM_NAME = "python314-editdistance-0.8.1-1.4.aarch64.rpm"
RPM_HASH = "ac7b3aa4a0343e0dead957666894eed18e99d8d7b09be3226d8a6f16feba08da6d8c9923f960e1cc4e71d2dfb54ecdb2906529f2e8e61a8d0e481ba08759d215"

RPROVIDES:${PN} += "python3.14dist-editdistance \
python314-editdistance \
python3dist-editdistance"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi \
python314-base"

inherit rpm
