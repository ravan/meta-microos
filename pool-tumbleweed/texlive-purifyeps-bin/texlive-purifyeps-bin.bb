SUMMARY = "Binary files of purifyeps"
DESCRIPTION = "Binary files of purifyeps"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn13663"

RPM_NAME = "texlive-purifyeps-bin-2026.20260301.svn13663-120.4.aarch64.rpm"
RPM_HASH = "25e6640954bbed1cc63028e9d6b7f031481805fa0e210f4324a0aef34c94304ef6ad1df3f84824f49ffc9a21bcf9928dc3ae2ba15d47675fd8a237822ee38058"

RPROVIDES:${PN} += "texlive-purifyeps-bin"

RDEPENDS:${PN} += "texlive-purifyeps"

inherit rpm
