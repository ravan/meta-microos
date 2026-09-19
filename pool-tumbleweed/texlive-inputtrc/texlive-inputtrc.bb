SUMMARY = "Trace which file loads which"
DESCRIPTION = "The package produces screen/log messages of the form '<current> \
INPUTTING <next>' reporting LaTeX input commands (<current> and \
<next> being file names). The message is indented to reflect \
the level of input nesting. Tracing may be turned on and off, \
and the unit of indentation may be adjusted. The implementation \
somewhat resembles those of packages FiNK and inputfile."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn28019"

RPM_NAME = "texlive-inputtrc-2026.226.0.0.3svn28019-60.2.noarch.rpm"
RPM_HASH = "0e0e1978eaed3554ab231522705a235a1726cdb8f28f9e3d834b206701f5c65faef6beb10a1930c95e6379884f420c22ae5bd0f566bd85d3700ca02bb96fe838"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-inputtrc.sty \
texlive-inputtrc"

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
