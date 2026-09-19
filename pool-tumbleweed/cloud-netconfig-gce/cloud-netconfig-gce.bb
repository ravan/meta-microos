SUMMARY = "Network configuration scripts for Google Compute Engine"
DESCRIPTION = "This package contains scripts for automatically configuring network interfaces \
in Google Compute Engine with full support for hotplug."
LICENSE = "GPL-3.0-or-later"

PV = "1.20"

RPM_NAME = "cloud-netconfig-gce-1.20-1.2.noarch.rpm"
RPM_HASH = "7fdf795d90dfb92799db84532c187686a1bfd10181188c690b196c701363073f0e109fe6d9e9331f8bc30c21293d1af810cda8555348fdc285ef770b56f98805"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cloud-netconfig \
cloud-netconfig-gce \
cloud-netconfig-nm"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
curl \
udev"

inherit rpm
