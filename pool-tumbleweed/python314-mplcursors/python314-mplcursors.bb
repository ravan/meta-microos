SUMMARY = "Interactive data selection cursors for Matplotlib"
DESCRIPTION = "mplcursors provides interactive data selection cursors for Matplotlib."
LICENSE = "Zlib"

PV = "0.5.3"

RPM_NAME = "python314-mplcursors-0.5.3-2.8.noarch.rpm"
RPM_HASH = "4ffe0eeb150c343de92fa08f8f2e5504c4b24bc72802b72557d8bb073f09ed0e923a36c803617d2ba80f5005fbd7e40b2863cf9c4a6b048aef2c99818abd529d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-mplcursors \
python314-mplcursors \
python3dist-mplcursors"

RDEPENDS:${PN} += "-python314-matplotlib >= 3.1 without python314-matplotlib = 3.7.1 \
python-abi \
python314-matplotlib"

inherit rpm
