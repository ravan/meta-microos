SUMMARY = "Binary files of bibtexperllibs"
DESCRIPTION = "Binary files of bibtexperllibs"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn68869"

RPM_NAME = "texlive-bibtexperllibs-bin-2026.20260301.svn68869-120.4.aarch64.rpm"
RPM_HASH = "704077ef3d5cdccf73b00070354cb7afb767f0209f921c348bc52e3f92aaea3512df570175ecf11831f6e6def127a97e02eab57fd758d2909946c81ebfacd805"

RPROVIDES:${PN} += "texlive-bibtexperllibs-bin"

RDEPENDS:${PN} += "texlive-bibtexperllibs"

inherit rpm
