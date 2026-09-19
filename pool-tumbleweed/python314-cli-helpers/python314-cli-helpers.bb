SUMMARY = "Helpers for building command-line apps"
DESCRIPTION = "CLI Helpers is a Python package for performing common tasks when \
building command-line apps. It's a helper library for command-line interfaces. \
 \
Libraries like Click <http://click.pocoo.org/5/> and Python Prompt \
Toolkit <https://python-prompt-toolkit.readthedocs.io/en/latest/> are \
tools that help to create quality apps. CLI Helpers complements these \
libraries by wrapping up common tasks in interfaces. \
 \
CLI Helpers is not focused on applications' design patterns or \
frameworks -- it can be used it on its own or in combination with \
other libraries."
LICENSE = "BSD-3-Clause"

PV = "2.15.1"

RPM_NAME = "python314-cli-helpers-2.15.1-1.1.noarch.rpm"
RPM_HASH = "ee02f5fe6ea165f28c4eba10ab5049253306f6b01e92e0ccf5edd4d15eb853f1aba294d618ba215dec795957f8d627744ac3ce7ac89919ce94044ad1855bbbf5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-cli-helpers \
python314-cli-helpers \
python3dist-cli-helpers"

RDEPENDS:${PN} += "python-abi \
python314-configobj \
python314-tabulate \
python314-wcwidth"

inherit rpm
