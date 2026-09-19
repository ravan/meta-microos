SUMMARY = "Binary files of mathspic"
DESCRIPTION = "Binary files of mathspic"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn23661"

RPM_NAME = "texlive-mathspic-bin-2026.20260301.svn23661-120.4.aarch64.rpm"
RPM_HASH = "d752f7b6e743d653bc287042a9006a926fb3836521e24ab5d9d38771e1a538903c0b7bb9c8c88dabc80e03db0308210fbf13594f03bd84ff8aeaa97f3535a1cb"

RPROVIDES:${PN} += "texlive-mathspic-bin"

RDEPENDS:${PN} += "texlive-mathspic"

inherit rpm
