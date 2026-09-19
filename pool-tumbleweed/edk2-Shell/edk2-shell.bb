SUMMARY = "Shell EFI application"
DESCRIPTION = " \
The UEFI 2.0 shell provides a standard pre-boot command line processor."
LICENSE = "SUSE-Firmware"

PV = "202502"

RPM_NAME = "edk2-Shell-202502-5.3.aarch64.rpm"
RPM_HASH = "5a489b3bf793798551e1ddc6e8d3c60b4060c18534b3b64cc9a1efc2cfcb719ca2837d261aa309d2f040398134a008652a5b7c5f0f3b5dc48936b6fea549b68f"

RPROVIDES:${PN} += "edk2-Shell"

RDEPENDS:${PN} += ""

inherit rpm
