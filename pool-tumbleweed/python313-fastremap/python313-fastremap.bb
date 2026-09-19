SUMMARY = "Module to Remap, mask, renumber, and in-place transpose numpy arrays"
DESCRIPTION = "A module to remap, mask, renumber, and in-place transpose numpy arrays."
LICENSE = "LGPL-3.0-only"

PV = "1.14.2"

RPM_NAME = "python313-fastremap-1.14.2-1.11.aarch64.rpm"
RPM_HASH = "d4175814898a6325b83a61eb3840fd3e7b8dcec3333f52f6022a6eb0206a727606ad841f6f3cf767d0e14487614de5027956b77a961ca39cfe1acc89671f7fe0"

RPROVIDES:${PN} += "python3-fastremap \
python3.13dist-fastremap \
python313-fastremap \
python3dist-fastremap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi \
python313-numpy"

inherit rpm
