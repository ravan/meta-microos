SUMMARY = "EWAH Bool Array utils for yt"
DESCRIPTION = "EWAH Bool Array utils for yt \
 \
* EWAH Bool Array compression stores integer arrays efficient in memory. \
* Can be used for indexing arrays."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python314-ewah-bool-utils-1.1.0-1.15.aarch64.rpm"
RPM_HASH = "0d1a23a3c5e03ed0ef092d623224ecff06ad51f31ebb5a1e9bc0ecb3780c4761b4c68f4ce1c0fb8e28f69451e52e87fefb410b63b4df55797256ce293daa2967"

RPROVIDES:${PN} += "python3.14dist-ewah-bool-utils \
python314-ewah-bool-utils \
python3dist-ewah-bool-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi \
python314-numpy"

inherit rpm
