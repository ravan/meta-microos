SUMMARY = "Python Interface to the (N)Curses Library"
DESCRIPTION = "An easy to use interface to the (n)curses CUI library. CUI stands for \
Console User Interface."
LICENSE = "Python-2.0"

PV = "3.15.0~rc2"

RPM_NAME = "python315-curses-3.15.0~rc2-1.1.aarch64.rpm"
RPM_HASH = "53069e099c50b7938379b3397ae149969617fff84d5023f7372939f8b43f5f90d593e8a4655cd9cd47796222ff63d2d0bda0149675d1de19e166ce4f0f43eb14"

RPROVIDES:${PN} += "python315-curses"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libpanelw.so.6 \
libtinfo.so.6 \
python-abi \
python315"

inherit rpm
