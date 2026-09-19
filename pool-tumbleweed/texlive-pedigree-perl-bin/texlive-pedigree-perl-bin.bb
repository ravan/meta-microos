SUMMARY = "Binary files of pedigree-perl"
DESCRIPTION = "Binary files of pedigree-perl"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn25962"

RPM_NAME = "texlive-pedigree-perl-bin-2026.20260301.svn25962-120.4.aarch64.rpm"
RPM_HASH = "5e636f7f88f0d27ddbccc9f6f3090351a5c666b7286a2a4d0fb14a082c9bb0231b818194e44ba38a0c3ac20fffe64a16ffe23021ed6f05c9e2efb733dea44241"

RPROVIDES:${PN} += "texlive-pedigree-perl-bin"

RDEPENDS:${PN} += "texlive-pedigree-perl"

inherit rpm
