SUMMARY = "Python ALSA binding"
DESCRIPTION = "This package provides the Python binding to ALSA."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "1.2.14"

RPM_NAME = "python314-alsa-1.2.14-2.3.aarch64.rpm"
RPM_HASH = "edbe590f77772a05465e30595f1e71447bf71223e2852c525cc77d073bb1368ece6a210f546e0174a19126aa54b5a9c47a251a54e29b3406df08049bdb6317bb"

RPROVIDES:${PN} += "pyalsa \
python3.14dist-pyalsa \
python314-alsa \
python3dist-pyalsa"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
python-abi"

inherit rpm
