SUMMARY = "Documentation for texlive-alterqcm"
DESCRIPTION = "This package includes the documentation for texlive-alterqcm"
LICENSE = "LPPL-1.0"

PV = "2026.226.4.42csvn59265"

RPM_NAME = "texlive-alterqcm-doc-2026.226.4.42csvn59265-61.2.noarch.rpm"
RPM_HASH = "4223120de715af9c7b6b7ac73be4fd7b4f9754f1b33ef78ac41f59729c6ffd2fd83a927b1aa71783b1adb90092d0ebd6e32158c7b965e232209af6331d65ff99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-alterqcm-doc-en \
texlive-alterqcm-doc"

RDEPENDS:${PN} += ""

inherit rpm
