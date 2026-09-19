SUMMARY = "Additional tuned profile(s) targeted to SAP NetWeaver loads"
DESCRIPTION = "Additional profile(s) for the tuned daemon, targeted to SAP NetWeaver loads."
LICENSE = "GPL-2.0-or-later"

PV = "2.27.0.0+git.38d4414"

RPM_NAME = "tuned-profiles-sap-2.27.0.0+git.38d4414-1.2.noarch.rpm"
RPM_HASH = "8ab8448aac2cffa1175ae827de7fe1ac5a89c9ae79fc982e3c8bf9ab43f777f515f59a44f685a7266227107d5c27bd5307de2024570cc54b920bd5e1dc2c9e0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuned-profiles-sap"

RDEPENDS:${PN} += "tuned"

inherit rpm
