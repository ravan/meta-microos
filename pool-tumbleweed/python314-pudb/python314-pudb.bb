SUMMARY = "A full-screen, console-based Python debugger"
DESCRIPTION = "PuDB is a full-screen, console-based visual debugger for Python. \
Control is by keyboard. The UI is reminiscient of the DOS versions \
of Turbo Pascal."
LICENSE = "MIT"

PV = "2025.1.5"

RPM_NAME = "python314-pudb-2025.1.5-1.4.noarch.rpm"
RPM_HASH = "68d28a609d16947834de5d5e761162b747a4726f659b8a6f06cc9d188abdeb2e371403b3cd528c3b3f738b5f373e9bcc603a7af9e2078ed9186c9452da87812a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pudb \
python314-pudb \
python3dist-pudb"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-Pygments \
python314-jedi \
python314-packaging \
python314-typing-extensions \
python314-urwid \
python314-urwid-readline \
update-alternatives"

inherit rpm
