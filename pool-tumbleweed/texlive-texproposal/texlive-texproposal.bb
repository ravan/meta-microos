SUMMARY = "A proposal prototype for LaTeX promotion in Chinese universities"
DESCRIPTION = "This package contains the original source code and necessary \
attachment of the document 'Proposal for Offering TeX Courses \
and Relevant Resources in Chongqing University'. This proposal \
could be helpful if one is considering to suggest his/her \
university or company to use TeX (or LaTeX, or XeLaTeX) as a \
typesetting system, especially for Chinese universities and \
companies. The present proposal mainly explains the importance \
and necessity of introducing TeX, a typesetting system often \
used in academic writing, to students and teachers. This \
proposal starts from a brief introduction of TeX, then steps \
further into its fascinating application to academic writing \
and dissertation formatting. Finally, a set of possible \
implementation strategies with regard to the proper \
introduction of TeX and relevant resources to our university, \
is proposed."
LICENSE = "LPPL-1.0"

PV = "2026.227.1.4svn43151"

RPM_NAME = "texlive-texproposal-2026.227.1.4svn43151-62.2.noarch.rpm"
RPM_HASH = "534d471aaf242edbc6db5b860ecd4cafc99413126bfef83952daf953dc749a8072556e45e79c940ee816a82b9cef47350178ef83befaea4e7a04643ce4118e7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texproposal"

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
