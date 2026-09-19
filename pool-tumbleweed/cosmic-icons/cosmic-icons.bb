SUMMARY = "System76 Cosmic icon theme for Linux"
DESCRIPTION = "These are the icons used by the COSMIC DE, created by System76"
LICENSE = "CC-BY-SA-4.0 & GPL-3.0-only"

PV = "1.1.0"

RPM_NAME = "cosmic-icons-1.1.0-1.1.noarch.rpm"
RPM_HASH = "54378aa9f3c5162c1123ee526c41b5512c50b8a5c41386ebd47ebae21b7845b57c21acdafaa138112a7cbb1af0e75dffbe1912c718a6833d9a6efc3368a12d4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cosmic-icons"

RDEPENDS:${PN} += "pop-icon-theme"

inherit rpm
