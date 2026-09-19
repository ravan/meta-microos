SUMMARY = "C-Bindings development files for adms"
DESCRIPTION = "This package contains all include files, libraries and configuration \
files needed to develop programs that use adms."
LICENSE = "GPL-3.0-only"

PV = "2.3.7"

RPM_NAME = "adms-devel-2.3.7-3.5.aarch64.rpm"
RPM_HASH = "58728a9163f9a683bb1688d0731863434886295449af22decda5d441604d62786533036a346c3c3a5074c211856831f975e225d4c5e064dcb300beba4b774735"

RPROVIDES:${PN} += "adms-devel"

RDEPENDS:${PN} += "libadms0"

inherit rpm
