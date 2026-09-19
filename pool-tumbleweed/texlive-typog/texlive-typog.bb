SUMMARY = "Typographic fine-tuning and micro-typographic enhancements"
DESCRIPTION = "This package provides macros for micro-typographic \
enhancements. It covers a variety of topics: Precise \
hyphenation control Disable/break ligatures Manual italic \
correction Extra kerning for slash and hyphen Raising selected \
characters (e.g. hyphen, en-dash, and em-dash) Aligning of the \
last line of a paragraph Filling of the last line of a \
paragraph Word spacing control Microtype front-end Slightly \
sloppy paragraphs Vertically partially-tied paragraphs \
Breakable displayed equations Setspace front-end Smooth \
ragged-right paragraphs Moreover, typog provides an environment \
to flag interesting parts of the information deluge typically \
accumulating in a LaTeX log-file and an associated tool, \
typog-grep, that selectively retrieves these parts."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5svn76661"

RPM_NAME = "texlive-typog-2026.226.0.0.5svn76661-59.2.noarch.rpm"
RPM_HASH = "a3e3185ed9acc5a8bda57f85019facb26a626dd1ec7cce3f5c730c360cba547c481c6f242d54219dd80b73bc8909d8cb458af824c96d5102fc3947f5fc81472e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-typog.sty \
texlive-typog"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Data--Dumper \
perl-Encode \
perl-English \
perl-File--Basename \
perl-Getopt--Long \
perl-IO--File \
perl-IO--Handle \
perl-Term--ANSIColor \
perl-autodie \
perl-constant \
perl-strict \
perl-warnings \
sed \
tex-etoolbox.sty \
tex-everyhook.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-typog-bin"

inherit rpm
