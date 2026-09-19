SUMMARY = "Binary files of pdfxup"
DESCRIPTION = "Binary files of pdfxup"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn40690"

RPM_NAME = "texlive-pdfxup-bin-2026.20260301.svn40690-120.4.aarch64.rpm"
RPM_HASH = "e4fc522b887ed9cb82e5f5b166186a31cf48e213de8f7533f99f7be0590a6dc485b31c44a2c2d468f85e939f42aa3340adc0efe9de5bccea78fe377a57dd4912"

RPROVIDES:${PN} += "texlive-pdfxup-bin"

RDEPENDS:${PN} += "texlive-pdfxup"

inherit rpm
