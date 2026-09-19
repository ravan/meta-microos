SUMMARY = "Polyglossia support for Occitan"
DESCRIPTION = "Occitan language description file for polyglossia"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn52593"

RPM_NAME = "texlive-gloss-occitan-2026.226.0.0.1svn52593-60.4.noarch.rpm"
RPM_HASH = "4f2d24f129abc01ff759486bf78cad1f2855a6a36374a5509e659b6ef99b72510b6a47c15d56ba69322766ba753c77b165b31559e198680201db6d20f018e730"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gloss-occitan"

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
