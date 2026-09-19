SUMMARY = "An ncurses-based text-mode interface for git"
DESCRIPTION = "Tig is a git repository browser that additionally can act as a pager \
for output from various git commands. \
 \
When browsing repositories, it uses the underlying git commands to \
present the user with various views, such as summarized revision log \
and showing the commit with the log message, diffstat, and the diff. \
 \
Using it as a pager, it will display input from stdin and colorize it."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.1"

RPM_NAME = "tig-2.6.1-1.3.aarch64.rpm"
RPM_HASH = "facc57e4646d846779c7245980e4e16f074402978a4a667209ccf3c7bfc00cb8432107c99f8895e64c1c5965ea8c6187a519662d4953ec76268233b4d844c61a"

RPROVIDES:${PN} += "config-tig \
tig"

RDEPENDS:${PN} += "git-core \
ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libpcre2-8.so.0 \
libpcre2-posix.so.3 \
libreadline.so.8 \
libtinfo.so.6"

inherit rpm
