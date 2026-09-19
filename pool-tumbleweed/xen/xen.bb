SUMMARY = "Xen Virtualization: Hypervisor (aka VMM aka Microkernel)"
DESCRIPTION = "Xen is a virtual machine monitor for x86 that supports execution of \
multiple guest operating systems with unprecedented levels of \
performance and resource isolation. \
 \
This package contains the Xen Hypervisor. (tm) \
 \
[Hypervisor is a trademark of IBM]"
LICENSE = "GPL-2.0-only"

PV = "4.22.0_04"

RPM_NAME = "xen-4.22.0_04-1.1.aarch64.rpm"
RPM_HASH = "290da2c649175e99274730818ca92a0cab117ce6514dc76be75a955aad2bacdbd4ed6efb023af99d35856bff2d41ffc3e5993083ce3ce7aa8c2cce59ca898694"

RPROVIDES:${PN} += "installhint-reboot-needed \
xen"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
systemd"

inherit rpm
