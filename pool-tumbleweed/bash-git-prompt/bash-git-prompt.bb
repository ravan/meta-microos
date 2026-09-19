SUMMARY = "Informative git prompt for bash and fish"
DESCRIPTION = "A bash prompt that displays information about the current git repository. In particular the branch name, difference with remote branch, number of files staged, changed, etc. \
 \
This package will automatically enable the git prompt for bash after \
install. It will disable the prompt accordingly after uninstall."
LICENSE = "BSD-2-Clause"

PV = "2.7.1"

RPM_NAME = "bash-git-prompt-2.7.1-4.3.noarch.rpm"
RPM_HASH = "1caa0c730d3bf1d7295c9888678bcc84100adb63371d92e2debfc87c8122a53c96f2c8186eb50bedacba1049c44c1335fa51b0e6e88d1b20eca64e84278bb3ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bash-git-prompt"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
git-core"

inherit rpm
