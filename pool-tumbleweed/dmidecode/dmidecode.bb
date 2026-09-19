SUMMARY = "DMI table decoder"
DESCRIPTION = "Dmidecode reports information about your system's hardware as described \
in your system BIOS according to the SMBIOS/DMI standard. This \
information typically includes system manufacturer, model name, serial \
number, BIOS version, asset tag as well as a lot of other details of \
varying level of interest and reliability depending on the \
manufacturer. This will often include usage status for the CPU sockets, \
expansion slots (e.g. AGP, PCI, ISA) and memory module slots, and the \
list of I/O ports (e.g. serial, parallel, USB). \
 \
Beware that DMI data have proven to be too unreliable to be blindly \
trusted. Dmidecode does not scan your hardware, it only reports what \
the BIOS told it to."
LICENSE = "GPL-2.0-or-later"

PV = "3.7"

RPM_NAME = "dmidecode-3.7-2.1.aarch64.rpm"
RPM_HASH = "36ff4dedd76631ca981bd5e8c0442df850d46af35dc222ca3f081c1b1dd9da1bd3cb672a5c5ecae1242732cfb05b8d32b04afec905cfb2679faea51d0819c691"

RPROVIDES:${PN} += "dmidecode"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
