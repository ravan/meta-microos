SUMMARY = "Python bindings for the SELinux runtime library"
DESCRIPTION = "libselinux provides an interface to get and set process and file \
security contexts and to obtain security policy decisions. \
 \
This subpackage contains Python extensions to use SELinux from that \
language."
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "3.11"

RPM_NAME = "python313-selinux-3.11-2.1.aarch64.rpm"
RPM_HASH = "cb0a53c738e9a57b06495a9f6b793099ed56b7cdd3c980f4098bfd0e4bedcf01c69e14879f2cb72d35305c2227845d678f12010c19e5340866e2ce089b04f72a"

RPROVIDES:${PN} += "python3-selinux \
python3.13dist-selinux \
python313-selinux \
python3dist-selinux"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libselinux.so.1 \
libselinux1 \
python-abi"

inherit rpm
