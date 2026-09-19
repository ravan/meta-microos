SUMMARY = "Python bindings for the SELinux runtime library"
DESCRIPTION = "libselinux provides an interface to get and set process and file \
security contexts and to obtain security policy decisions. \
 \
This subpackage contains Python extensions to use SELinux from that \
language."
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "3.11"

RPM_NAME = "python314-selinux-3.11-2.1.aarch64.rpm"
RPM_HASH = "de9fa5790d15f33c5c2d3e357aca583cc1a8810ac6d9b0d6f858a1d1fb637c7d112a911774776de5223804029a1cce95a8866876a663c12c1cac60ab7b4ace37"

RPROVIDES:${PN} += "python3.14dist-selinux \
python314-selinux \
python3dist-selinux"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libselinux.so.1 \
libselinux1 \
python-abi"

inherit rpm
