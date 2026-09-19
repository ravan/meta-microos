SUMMARY = "System InformaTion at Runtime"
DESCRIPTION = "Sitar prepares system information using perl and binary tools, and by \
reading the /proc file system. Output is in HTML, LaTeX and (docbook) \
XML, and can be converted to PS and PDF. \
 \
This program must be run as 'root'. \
 \
sitar.pl includes scsiinfo by Eric Youngdale, Michael Weller \
<eowmob@exp-math.uni-essen.de> and ide_info by David A. Hinds \
<dhinds@hyper.stanford.edu>. \
 \
The accompanying tool 'cfg2scm' is supplied for checking configuration \
changes into SCMs (like SVN, CVS, ...) or creating a tar-file with all \
relevant files. \
 \
Comment: Sitar is an ancient Indian instrument as well."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.6"

RPM_NAME = "sitar-1.0.6-156.8.noarch.rpm"
RPM_HASH = "ef7184df00f34984d8edacd73adabfdcca8280443ff9629f54cd29dfea7e66dbbee83fce41d9a0b16e0ea6038a6d4eb935310163b0988151cbeacb1cf55c4f60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sitar"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/perl \
/usr/bin/sh \
/usr/bin/touch \
fillup"

inherit rpm
