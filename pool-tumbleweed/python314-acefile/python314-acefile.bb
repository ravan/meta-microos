SUMMARY = "ACE 1.0 and 2.0 archive reader/extractor in pure Python"
DESCRIPTION = "Read/test/extract ACE 1.0 and 2.0 archives in pure python."
LICENSE = "BSD-2-Clause"

PV = "0.6.14"

RPM_NAME = "python314-acefile-0.6.14-1.6.aarch64.rpm"
RPM_HASH = "cae921cfdd93f7ac801c88fa2f2fe52d44d6ddb749f69da2ceb55e51ffe1c7299f7bcc2214a7474ea0f4a41d654fdfa45d73dd5a638862557037195d3e3342fa"

RPROVIDES:${PN} += "python3.14dist-acefile \
python314-acefile \
python3dist-acefile"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python314-setuptools"

inherit rpm
