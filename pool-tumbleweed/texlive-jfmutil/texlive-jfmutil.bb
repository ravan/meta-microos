SUMMARY = "Utility to process pTeX-extended TFM and VF"
DESCRIPTION = "This program provides functionality to process data files (JFM \
and VF) that form logical fonts used in (u)pTeX. The functions \
currently available include: The mutual conversion between \
Japanese virtual fonts (pairs of VF and JFM) and files in the \
'ZVP format', which is an original text format representing \
data in virtual fonts. This function can be seen as a \
counterpart to the vftovp/vptovf programs. The mutual \
conversion between VF files alone and files in the 'ZVP0 \
format', which is a subset of the ZVP format."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3.3svn60987"

RPM_NAME = "texlive-jfmutil-2026.226.1.3.3svn60987-63.2.noarch.rpm"
RPM_HASH = "b95b066b46b957db7d94e26a24e83723470dc662b37aed49a1766f9e67fa3900d5b43ae4d6010c91d03e469197c035d5e9eaf0a585540c368d7e1159cb0510a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jfmutil"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Encode \
perl-IPC--Open3 \
perl-constant \
perl-strict \
sed \
texlive \
texlive-filesystem \
texlive-jfmutil-bin \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
