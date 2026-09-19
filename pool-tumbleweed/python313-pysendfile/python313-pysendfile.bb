SUMMARY = "A Python interface to sendfile(2)"
DESCRIPTION = "A python interface to sendfile(2) system call."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python313-pysendfile-2.0.1-4.14.aarch64.rpm"
RPM_HASH = "e10585ccf6da7e6c49ec97414cfa0287a19c980e357c9910cd8cc539c9dbb0985532016eea023c18bad3bc20d35b87b6e22cec1eaf7c8329dba4030d13e259e4"

RPROVIDES:${PN} += "python3-pysendfile \
python3.13dist-pysendfile \
python313-pysendfile \
python3dist-pysendfile"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
