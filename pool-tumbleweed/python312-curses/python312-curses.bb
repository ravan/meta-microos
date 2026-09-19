SUMMARY = "Python Interface to the (N)Curses Library"
DESCRIPTION = "An easy to use interface to the (n)curses CUI library. CUI stands for \
Console User Interface."
LICENSE = "Python-2.0"

PV = "3.12.14"

RPM_NAME = "python312-curses-3.12.14-1.1.aarch64.rpm"
RPM_HASH = "1d615795cebeeea12a7e7c0430845ceafcf470abd4130b2a04f7336e047e94d9426e75610e818cf9ed29e0dc3b80407e1bb3905da0d5903c6dbcca638389bfc3"

RPROVIDES:${PN} += "python312-curses"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libtinfo.so.6 \
python-abi \
python312"

inherit rpm
