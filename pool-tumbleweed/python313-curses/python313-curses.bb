SUMMARY = "Python Interface to the (N)Curses Library"
DESCRIPTION = "An easy to use interface to the (n)curses CUI library. CUI stands for \
Console User Interface."
LICENSE = "Python-2.0"

PV = "3.13.14"

RPM_NAME = "python313-curses-3.13.14-2.1.aarch64.rpm"
RPM_HASH = "3739b17980932ecbc6248b151754a4d710c981cca02e8b45ed63acd318b08cc6ef9559796659989750b221ba863b25a5690d311b06661e43db486d7627099c32"

RPROVIDES:${PN} += "python3-curses \
python313-curses"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libpanelw.so.6 \
libtinfo.so.6 \
python-abi \
python313"

inherit rpm
