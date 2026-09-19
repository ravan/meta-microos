SUMMARY = "ACE 1.0 and 2.0 archive reader/extractor in pure Python"
DESCRIPTION = "Read/test/extract ACE 1.0 and 2.0 archives in pure python."
LICENSE = "BSD-2-Clause"

PV = "0.6.14"

RPM_NAME = "python313-acefile-0.6.14-1.6.aarch64.rpm"
RPM_HASH = "a84ecf1b92dac0479c32fb69d4a622d1f2df15af928f794833a703dc01988fe0606779eabf01c8b497112f6c6f7b3de03131841fffc27f50d34abf038c3f7033"

RPROVIDES:${PN} += "python3-acefile \
python3.13dist-acefile \
python313-acefile \
python3dist-acefile"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python313-setuptools"

inherit rpm
