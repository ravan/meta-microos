SUMMARY = "A '\\titleref' command to cross-reference section titles"
DESCRIPTION = "Defines a command \\titleref that allows you to cross-reference \
section (and chapter, etc) titles and captions just like \\ref \
and \\pageref. The package does not interwork with hyperref; if \
you need hypertext capabilities, use nameref instead."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.3.1svn77682"

RPM_NAME = "texlive-titleref-2026.226.3.1svn77682-59.2.noarch.rpm"
RPM_HASH = "f1f8fc75e32de1552252dabd227e0612fc6dba263a740e7cb8250877bd2749884ec5f48c22df6bfb98cdffb839b9fa2831846cf76f6aea8eb2dad1f54b3c15c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-titleref.sty \
texlive-titleref"

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
