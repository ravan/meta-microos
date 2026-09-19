SUMMARY = "Binary files of xindex"
DESCRIPTION = "Binary files of xindex"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn49312"

RPM_NAME = "texlive-xindex-bin-2026.20260301.svn49312-120.4.aarch64.rpm"
RPM_HASH = "3eee555ccd4a728c03c3a1058a4c366c2c247576dee613351b83b669bc522e53cba982fe6a20f126da85ab40017fa191113e284b8ae9450490d87b8c1bc958de"

RPROVIDES:${PN} += "texlive-xindex-bin"

RDEPENDS:${PN} += "texlive-xindex"

inherit rpm
