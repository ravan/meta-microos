SUMMARY = "Bash Completion for gnuradio"
DESCRIPTION = "Bash command line completion support for gnuradio."
LICENSE = "GPL-3.0-or-later"

PV = "3.10.12.0"

RPM_NAME = "gnuradio-bash-completion-3.10.12.0-4.1.noarch.rpm"
RPM_HASH = "34143949c574e31092e8861f13dd54cece539c1947df284bebdafcfbdca170b136bb7fa8e49bc52ec0bcb6d19aa7c26f1ea57c69ffa772921b6ae2fbb08e08a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnuradio-bash-completion"

RDEPENDS:${PN} += "bash-completion \
gnuradio"

inherit rpm
