SUMMARY = "A simple class for writing curricula vitae"
DESCRIPTION = "A derivative of the cv class available to lyx users (renamed to \
avoid the existing cv package)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6asvn35537"

RPM_NAME = "texlive-simplecv-2026.226.1.6asvn35537-60.2.noarch.rpm"
RPM_HASH = "298d9edbaee05209a22094cb67df4e6d8a1d6d771dd34c7ee2e5a8b60bbed94a5ae3b01f1219b547abcc6d6a9777c4f8f14ce6e0c2b7e723e0db6f540955a3e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-simplecv.cls \
texlive-simplecv"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
