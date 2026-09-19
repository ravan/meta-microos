SUMMARY = "Named mark registers with e-TeX"
DESCRIPTION = "E-TeX provides 32 768 mark registers; using this facility is \
far more comfortable than LaTeX tricks with \\markright, \
\\markboth, \\leftmark and \\rightmark. The package provides two \
commands for marking: \\marksthe and \\marksthecs, which have * \
forms which disable expansion; new mark registers are allocated \
as needed. Syntax is closely modelled on the \\marks primitive. \
Four commands are provided for retrieving the marks registers' \
content: \\thefirstmarks, \\thebotmarks, thetopmarks and \
\\getthemarks; and the command \\ifmarksequal is available for \
comparing the content of marks registers. The package requires \
an e-TeX-enabled engine, and the etex package."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn24504"

RPM_NAME = "texlive-emarks-2026.226.1.0svn24504-61.4.noarch.rpm"
RPM_HASH = "bd2225a201a61fd98b48b57ec646058956c37aa9a93267069e9ca30094bc2839ffd0f37b45aac277fbbf9431d48af88b2b241a9146965cf4208b207400409a90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-emarks.sty \
texlive-emarks"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etex.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
