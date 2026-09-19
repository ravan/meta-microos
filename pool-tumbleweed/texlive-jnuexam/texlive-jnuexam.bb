SUMMARY = "Exam class for Jinan University"
DESCRIPTION = "The package provides an exam class for Jinan University \
(China)."
LICENSE = "LPPL-1.0"

PV = "2026.226.2024fsvn71883"

RPM_NAME = "texlive-jnuexam-2026.226.2024fsvn71883-63.2.noarch.rpm"
RPM_HASH = "655d7f1e0cd060ded0ac9f96dd03927bd5723da83585ea275da1698589d50ee888f9587e53861b4e863edc87fe0380feed077781d4f47b3cf96eeff9cc60ec26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-jnuexam.cls \
texlive-jnuexam"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-everypage.sty \
tex-functional.sty \
tex-randexam.cls \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
