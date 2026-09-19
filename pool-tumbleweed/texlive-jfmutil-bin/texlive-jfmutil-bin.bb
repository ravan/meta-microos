SUMMARY = "Binary files of jfmutil"
DESCRIPTION = "Binary files of jfmutil"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn44835"

RPM_NAME = "texlive-jfmutil-bin-2026.20260301.svn44835-120.4.aarch64.rpm"
RPM_HASH = "3b18a53bd4df0ec392f2396983d8428b54153cb57ed774d46010db520ab4f57773f780a5eb6c8cd2748de9060dd3ce5c7d11a81fb408f87814aba98a6e6bc132"

RPROVIDES:${PN} += "texlive-jfmutil-bin"

RDEPENDS:${PN} += "texlive-jfmutil"

inherit rpm
