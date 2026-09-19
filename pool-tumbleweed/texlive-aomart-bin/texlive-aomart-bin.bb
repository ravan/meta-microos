SUMMARY = "Binary files of aomart"
DESCRIPTION = "Binary files of aomart"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn73378"

RPM_NAME = "texlive-aomart-bin-2026.20260301.svn73378-120.4.aarch64.rpm"
RPM_HASH = "d071b91d2b971e5e4dd5d027a10774e586c5108e8eec581c29eb759b379908735f1072fbf4c68f3af187dce65315d659db86b8176fbb75d4fe6b604f3a5f23ca"

RPROVIDES:${PN} += "texlive-aomart-bin"

RDEPENDS:${PN} += "texlive-aomart"

inherit rpm
