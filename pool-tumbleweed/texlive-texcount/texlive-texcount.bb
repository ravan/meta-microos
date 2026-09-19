SUMMARY = "Count words in a LaTeX document"
DESCRIPTION = "TeXcount is a Perl script that counts words in the text of \
LaTeX files. It has rules for handling most of the common \
macros, and can provide colour-coded output showing which parts \
of the text have been counted. The package script is available \
as a Web service via its home page."
LICENSE = "LPPL-1.0"

PV = "2026.227.3.1.1svn49013"

RPM_NAME = "texlive-texcount-2026.227.3.1.1svn49013-62.2.noarch.rpm"
RPM_HASH = "4cb31019b9eb80d51b9b38e30c12c83e618cb6d4b2192ccd0c589989fd9a3b24ea4e2621cf8f3d1f0c858eae881797198fe55e134c372aab876f20f89047185f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texcount"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Encode \
perl-Term--ANSIColor \
perl-Text--Wrap \
perl-strict \
perl-utf8 \
perl-warnings \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-texcount-bin"

inherit rpm
