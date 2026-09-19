SUMMARY = "Revision Control System"
DESCRIPTION = "RCS, the Revision Control System, manages multiple revisions of files. \
RCS can store, retrieve, log, identify, and merge revisions. It is \
useful for files that are frequently revised, for example: programs, \
documentation, graphics, and papers."
LICENSE = "GPL-3.0-or-later"

PV = "5.10.1"

RPM_NAME = "rcs-5.10.1-4.8.aarch64.rpm"
RPM_HASH = "c28c3912299bcadc27696c4c35d30aa3ea6d96f52d0ffbe8dba54fc45f8f30c42a2c50097456054538aebbfccdc6a21e7b1ec791e413ad409140e0fb793fdb00"

RPROVIDES:${PN} += "rcs"

RDEPENDS:${PN} += "/usr/bin/sh \
diffutils \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
