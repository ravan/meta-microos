SUMMARY = "A Perl filter program for use with PiCTeX"
DESCRIPTION = "MathsPIC(Perl) is a development of the earlier MathsPIC(DOS) \
program, now implemented as a Perl script, being much more \
portable than the earlier program. MathsPIC parses a plain text \
input file and generates a plain text output-file containing \
commands for drawing a diagram. Version 1.0 produces output \
containing PiCTeX and (La)TeX commands, which may then be \
processed by plain TeX or LaTeX in the usual way. MathsPIC also \
outputs a comprehensive log-file. MathsPIC facilitates creating \
figures using PiCTeX by providing an environment for \
manipulating named points and also allows the use of variables \
and maths (advance, multiply, and divide)--in short--it takes \
the pain out of PiCTeX. Both the original DOS version and the \
new Perl version are available."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.13svn31957"

RPM_NAME = "texlive-mathspic-2026.226.1.13svn31957-59.2.noarch.rpm"
RPM_HASH = "6d1e33e1e128375082f8de55e681775a72ed5f2d1fa9ab1dc83c988787d9b3063785731d544f20393f954dc0e7e94eae7366ca0c72d17867cd3ebc98e3e1ad5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mathspic.sty \
texlive-mathspic"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Math--Trig \
perl-constant \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-mathspic-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
