SUMMARY = "EWAH Bool Array utils for yt"
DESCRIPTION = "EWAH Bool Array utils for yt \
 \
* EWAH Bool Array compression stores integer arrays efficient in memory. \
* Can be used for indexing arrays."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python313-ewah-bool-utils-1.1.0-1.15.aarch64.rpm"
RPM_HASH = "07eb96f6a8035df2a0de3d72c09e9b91a02efe98df340024817a40e14187e0e354413c61d19b88101638aee23c244523f8062f31e5a29419cf2d43c0639fecd1"

RPROVIDES:${PN} += "python3-ewah-bool-utils \
python3.13dist-ewah-bool-utils \
python313-ewah-bool-utils \
python3dist-ewah-bool-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi \
python313-numpy"

inherit rpm
