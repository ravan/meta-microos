SUMMARY = "Binary files of ppmcheckpdf"
DESCRIPTION = "Binary files of ppmcheckpdf"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn73030"

RPM_NAME = "texlive-ppmcheckpdf-bin-2026.20260301.svn73030-120.4.aarch64.rpm"
RPM_HASH = "d630edf9159c9665507ac5aa3ec32fab4f63bc0335ca6c934ba7b97ecf38061a64e1ba0805d58123b1d621695cb20826980fb7548a65a29bdcbf793afb7159ca"

RPROVIDES:${PN} += "texlive-ppmcheckpdf-bin"

RDEPENDS:${PN} += "texlive-ppmcheckpdf"

inherit rpm
