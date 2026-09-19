SUMMARY = "Tools to inspect and work on UEFI BIOSes"
DESCRIPTION = "UEFITool is a C++/Qt program for parsing, extracting and \
modifying UEFI firmware images. It supports parsing of full BIOS images \
starting with the flash descriptor or any binary files containing UEFI \
volumes."
LICENSE = "BSD-2-Clause"

PV = "20201122"

RPM_NAME = "UEFITool-20201122-1.24.aarch64.rpm"
RPM_HASH = "8929433ceae45c75eebd4831af115d206681b284b4a7574128af0199b4933e9f02c3e1e5037c29cdd18a2b41b07e96aecf98f3b0e95191fe9600bb4f1e931f98"

RPROVIDES:${PN} += "UEFITool"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
