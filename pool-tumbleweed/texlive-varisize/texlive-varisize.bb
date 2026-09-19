SUMMARY = "Change font size in Plain TeX"
DESCRIPTION = "A series of files, each of which defines a size-change macro. \
Note that 10point.tex is by convention called by one of the \
other files, so that there's always a 'way back'."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-varisize-2026.226.svn15878-60.2.noarch.rpm"
RPM_HASH = "cf90bef80e6d0a04903e23b64f46370ec0eaf1f1978b15f2436bdc9168bdbb85811102e0e144e5edbe34ace8b8c748c26e21faa6fd0727705edd6f62cafc696a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-10point.tex \
tex-10pointss.tex \
tex-11point.tex \
tex-12point.tex \
tex-14point.tex \
tex-17point.tex \
tex-20point.tex \
tex-7point.tex \
tex-8point.tex \
tex-9point.tex \
texlive-varisize"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
