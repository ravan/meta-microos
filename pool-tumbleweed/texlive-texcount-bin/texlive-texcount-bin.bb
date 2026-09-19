SUMMARY = "Binary files of texcount"
DESCRIPTION = "Binary files of texcount"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn13013"

RPM_NAME = "texlive-texcount-bin-2026.20260301.svn13013-120.4.aarch64.rpm"
RPM_HASH = "f82d1c4e8aa6378d5bf6a46480a1c72a40e1e0d653680f2fb400115fcc49685cb4652b294d1f3c9181cbead8cbc2db52b35b5f37947eec7e31b0bc0c37ccacf4"

RPROVIDES:${PN} += "texlive-texcount-bin"

RDEPENDS:${PN} += "texlive-texcount"

inherit rpm
