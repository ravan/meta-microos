SUMMARY = "Collection of day-to-day tools (scripts)"
DESCRIPTION = "Architecture-independent programs from hxtools. \
 \
* cwdiff(1) — run wdiff with color \
* diff2php(1) — transform patch to self-serving PHP file \
* doxygen-kerneldoc-filter(1) — filter for Doxygen to support kerneldoc \
* filenameconv(1) — convert file name encoding \
* git-author-stat(1) — show commit author statistics of a git repository \
* git-export-patch(1) — produce perfect patch from git comits for mail submission \
* git-forest(1) — display the commit history forest \
* git-revert-stats(1) — show reverting statistics of a git repository \
* git-track(1) — set up branch for tracking a remote \
* man2html(1) — convert nroff manpages to HTML \
* pegrep(1) — perl-regexp-based multi-line grep \
* pesubst(1) — perl-regexp-based stream substitution (replaces sed for substitutions) \
* recursive_lower(1) — recursively lowercase all filenames \
* spec-beautifier(1) — program to clean up RPM .spec files \
* vcsaview(8) — display a screen dump in VCSA format \
* wktimer(1) — work timer"
LICENSE = "GPL-2.0-or-later & WTFPL"

PV = "20251011"

RPM_NAME = "hxtools-scripts-20251011-1.6.noarch.rpm"
RPM_HASH = "151a4fcdd26440e5facbd5bcf2cb8aeda57830458ad253174d4047f32d1d645731a1709baaa222d9595fdcb049d305ead7332e4a20ea9191a6b5d6645d742d95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hxtools-scripts"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
hxtools \
perl-Data--Dumper \
perl-File--Find \
perl-File--Find--Rule \
perl-Getopt--Long \
perl-IPC--Open2 \
perl-Text--CSV-XS"

inherit rpm
