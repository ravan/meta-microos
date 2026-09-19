SUMMARY = "Kernel crash dump scripts and utilities"
DESCRIPTION = "kdump is a package that includes several scripts for kdump, including \
the kdump service and configuration files \
 \
The kernel package and this package are all that are required for a \
crash dump to occur. However, if you wish to debug the crash dump \
yourself you will need several debugging packages installed for each \
kernel flavor and release you wish to debug. \
 \
For example, if you are debugging kernel-default, you will need: \
- kernel-default-debuginfo \
- kernel-default-devel \
- kernel-default-devel-debuginfo \
 \
These packages are not needed to create the dump and can be installed \
after a crash dump has occured."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.9"

RPM_NAME = "kdump-2.1.9-2.3.aarch64.rpm"
RPM_HASH = "e6a13e2ad3941b5abfa1b1059a6a34ac7264470c1806636355dff2f1ec0943f9870196f484291ff15d33d00b188e75558a10a0e7a2a7fcc1d05255e27101a59e"

RPROVIDES:${PN} += "kdump \
kexec-tools-/etc/init.d/kdump"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/rm \
/usr/bin/sed \
/usr/bin/sh \
/usr/bin/touch \
dracut \
ethtool \
fillup \
kexec-tools \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
makedumpfile"

inherit rpm
