SUMMARY = "A simple literate programming tool based on clojure's pamphlet system"
DESCRIPTION = "The Clojure pamphlet system is a system based on the Clojure \
literate system. In the Clojure's pamphlet system you have your \
main LaTeX file, which can be compiled regularly. This file \
contains documentation and source code (just like in other \
forms of literate programming). These code snippets are wrapped \
in the chunk environment, hence they can be recognized by the \
tangler in order to extract them. Chunks can be included inside \
each other by the getchunk command (which will be typeset \
accordingly). Finally, the LaTeX file will be run through the \
tangler to get the desired chunk of code."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.3svn77682"

RPM_NAME = "texlive-clojure-pamphlet-2026.226.1.3svn77682-60.2.noarch.rpm"
RPM_HASH = "1f9b9208e183d3f039d98f74b0867f9cb1bc1fd80425314e31a12e9ea2e7275beae1fd4113845c72a7c10528306b95023a40b7bfc95f929881bcf721e31a381b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-clojure-pamphlet.sty \
texlive-clojure-pamphlet"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Getopt--Long \
perl-Pod--Usage \
perl-strict \
perl-vars \
perl-warnings \
sed \
tex-hyperref.sty \
tex-listings.sty \
texlive \
texlive-clojure-pamphlet-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
