SUMMARY = "Lightweight in-process concurrent programming"
DESCRIPTION = "The greenlet package is a spin-off of Stackless, a version of CPython \
that supports micro-threads called 'tasklets'. Tasklets run \
pseudo-concurrently (typically in a single or a few OS-level threads) \
and are synchronized with data exchanges on 'channels'."
LICENSE = "MIT"

PV = "3.5.5"

RPM_NAME = "python313-greenlet-3.5.5-1.1.aarch64.rpm"
RPM_HASH = "5021991f8cdeeacf1a8a8e7dc30521176aaac48264f3f28ba15f30b45ea7deefc58e60a0d35526351e1b81e1b882c0a6d60e8d935447a01a9a0d54e3d6e75652"

RPROVIDES:${PN} += "python3-greenlet \
python3.13dist-greenlet \
python313-greenlet \
python3dist-greenlet"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
