SUMMARY = "Asynchronous Lint Engine plugin for VIM"
DESCRIPTION = "ALE makes use of NeoVim and Vim 8 job control functions and timers \
to run linters on the contents of text buffers and return errors as \
text is changed in Vim. This allows for displaying warnings and \
errors in files being edited in Vim before files have been saved \
back to a filesystem. \
 \
In other words, this plugin allows you to lint while you type."
LICENSE = "BSD-2-Clause"

PV = "4.0.0"

RPM_NAME = "vim-plugin-ale-4.0.0-64.2.noarch.rpm"
RPM_HASH = "883c1d570ad8a6ae37069cd1dc8c16d84fccf8f56ee37b201dd86febcb0bfe4e3671da445f983bc59caf4de5cc0be79d227f15230f2d8778b081d5a064aec934"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-ale"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
