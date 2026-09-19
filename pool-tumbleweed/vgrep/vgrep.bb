SUMMARY = "Frontend for git-grep and grep"
DESCRIPTION = "vgrep is a command-line tool to search textual patterns in directories. It \
serves as a frontend to grep and git-grep and allows to open the indexed \
matching lines in a user-specified editor. vgrep is inspired by the ancient \
cgvg scripts but extended to perform further operations such as listing \
statistics of files and directory trees or showing the context lines before and \
after the matches."
LICENSE = "GPL-3.0-only"

PV = "2.8.0"

RPM_NAME = "vgrep-2.8.0-1.13.aarch64.rpm"
RPM_HASH = "c33614aae79e84daa90adb839eb38c0fb59c86410c2376a9412e1da542c610279749239c56b7770aadc718dfcce5e20b4256f1ea8339b5b4338475b1d239a8d8"

RPROVIDES:${PN} += "vgrep"

RDEPENDS:${PN} += "git-core \
grep"

inherit rpm
