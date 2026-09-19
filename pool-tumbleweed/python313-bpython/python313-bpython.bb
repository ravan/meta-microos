SUMMARY = "Fancy Interface to the Python Interpreter"
DESCRIPTION = "Bpython is an enhanced Python interactive interpreter that uses curses \
and provides the following main features: in-line syntax highlighting; \
readline-like autocompletion with suggestions displayed as you type; expected \
argument specification for functions; a handy pastebin function to quickly \
submit your code and return a URL. Its goal is to bring together a few handy \
ideas to enhance the standard interpreter without getting carried away."
LICENSE = "MIT"

PV = "0.26"

RPM_NAME = "python313-bpython-0.26-4.2.noarch.rpm"
RPM_HASH = "eaad6edcb519eaa240d2d42f901523018856a19b9eceaf0cc95a036715ea09f2ec4c67b8ea70c3d4f23b1c676b115a5ceb0c813ca7df0e0763e91630fcec413d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bpython \
python3.13dist-bpython \
python313-bpython \
python3dist-bpython"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-bpython-common \
python313-curtsies \
python313-greenlet \
python313-pygments \
python313-pyxdg \
python313-requests"

inherit rpm
