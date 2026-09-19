SUMMARY = "Development files for sleuthkit"
DESCRIPTION = "The sleuthkit-devel package contains libraries and header files for \
developing applications that use sleuthkit."
LICENSE = "CPL-1.0 & IPL-1.0 & GPL-2.0-or-later"

PV = "4.14.0"

RPM_NAME = "sleuthkit-devel-4.14.0-1.8.aarch64.rpm"
RPM_HASH = "94d9b250ca068f69bf95e1cff1c2c548212db70375e2467f8e7ab4adc97bbc0fdabfa71ea1dc08ad859ae923814badceb410e4c88b3eabdd970719f7ab02124d"

RPROVIDES:${PN} += "pkgconfig-tsk \
sleuthkit-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtsk23"

inherit rpm
