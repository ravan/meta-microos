SUMMARY = "Network configuration scripts for Amazon EC2"
DESCRIPTION = "This package contains scripts for automatically configuring network interfaces \
in Amazon EC2 with full support for hotplug."
LICENSE = "GPL-3.0-or-later"

PV = "1.20"

RPM_NAME = "cloud-netconfig-ec2-1.20-1.2.noarch.rpm"
RPM_HASH = "88f08e5e430a3b506e62e546f9e91d290d0f58ccc17e9ba9910cbfc753078312b3b66991a02261ca30847ac683577fcf64d34e7f415203f41ae8a275de846922"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cloud-netconfig \
cloud-netconfig-ec2 \
cloud-netconfig-nm"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
curl \
udev"

inherit rpm
