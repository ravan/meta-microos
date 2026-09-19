SUMMARY = "Utility to Create ELF Boot Images from Linux Kernel Images"
DESCRIPTION = "mkelfImage is a program that makes an ELF boot image for Linux kernel \
images. The image should work with any i386 multiboot compliant boot loader \
as well as with an ELF boot loader that passes no options. It is compliant \
with the LinuxBIOS ELF booting specification or with the Linux kexec kernel \
patch.Its key feature is, that nothing relies on BIOS calls, but they are \
made when necessary. This is useful for systems running LinuxBIOS."
LICENSE = "GPL-2.0+"

PV = "2.5"

RPM_NAME = "mkelfImage-2.5-218.9.aarch64.rpm"
RPM_HASH = "d3e37dbe2125eada8df22fe726c477d0d5d475885389ea0ce7dbf16645e7f77ac5d46a710d97ccd69cc6c6501d3d6b71b7570ef7f43eddf8576583e05f2da97b"

RPROVIDES:${PN} += "mkelfImage"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
