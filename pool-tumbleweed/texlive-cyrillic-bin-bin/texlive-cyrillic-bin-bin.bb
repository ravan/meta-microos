SUMMARY = "Binary files of cyrillic-bin"
DESCRIPTION = "Binary files of cyrillic-bin"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn53554"

RPM_NAME = "texlive-cyrillic-bin-bin-2026.20260301.svn53554-120.4.aarch64.rpm"
RPM_HASH = "62d86e6a284190f0d23bcbfc2758c06770ff1e5a4b932b01c2e2a9095762366ed2567dfb0f13e565c7a7dfebfce59c1d5038ca9f2ecb1b579f5b5e9736f287f7"

RPROVIDES:${PN} += "texlive-cyrillic-bin-bin"

RDEPENDS:${PN} += "texlive-cyrillic-bin"

inherit rpm
