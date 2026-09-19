SUMMARY = "Binary files of bundledoc"
DESCRIPTION = "Binary files of bundledoc"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn17794"

RPM_NAME = "texlive-bundledoc-bin-2026.20260301.svn17794-120.4.aarch64.rpm"
RPM_HASH = "65976b3a1ad609c1c533a40434c398181aace70848dd1dbe41232afd9d804f7dbfbe21b44befa9cebd5faf5e1dcb3303f121ae5b9ba7650b9714c79835c326be"

RPROVIDES:${PN} += "texlive-bundledoc-bin"

RDEPENDS:${PN} += "texlive-bundledoc"

inherit rpm
