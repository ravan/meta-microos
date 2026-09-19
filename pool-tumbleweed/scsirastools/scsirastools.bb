SUMMARY = "Serviceability for SCSI Disks and Arrays"
DESCRIPTION = "The SCSI RAS (Reliability, Availability, and Serviceability) tools \
work with SCSI devices used in a Linux software RAID-1 configuration. \
 \
* sgraidmon - a tool to monitor software RAID disks for \
  hot-insertion/removal \
* sgdefects - a tool to read the primary and grown defect lists \
* sgdskfl - a tool to load disk firmware to SCSI disks under Linux \
* sgmode - a tool to get and set SCSI device mode pages \
* sgdiag - a tool to perform format and other diagnostic functions \
 \
The tools require SCSIRAS patches in the kernel; these are not \
present in SUSE-provided kernels."
LICENSE = "BSD-3-Clause"

PV = "1.6.6"

RPM_NAME = "scsirastools-1.6.6-1.15.aarch64.rpm"
RPM_HASH = "abe4e1cdcbce77b44a8de0698c1d2c05c7530c6a2846e2e7e626f4081278d2923b6d488bd977fde5d162fcb878220ab286613a73ca77dfdfe802508836876675"

RPROVIDES:${PN} += "config-scsirastools \
scsirastools"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
mdadm"

inherit rpm
