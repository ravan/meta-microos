SUMMARY = "Python parser for ds9 region files"
DESCRIPTION = "pyregion is a python module to parse ds9 region files. It also supports ciao region files."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python314-pyregion-2.3.0-1.6.aarch64.rpm"
RPM_HASH = "fdf22d680387c9174f5de694f28bac04ca3b9004bf18f4a8a719ad5ce478b7e3ae3b92187f0437044c5443a08b23a249f36859a9caf6869a53a1a86573b28a9c"

RPROVIDES:${PN} += "python3.14dist-pyregion \
python314-pyregion \
python3dist-pyregion"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python314-astropy \
python314-numpy \
python314-pyparsing"

inherit rpm
