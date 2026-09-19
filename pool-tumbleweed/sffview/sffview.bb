SUMMARY = "Viewer for Structured Fax Files (.sff) used by ISDN applications"
DESCRIPTION = "The CAPI interface for programming ISDN hardware expects and gives you \
faxes in the 'Structured Fax File' (SFF) format. \
 \
SffView is a viewer for SFF files. SffView is written in C++ using the \
wxWidgets toolkit."
LICENSE = "MIT"

PV = "0.5"

RPM_NAME = "sffview-0.5-5.3.aarch64.rpm"
RPM_HASH = "efabbe3af1b80b0f91c9ac46a721e178e05d088509ab3857fd318f237eb7b720236ac311c6be16c209cb017c0e0915e982c23831b7a56307b130e91807c56997"

RPROVIDES:${PN} += "sffview"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwx-baseu-suse.so.16.0.0 \
libwx-gtk2u-core-suse.so.16.0.0"

inherit rpm
