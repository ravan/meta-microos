SUMMARY = "Binary files of pfarrei"
DESCRIPTION = "Binary files of pfarrei"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn29348"

RPM_NAME = "texlive-pfarrei-bin-2026.20260301.svn29348-120.4.aarch64.rpm"
RPM_HASH = "79a4c6f1f90be9c19b69041bae1b4489224477e8676168b7d0123ae9a3a6d4800c2630630a36db126a4a0b3ba3b99e3cdf56e0cb80802788879fb67fbe55f239"

RPROVIDES:${PN} += "texlive-pfarrei-bin"

RDEPENDS:${PN} += "texlive-pfarrei"

inherit rpm
