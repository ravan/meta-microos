SUMMARY = "Python ALSA binding"
DESCRIPTION = "This package provides the Python binding to ALSA."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "1.2.14"

RPM_NAME = "python313-alsa-1.2.14-2.3.aarch64.rpm"
RPM_HASH = "0ae73156116de64394b07c9e37edbd53319e924af393cb7462f2582f1de746d621df38947681aae59e6d461e9c9f59adecec46165c1f1758da500553a1aa638d"

RPROVIDES:${PN} += "pyalsa \
python3-alsa \
python3.13dist-pyalsa \
python313-alsa \
python3dist-pyalsa"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
python-abi"

inherit rpm
