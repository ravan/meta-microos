SUMMARY = "Extended Display Identification Data editor"
DESCRIPTION = "wxEDID is a wxWidgets - based EDID (Extended Display Identification Data) editor. \
This is an early stage of development, allowing to modify the base EDID v1.3+ \
structure and CEA-861 (as first extension block). \
Besides normal editor functionality, the app has been equipped with a DTD \
constructor, which aims to ease timings selection/editing. It's also possible to \
export and import EDID data to/from text files (hex ASCII format) and also to \
save the structures as a human-readable text."
LICENSE = "GPL-3.0-only"

PV = "0.0.33"

RPM_NAME = "wxEDID-0.0.33-1.4.aarch64.rpm"
RPM_HASH = "b0b45c2a6f891e3f647e9e1a73549e6c130bd916ab0136eedd1da606fb8f620ea5293d92a690a53f2f5fffebfcdbe0444aacde592153dcd5764730b940827a2a"

RPROVIDES:${PN} += "wxEDID"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6 \
libwx-baseu-suse.so.16.0.0 \
libwx-gtk2u-aui-suse.so.16.0.0 \
libwx-gtk2u-core-suse.so.16.0.0"

inherit rpm
