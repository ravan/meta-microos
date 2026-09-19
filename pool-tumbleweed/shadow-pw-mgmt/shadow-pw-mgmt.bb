SUMMARY = "Tools to manage user account data"
DESCRIPTION = "This sub-package contains utilities to manage user account \
information like chage, chfn, chsh and passwd. This \
binaries all need setuid rights to work correct."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "4.20.2"

RPM_NAME = "shadow-pw-mgmt-4.20.2-2.1.aarch64.rpm"
RPM_HASH = "5f97ad0966f5bbe6648c3394c1dcdcf254422adb75e33bebf10dd0372f5726d0e6c3ce15446069fe756e7ece7aa3153116fb3b9e274754459dfc82bfc60dc51e"

RPROVIDES:${PN} += "shadow-pw-mgmt"

RDEPENDS:${PN} += "/usr/bin/sh \
group-shadow \
ld-linux-aarch64.so.1 \
libaudit.so.1 \
libc.so.6 \
libcrypt.so.1 \
libeconf.so.0 \
libpam-misc.so.0 \
libpam.so.0 \
libselinux.so.1 \
permissions \
shadow"

inherit rpm
