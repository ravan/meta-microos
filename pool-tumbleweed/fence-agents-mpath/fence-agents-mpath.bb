SUMMARY = "Fence agent for reservations over Device Mapper Multipath"
DESCRIPTION = "Fence agent for SCSI persistent reservation over \
Device Mapper Multipath."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "4.17.0+git.1786356985.d90bec5f"

RPM_NAME = "fence-agents-mpath-4.17.0+git.1786356985.d90bec5f-1.1.noarch.rpm"
RPM_HASH = "a6d7badd659af9b21f385839bb2cd9c96dfad4eadf952d762fb81d186f503433b369a0df6d7e8352e3c16736f1b3110b3a8ca73fd38de835060e1548857b0a02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fence-agents-mpath"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.13 \
fence-agents-common \
multipath-tools"

inherit rpm
