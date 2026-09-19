SUMMARY = "Japanese (ja) man pages for guestfs-tools"
DESCRIPTION = "guestfs-tools-man-pages-ja contains Japanese (ja) man pages \
for guestfs-tools."
LICENSE = "GPL-2.0-or-later"

PV = "1.56.0"

RPM_NAME = "guestfs-tools-man-pages-ja-1.56.0-1.2.noarch.rpm"
RPM_HASH = "189c9d41662155351c5a7e74344fb238531d98464c24591723eff497a8e0468d39a912eff9f8d9adb164ddc5bebc4f4bb38a53dae207c4dda9f6e54af0ee9275"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "guestfs-tools-man-pages-ja"

RDEPENDS:${PN} += "guestfs-tools"

inherit rpm
