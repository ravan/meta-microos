SUMMARY = "Documentation for ClamAV in HTML format"
DESCRIPTION = "Optional HTML documentation for ClamAV antivirus engine"
LICENSE = "GPL-2.0-only"

PV = "1.5.4"

RPM_NAME = "clamav-docs-html-1.5.4-2.1.noarch.rpm"
RPM_HASH = "3c31854b4e4f8e5d63971dd0c3ea66f6bde0cd248f424ae154341c78d8c8302b3e7a64bc5a7ca2cc66eb924875c2be0e035b82ae4065095f347a735bc7083198"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clamav-docs-html"

RDEPENDS:${PN} += "clamav"

inherit rpm
