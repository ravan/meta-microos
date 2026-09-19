SUMMARY = "Filter and summarize LaTeX log files"
DESCRIPTION = "texlogsieve reads a LaTeX log file (or the standard input if no \
file is specified), filters out less relevant messages, and \
displays a summary report. It is a texlua script, similar in \
spirit to tools such as texfot, texloganalyser, rubber-info, \
textlog_extract, texlogparser, texlogfilter, pulp, and others. \
Highlights: Two reports: the most important messages from the \
log file followed by a summary of repeated messages, undefined \
references etc.; The program goes to great lengths to correctly \
handle TeX line wrapping and does a much better job at that \
than existing tools; Multiline messages are treated as a single \
entity; Several options to control which messages should be \
filtered out; No messages are accidentally removed; The summary \
report is currently simple, but useful."
LICENSE = "GPL-2.0-or-later"

PV = "2026.227.1.6.1svn77351"

RPM_NAME = "texlive-texlogsieve-2026.227.1.6.1svn77351-62.2.noarch.rpm"
RPM_HASH = "0723240652bda9d60993df6cac3691b6713ae81fdb280d382e6f769dda2ccf804d6eefb212bdbd2fe7c72d33657c914b6d713fe65d0e70cd38aee9f68eefbb30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texlogsieve"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/texlua \
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
texlive-scripts-bin \
texlive-texlogsieve-bin"

inherit rpm
