SUMMARY = "The configuration scheme for traditional network scripts"
DESCRIPTION = "This package provides the SUSE system configuration scheme for the \
traditional 'ifup' alias 'netcontrol' network scripts."
LICENSE = "GPL-2.0-or-later"

PV = "0.90.5"

RPM_NAME = "sysconfig-0.90.5-1.2.noarch.rpm"
RPM_HASH = "cdac10215b3905b3783ff99b60a98fd306c351421396bedee97f9f4b8e50bb5eae2926a74fefaf0faac21ae35f9f7896bb123aa1963bb637489eb1b7e2d9e15f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-sysconfig \
sysconfig"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/bash \
/usr/bin/chmod \
/usr/bin/grep \
/usr/bin/mkdir \
/usr/bin/touch \
fillup"

inherit rpm
