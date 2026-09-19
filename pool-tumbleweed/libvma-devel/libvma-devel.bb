SUMMARY = "Header files and link required to develop with Libvma"
DESCRIPTION = "Headers and symbolink link required to compile and link with the Libvma library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "9.8.84"

RPM_NAME = "libvma-devel-9.8.84-2.1.aarch64.rpm"
RPM_HASH = "bf9c19e62b059b29b84ceb20145ee3b6b0897686d0abdb5a2765d0ebe7cff9ba43ec03175ef73d214c68cfd56329770f027046ba4527dfb066f900eef453c469"

RPROVIDES:${PN} += "libvma-devel"

RDEPENDS:${PN} += "libvma9"

inherit rpm
