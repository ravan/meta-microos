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

RPM_NAME = "python314-ptyprocess-0.7.0-6.1.noarch.rpm"
RPM_HASH = "e54d0d62a13f79ff3971370c790194a1df3152c217c79597f5dc6f1cd092bfb9c1fbf1c07ee7f5668579866ea55632f1a510fe02a4141a05b218933762ec9de1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ptyprocess \
python314-ptyprocess \
python3dist-ptyprocess"

RDEPENDS:${PN} += "python-abi"

inherit rpm
