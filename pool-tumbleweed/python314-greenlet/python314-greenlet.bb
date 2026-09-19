SUMMARY = "Lightweight in-process concurrent programming"
DESCRIPTION = "The greenlet package is a spin-off of Stackless, a version of CPython \
that supports micro-threads called 'tasklets'. Tasklets run \
pseudo-concurrently (typically in a single or a few OS-level threads) \
and are synchronized with data exchanges on 'channels'."
LICENSE = "MIT"

PV = "3.5.5"

RPM_NAME = "python314-greenlet-3.5.5-1.1.aarch64.rpm"
RPM_HASH = "4ecebf3a667fbb31bab6bb38e78ea9ef9a3455fa016bfc2f8c1c26878bc5101c54e3dec20de0944674a84aa64a27ee96da2fd9c761d17b22b73d77db05bc33a1"

RPROVIDES:${PN} += "python3.14dist-greenlet \
python314-greenlet \
python3dist-greenlet"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
