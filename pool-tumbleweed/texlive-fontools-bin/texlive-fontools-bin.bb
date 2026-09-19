SUMMARY = "Binary files of fontools"
DESCRIPTION = "Binary files of fontools"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn25997"

RPM_NAME = "texlive-fontools-bin-2026.20260301.svn25997-120.4.aarch64.rpm"
RPM_HASH = "31be541981ae70897b94cfddadfb352508ba3e905902a9028dc9edd7030235df962b80781ee46cc47c5e8bb53b40aee1399bd99cb6b858c25802d0482e81d8a3"

RPROVIDES:${PN} += "texlive-fontools-bin"

RDEPENDS:${PN} += "texlive-fontools"

inherit rpm
