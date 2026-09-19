SUMMARY = "Fancy Interface to the Python Interpreter"
DESCRIPTION = "Bpython is an enhanced Python interactive interpreter that uses curses \
and provides the following main features: in-line syntax highlighting; \
readline-like autocompletion with suggestions displayed as you type; expected \
argument specification for functions; a handy pastebin function to quickly \
submit your code and return a URL. Its goal is to bring together a few handy \
ideas to enhance the standard interpreter without getting carried away."
LICENSE = "MIT"

PV = "0.26"

RPM_NAME = "python314-bpython-0.26-4.2.noarch.rpm"
RPM_HASH = "fd738997a4f1baf3135363820e2e70825ba7b7b0dd81411bc2850e9b57376018ddeb9843ba3470c51d66e08f9d97397b56ee3b909507cac368eba41696e73190"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-bpython \
python314-bpython \
python3dist-bpython"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-bpython-common \
python314-curtsies \
python314-greenlet \
python314-pygments \
python314-pyxdg \
python314-requests"

inherit rpm
