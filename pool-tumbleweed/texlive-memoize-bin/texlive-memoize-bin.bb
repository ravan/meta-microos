SUMMARY = "Binary files of memoize"
DESCRIPTION = "Binary files of memoize"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn68515"

RPM_NAME = "texlive-memoize-bin-2026.20260301.svn68515-120.4.aarch64.rpm"
RPM_HASH = "d6b680b5cfc809e7efbe5f799280475ef66062e2a9ba6abf5a31b69191a83efd370a9f1217851dade7b7caefc0ae8260a90693bd4a3d6e46eb7c9bbb192131fc"

RPROVIDES:${PN} += "texlive-memoize-bin"

RDEPENDS:${PN} += "texlive-memoize"

inherit rpm
