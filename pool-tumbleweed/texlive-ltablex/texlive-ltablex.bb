SUMMARY = "Table package extensions"
DESCRIPTION = "Modifies the tabularx environment to combine the features of \
the tabularx package (auto-sized columns in a fixed width \
table) with those of the longtable package (multi-page tables)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn77682"

RPM_NAME = "texlive-ltablex-2026.226.1.1svn77682-59.2.noarch.rpm"
RPM_HASH = "e1699c35955105a0dda88624217f0c8eed8b99490f76feaeec0d2944910151e8e0fe2bf20b68b16cb67001fac079d37b68ca598ffd48f4757682153f208ab6ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ltablex.sty \
texlive-ltablex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-longtable.sty \
tex-tabularx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
