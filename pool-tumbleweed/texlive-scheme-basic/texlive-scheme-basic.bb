SUMMARY = "Basic scheme (plain and latex)"
DESCRIPTION = "This is the basic TeX Live scheme: it is a small set of files \
sufficient to typeset plain TeX or LaTeX documents in \
PostScript or PDF, using the Computer Modern fonts. This scheme \
corresponds to collection-basic and collection-latex."
LICENSE = "LPPL-1.0"

PV = "2026.222.svn54191"

RPM_NAME = "texlive-scheme-basic-2026.222.svn54191-68.2.noarch.rpm"
RPM_HASH = "60f1b649987e393cb23e16cf4ce7efab8f2161a29fe79cb41d31ffe00ff32a7d31cc6d77010a2119fbf547938088ab37b3dc094bd0a9aaf2584a30f36bdf138b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
tex-basic \
texlive-scheme-basic"

RDEPENDS:${PN} += "texlive-collection-basic \
texlive-collection-latex"

inherit rpm
