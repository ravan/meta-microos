SUMMARY = "Documentation for the GNU compiler collection"
DESCRIPTION = "GNU info-pages for the GNU compiler collection covering both user-level \
and internals documentation."
LICENSE = "GFDL-1.2-only"

PV = "14.4.0+git12698"

RPM_NAME = "gcc14-info-14.4.0+git12698-1.4.noarch.rpm"
RPM_HASH = "5a3a0dd8568f3c7b02e88e20b8ed245584bfd870657c972d72900009ac2d34c9a5b0afa7c414e61158bf12fbfcbc845cddc71732e8fab422729b754534300a8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gcc14-info"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
