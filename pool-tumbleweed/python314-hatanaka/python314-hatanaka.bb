SUMMARY = "Effortless compression / decompression of RINEX files in Python"
DESCRIPTION = "Effortless compression / decompression of RINEX files in Python and on the command line. \
 \
Supports all compression formats allowed by the RINEX 2, 3 and 4 standards: \
* Hatanaka compression for Observation Data Files, \
* LZW (.Z), gzip (.gz), bzip2 (.bz2) and .zip."
LICENSE = "BSD-3-Clause"

PV = "2.8.1"

RPM_NAME = "python314-hatanaka-2.8.1-1.6.aarch64.rpm"
RPM_HASH = "ee221a37bd0312d656c9764cd32e2bb1b86d699524304ddb880268ee9267b4dd31f4651a0497ee2aecbfb59bb11a0a248c09d8aa213f278ba08a8dcbc4cfc16a"

RPROVIDES:${PN} += "python3.14dist-hatanaka \
python314-hatanaka \
python3dist-hatanaka"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
alts \
libc.so.6 \
python-abi \
python313-importlib-resources \
python313-ncompress \
python314-importlib-resources \
python314-ncompress"

inherit rpm
