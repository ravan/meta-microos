SUMMARY = "Binary files of latexindent"
DESCRIPTION = "Binary files of latexindent"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn32150"

RPM_NAME = "texlive-latexindent-bin-2026.20260301.svn32150-120.4.aarch64.rpm"
RPM_HASH = "03229d0d4ee6b714555c7092bf06d88da4af1f15bf66e82466fc7e21abd5155260e959e98580a6f78b970ba4da4a3e7fcc902dd451ac18633d9a01122940103b"

RPROVIDES:${PN} += "texlive-latexindent-bin"

RDEPENDS:${PN} += "texlive-latexindent"

inherit rpm
