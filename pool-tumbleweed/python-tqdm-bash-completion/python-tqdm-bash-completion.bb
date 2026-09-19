SUMMARY = "Bash completion for python-tqdm"
DESCRIPTION = "tqdm lets you output a progress meter from within loops by wrapping \
any iterable with 'tqdm(iterable)'. \
tqdm's overhead is one order of magnitude less than python-progressbar \
and does not require ncurses. \
 \
This package provides the completion file for bash"
LICENSE = "MIT & MPL-2.0"

PV = "4.70.0"

RPM_NAME = "python-tqdm-bash-completion-4.70.0-1.1.noarch.rpm"
RPM_HASH = "c0ed3b15bede715471f611d1d1065a9f2f09873c3579068fa14bebbfb62d88a5b0c05a2a99a434eb72e6a144885c1edb044a6ee0c4242724a042c59169cce897"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-tqdm-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
