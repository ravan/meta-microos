SUMMARY = "Rpm plugin for SELinux functionality"
DESCRIPTION = "Rpm plugin for SELinux functionality."
LICENSE = "GPL-2.0-or-later"

PV = "4.20.1"

RPM_NAME = "rpm-plugin-selinux-4.20.1-10.1.aarch64.rpm"
RPM_HASH = "efaa75cb9289a09a50cbec294a4a85d1da817179ba2a94c3e3570b149be72a7f477729760860c33a11d4b60cfddbdc395c56c14d5f493f5647684dacff0a3239"

RPROVIDES:${PN} += "rpm-/usr/lib64/rpm-plugins/selinux.so \
rpm-plugin-selinux"

RDEPENDS:${PN} += "rpm"

inherit rpm
