SUMMARY = "Documentation files for PIC MCUs"
DESCRIPTION = "Documentation for gputils and supported PIC MCUs."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.2"

RPM_NAME = "gputils-doc-1.5.2-3.5.noarch.rpm"
RPM_HASH = "848deab234a3342385a8720241827a57fc3b0b99ed059d30e1fa928710073b59d74f84ae2e39109b1068418230ab49bea9d0228d06add0ca5f94f3ed4c83c127"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gputils-doc"

RDEPENDS:${PN} += "gputils"

inherit rpm
