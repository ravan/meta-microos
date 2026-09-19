SUMMARY = "Binary files of xml2pmx"
DESCRIPTION = "Binary files of xml2pmx"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn77900"

RPM_NAME = "texlive-xml2pmx-bin-2026.20260301.svn77900-120.4.aarch64.rpm"
RPM_HASH = "07c194a462ba5597db4108a188154d350a34943cd876a228e4d7525234d8c3cd6a70e3289b0740f72e031133944b2056e251f88f1b816683233f9c0a923e5757"

RPROVIDES:${PN} += "texlive-xml2pmx-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
texlive-xml2pmx"

inherit rpm
