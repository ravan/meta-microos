SUMMARY = "Binary files of fontinst"
DESCRIPTION = "Binary files of fontinst"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn53554"

RPM_NAME = "texlive-fontinst-bin-2026.20260301.svn53554-120.4.aarch64.rpm"
RPM_HASH = "6bf475f79c6be00b35e5b208d4ea53eb2f80c7431dd1fa28353ffa1c0485a79bb0f027d07cf8eefa22cdda2f1584cef1d1fa059edd0f4d5d2decdaf6a2ace4b3"

RPROVIDES:${PN} += "texlive-fontinst-bin"

RDEPENDS:${PN} += "texlive-fontinst"

inherit rpm
