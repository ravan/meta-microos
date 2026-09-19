SUMMARY = "Binary files of expltools"
DESCRIPTION = "Binary files of expltools"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn73049"

RPM_NAME = "texlive-expltools-bin-2026.20260301.svn73049-120.4.aarch64.rpm"
RPM_HASH = "6c30acca1e9af16c24f6155d30260f90e9f9a4391281327c99b1ba05eed9a98f0dd70537cd7553106d290e3812a3177f788d9a578c7f41a3976c491db8457e37"

RPROVIDES:${PN} += "texlive-expltools-bin"

RDEPENDS:${PN} += "texlive-expltools"

inherit rpm
