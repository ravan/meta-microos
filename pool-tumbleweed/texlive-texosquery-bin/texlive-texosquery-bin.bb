SUMMARY = "Binary files of texosquery"
DESCRIPTION = "Binary files of texosquery"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn43596"

RPM_NAME = "texlive-texosquery-bin-2026.20260301.svn43596-120.4.aarch64.rpm"
RPM_HASH = "8b4079ad76fc204e65c21a32a8f4b6a72c4fd5a3a268df333abf9075063aa9897e99b201b49f5062e8503725f3156e32dd0bbbf9da0c9dbda17493901f804b48"

RPROVIDES:${PN} += "texlive-texosquery-bin"

RDEPENDS:${PN} += "texlive-texosquery"

inherit rpm
