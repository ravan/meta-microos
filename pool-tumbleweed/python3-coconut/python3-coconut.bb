SUMMARY = "A functional programming language that compiles to Python"
DESCRIPTION = "Coconut is a functional programming language that compiles to \
Python. Since all valid Python is valid Coconut, using Coconut will \
only extend and enhance what is already capable of in Python. \
 \
Coconut enhances the repertoire of Python programmers to include \
tools for functional programming. Coconut code runs the same on any \
Python version."
LICENSE = "MIT"

PV = "3.2.0"

RPM_NAME = "python3-coconut-3.2.0-1.2.noarch.rpm"
RPM_HASH = "d418534b0b7ddfbebc3cce48627df47d681da95de99be360e67d82d8cee185ad080d90ee4ce3c1010c7a3f4d7e1aa42118d544f2c4165ddcef6cd78a6cfdd514"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-coconut \
python3.13dist-coconut \
python3dist-coconut"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-Pygments \
python3-anyio \
python3-async-generator \
python3-cPyparsing \
python3-prompt-toolkit \
python3-psutil \
python3-setuptools \
python3-typing-extensions"

inherit rpm
