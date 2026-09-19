SUMMARY = "Fence agent for SCSI persistent reservations"
DESCRIPTION = "Fence agent for SCSI persistent reservations."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "4.17.0+git.1786356985.d90bec5f"

RPM_NAME = "fence-agents-scsi-4.17.0+git.1786356985.d90bec5f-1.1.noarch.rpm"
RPM_HASH = "f490496f5e34c0421ead2a5f9d504027545a822cb30bf8d6c31952cf351475c14d793bf7265868225be21b3382a4a3fee3b3c7b9ad40687c29afdeab973de152"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fence-agents-scsi"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.13 \
fence-agents-common \
sg3-utils"

inherit rpm
