SUMMARY = "Key/value support with a hash"
DESCRIPTION = "This package provides only two macros viz. \\TheKey and \
\\TheValue to define then use pairs of key/value and gives a \
semblance of a hash. Syntax: \\TheKey{key}{value} to define the \
value associated to the key, does not produce text; \
\\TheValue{key} to return the value linked to the key. Both \
arguments of \\TheKey are 'moving' as LaTeX defines the term and \
we have sometimes to protect them."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn55985"

RPM_NAME = "texlive-clefval-2026.226.0.0.1svn55985-60.2.noarch.rpm"
RPM_HASH = "3f0a7573ccc0a807c4a852273bf26002195abc6e168bba1e7b10ee92a70d3cac783bdbbdb6c09503bd70e058b9c207ec20bbfc81350318db1bf6c91311e23faf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-clefval.sty \
texlive-clefval"

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
