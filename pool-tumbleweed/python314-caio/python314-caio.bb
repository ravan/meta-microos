SUMMARY = "Asynchronous file IO for Linux MacOS or Windows"
DESCRIPTION = "Asynchronous file IO for Linux (libaio and POSIX AIO), with a thread-pool \
based fallback. Provides a small, fast async file-IO layer."
LICENSE = "Apache-2.0"

PV = "0.12.4"

RPM_NAME = "python314-caio-0.12.4-1.1.aarch64.rpm"
RPM_HASH = "126e6620db3acf3481469e4a46dd58b1330e977bd16e94bbf79e1c35ac76c5c6ddf0b19139da0b0220737b39df403fb66e9163111e6ee8a4f571572f6664b1db"

RPROVIDES:${PN} += "python3.14dist-caio \
python314-caio \
python3dist-caio"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
