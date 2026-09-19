SUMMARY = "Binary files of mkpic"
DESCRIPTION = "Binary files of mkpic"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn33688"

RPM_NAME = "texlive-mkpic-bin-2026.20260301.svn33688-120.4.aarch64.rpm"
RPM_HASH = "e52ee8ecad84fe804528d2fb675495948ddbc0669cccd3ab1f29e6374e3d90c8588bcf7f0c90ccba54bd886c44a7bff1b8874d87747ef6a2bd39f335424a971e"

RPROVIDES:${PN} += "texlive-mkpic-bin"

RDEPENDS:${PN} += "texlive-mkpic"

inherit rpm
