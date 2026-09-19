SUMMARY = "Binary files of chklref"
DESCRIPTION = "Binary files of chklref"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn52631"

RPM_NAME = "texlive-chklref-bin-2026.20260301.svn52631-120.4.aarch64.rpm"
RPM_HASH = "cd32b7ca835e4f2b097843574d300af2e7127c78db4ac103be2a05e2c1ebae1d0b72bda6f056f9ae2c34c3a2935aa1262ab40fb6bab1adfa9514fa86caf3b74c"

RPROVIDES:${PN} += "texlive-chklref-bin"

RDEPENDS:${PN} += "texlive-chklref"

inherit rpm
