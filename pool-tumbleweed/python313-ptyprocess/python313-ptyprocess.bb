SUMMARY = "Run a subprocess in a pseudo terminal"
DESCRIPTION = "Launch a subprocess in a pseudo terminal (pty), and interact with both the \
process and its pty. \
 \
Sometimes, piping stdin and stdout is not enough. There might be a password \
prompt that doesn't read from stdin, output that changes when it's going to a \
pipe rather than a terminal, or curses-style interfaces that rely on a terminal. \
If you need to automate these things, running the process in a pseudo terminal \
(pty) is the answer."
LICENSE = "ISC"

PV = "0.7.0"

RPM_NAME = "python313-ptyprocess-0.7.0-6.1.noarch.rpm"
RPM_HASH = "9040a018527e4b78953ffecbad5a17082d6d8ea1ea7389e7bb936896ba7a4bac8a68b5bcab059d31a9738bc8da20264986f50b789a6a620a536e22035b52d9f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ptyprocess \
python3.13dist-ptyprocess \
python313-ptyprocess \
python3dist-ptyprocess"

RDEPENDS:${PN} += "python-abi"

inherit rpm
