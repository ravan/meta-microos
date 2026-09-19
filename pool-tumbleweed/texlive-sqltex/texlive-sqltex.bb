SUMMARY = "An SQL Preprocessor for LaTeX"
DESCRIPTION = "SQLTeX is a preprocessor that enables the use of SQL statements \
in LaTeX. The SQLTeX perl script reads an input file containing \
the LaTeX source with SQL commands, and writes a LaTeX file in \
which the SQL commands have been replaced by the values from \
their execution. It is possible to select a field for \
substitution in your LaTeX document, or to be used as input in \
another SQL command. (When an SQL command returns multiple \
fields and/or rows, the values can only be used within the \
document.) The default is to use MySQL databases, but Pg, \
Sybase, Oracle, Ingres, mSQL and PostgreSQL are also supported."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.0svn72396"

RPM_NAME = "texlive-sqltex-2026.226.3.0svn72396-64.2.noarch.rpm"
RPM_HASH = "7746fb0796468cdc3385caea78aef449f2e1d3b95ecae54435d187bda8bdacd3751a675101cc216b4db5873ff12f7b7dbe72613b7674180f7be1d1dbcc163459"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-SQLTeX-r.dat \
tex-SQLTeX.cfg \
texlive-sqltex"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Cwd \
perl-DBI \
perl-Getopt--Long \
perl-feature \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-sqltex-bin"

inherit rpm
