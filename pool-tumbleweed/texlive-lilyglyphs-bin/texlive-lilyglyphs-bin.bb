SUMMARY = "Binary files of lilyglyphs"
DESCRIPTION = "Binary files of lilyglyphs"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn31696"

RPM_NAME = "texlive-lilyglyphs-bin-2026.20260301.svn31696-120.4.aarch64.rpm"
RPM_HASH = "6bb94f5ae10505afcf75fe054b339d5b6980b72c40459dcb500452b240507b01929b65097a25d4cede80bbfa61f4266abfdf82c0bc47883ee902e41c016fd26e"

RPROVIDES:${PN} += "texlive-lilyglyphs-bin"

RDEPENDS:${PN} += "texlive-lilyglyphs"

inherit rpm
