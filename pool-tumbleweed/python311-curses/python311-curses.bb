SUMMARY = "Python Interface to the (N)Curses Library"
DESCRIPTION = "An easy to use interface to the (n)curses CUI library. CUI stands for \
Console User Interface."
LICENSE = "Python-2.0"

PV = "3.11.16"

RPM_NAME = "python311-curses-3.11.16-1.1.aarch64.rpm"
RPM_HASH = "81aa3dd91853a59c10d0cce90cc8c89ebc6969bf190d9899f3057dc530c3f576368594ea8f2b4270a8f7ac9cb6830cb1f1e6c2320868a6d5173ab83b3ac22ff3"

RPROVIDES:${PN} += "python311-curses"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libpanelw.so.6 \
libtinfo.so.6 \
python-abi \
python311"

inherit rpm
