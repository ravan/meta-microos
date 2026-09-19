SUMMARY = "EFI Boot Manager"
DESCRIPTION = "The EFI Boot Manager allows the user to edit the Intel Extensible \
Firmware Interface (EFI) Boot Manager variables.  Additional \
information about the EFI can be found at \
<http://developer.intel.com/technology/efi/efi.htm>."
LICENSE = "GPL-2.0-or-later"

PV = "18"

RPM_NAME = "efibootmgr-18-1.12.aarch64.rpm"
RPM_HASH = "b5089210b05a569013cad72c3b079223aab97c7a63c66f1ec9afdf5413a8afb0caa24b7ccbeca83e7c098ef45754d7490b2adb5c86642ba643915d595a2abd62"

RPROVIDES:${PN} += "efibootmgr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libefiboot.so.1 \
libefivar.so.1 \
libpopt.so.0"

inherit rpm
