SUMMARY = "An rc file (dotfile) management tool"
DESCRIPTION = "The rcm suite of tools is for managing dotfiles directories. This is a \
directory containing all the .*rc files in your home directory (.zshrc, \
.vimrc, and so on). These files have gone by many names in history, \
such as “rc files” because they typically end in rc or “dotfiles” \
because they begin with a period."
LICENSE = "BSD-3-Clause"

PV = "1.3.6"

RPM_NAME = "rcm-1.3.6-1.10.noarch.rpm"
RPM_HASH = "0bc6ab03b667e0861f8255169645170fd482cd4ed087ff52997ec439211cf40c286ef53e6d24b327ec28b36e0c68ee259bed924994303e195192d6d277a7d4c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rcm"

RDEPENDS:${PN} += "/usr/bin/bash \
bash"

inherit rpm
