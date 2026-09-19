SUMMARY = "Binary files of texplate"
DESCRIPTION = "Binary files of texplate"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn53444"

RPM_NAME = "texlive-texplate-bin-2026.20260301.svn53444-120.4.aarch64.rpm"
RPM_HASH = "a580e0b5f5778666e591ece8acd413ac5150f4bcee1443a1404d5b58309708428b63654fff8d74e2ffac9738e3549e95e02d6580c5ebee762c68ef364142e97b"

RPROVIDES:${PN} += "texlive-texplate-bin"

RDEPENDS:${PN} += "texlive-texplate"

inherit rpm
