SUMMARY = "Allows the marking of preliminary versions of a document"
DESCRIPTION = "Puts text below the normal page content (the default text marks \
the document as draft and puts a timestamp on it). Can be used \
together with e.g. the vrsion, rcs and rcsinfo packages. Uses \
the everyshi package and can use the scrtime package from the \
koma-script bundle."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.00svn77682"

RPM_NAME = "texlive-prelim2e-2026.226.2.00svn77682-59.2.noarch.rpm"
RPM_HASH = "e8da2182938607e4ea75b7ca6eb47f36d038994cda6d7f643f9ffe2fb4c1e584602ed768074a1cfab979ba148034d063a62c1e6f7d4bd8c89f3bf57946f84636"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-prelim2e.sty \
texlive-prelim2e"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-scrtime.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
