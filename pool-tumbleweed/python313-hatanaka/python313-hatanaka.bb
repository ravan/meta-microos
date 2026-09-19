SUMMARY = "Effortless compression / decompression of RINEX files in Python"
DESCRIPTION = "Effortless compression / decompression of RINEX files in Python and on the command line. \
 \
Supports all compression formats allowed by the RINEX 2, 3 and 4 standards: \
* Hatanaka compression for Observation Data Files, \
* LZW (.Z), gzip (.gz), bzip2 (.bz2) and .zip."
LICENSE = "BSD-3-Clause"

PV = "2.8.1"

RPM_NAME = "python313-hatanaka-2.8.1-1.6.aarch64.rpm"
RPM_HASH = "7e5e34400432fba1d973a3e5ebd03ac4574146268214527d68a0553094be686f00c3060fcd642143853a08b8831d75bd420392a47ec7fa25ffcd33f6cc8514f4"

RPROVIDES:${PN} += "python3-hatanaka \
python3.13dist-hatanaka \
python313-hatanaka \
python3dist-hatanaka"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
alts \
libc.so.6 \
python-abi \
python313-importlib-resources \
python313-ncompress \
python314-importlib-resources \
python314-ncompress"

inherit rpm
