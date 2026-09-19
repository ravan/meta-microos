SUMMARY = "Utilities to assist with bfio file overlays"
DESCRIPTION = "This subpackage provides the utilities from libbfoverlay."
LICENSE = "LGPL-3.0-or-later"

PV = "20240505"

RPM_NAME = "libbfoverlay-tools-20240505-2.16.aarch64.rpm"
RPM_HASH = "bdc15783e80122d6bdbdb566797a4eec53596d028b685bd75e1babe770cdf20e9ad14137a85346a2068c39b9b817b7e87630849f1947d90fe155d6052b61286f"

RPROVIDES:${PN} += "libbfoverlay-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfoverlay.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1"

inherit rpm
