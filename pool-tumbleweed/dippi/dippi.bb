SUMMARY = "Tool for calculating display info like DPI and aspect ratio"
DESCRIPTION = "A tool to analyze displays and to input a few details and figure out the aspect \
ratio, DPI, and other details of a particular display. Can be used to decide \
which laptop or external monitor to purchase, and if it would be considered \
HiDPI."
LICENSE = "GPL-3.0-or-later"

PV = "5.0.2"

RPM_NAME = "dippi-5.0.2-1.3.aarch64.rpm"
RPM_HASH = "e38c3afbf13f420af8747989d29944e4a0a25e8ae49f2a82149efd2c2917a0de60cc7b3eef18a1a9de064ee2430373848164684539eb1d182414e7ac1bebe93b"

RPROVIDES:${PN} += "dippi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1"

inherit rpm
