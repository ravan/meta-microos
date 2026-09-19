SUMMARY = "Deal with DOS binary EPS files"
DESCRIPTION = "A Encapsulated PostScript (EPS) file may given in a special \
binary format to support the inclusion of a thumbnail. This \
file format, commonly known as DOS EPS format starts with a \
binary header that contains the positions of the possible \
sections: PostScript (PS); Windows Metafile Format (WMF); and \
Tag Image File Format (TIFF). The PS section must be present \
and either the WMF file or the TIFF file should be given. The \
package provides a Perl program that will extract any of the \
sections of such a file, in particular providing a 'text'-form \
EPS file for use with (La)TeX."
LICENSE = "Artistic-1.0"

PV = "2026.226.1.2svn29752"

RPM_NAME = "texlive-dosepsbin-2026.226.1.2svn29752-59.2.noarch.rpm"
RPM_HASH = "d3fb49b222479c6c46361d936cb7790ae8dc1b38fab142dbd5c57cdb5f7240352b56c8a0e81d2a5944113e712fe745604f4c6e6f9f222e4ab234cc7d757937c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dosepsbin"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Getopt--Long \
perl-Pod--Usage \
perl-strict \
sed \
texlive \
texlive-dosepsbin-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
