SUMMARY = "Python Interface to the (N)Curses Library"
DESCRIPTION = "An easy to use interface to the (n)curses CUI library. CUI stands for \
Console User Interface."
LICENSE = "Python-2.0"

PV = "3.14.7"

RPM_NAME = "python314-curses-3.14.7-1.1.aarch64.rpm"
RPM_HASH = "b17754bc0407673ed61c37f01dc4deaa9974a4fec1bd20b3c539fc758b40f2e33bbaf662ac42e6988952707c7a6b5c612e26f7e0bbc32b15cb32827d72f8217b"

RPROVIDES:${PN} += "python314-curses"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libpanelw.so.6 \
libtinfo.so.6 \
python-abi \
python314"

inherit rpm
