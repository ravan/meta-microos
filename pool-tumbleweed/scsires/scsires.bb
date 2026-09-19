SUMMARY = "A SCSI reservation tool"
DESCRIPTION = "This tool is for issuing SCSI-2 reservation and release commands, for \
controlling exclusive access to a SCSI device that is shared between \
more than one SCSI host adapter."
LICENSE = "GPL-2.0-or-later"

PV = "0.7"

RPM_NAME = "scsires-0.7-26.3.aarch64.rpm"
RPM_HASH = "695bbe86ef5ecf073188bd00f5922d63bdaa8b68d614d5c50db62c07137e593aa7dcbfabeee6cb096d74908880168c8c14c6b2aa0974a58117d2765b8449f1d3"

RPROVIDES:${PN} += "scsires"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpopt.so.0"

inherit rpm
