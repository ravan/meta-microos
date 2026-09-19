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

RPM_NAME = "python313-editdistance-0.8.1-1.4.aarch64.rpm"
RPM_HASH = "8a9e7b172dabee35420fde25b00eeaa4aacfdef391a813ee4f418a769b53ed692006577dee014495587da56b925d02d5131fb09165a75de629f1e5cd7b8c4980"

RPROVIDES:${PN} += "python3-editdistance \
python3.13dist-editdistance \
python313-editdistance \
python3dist-editdistance"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi \
python313-base"

inherit rpm
