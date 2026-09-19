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

RPM_NAME = "python313-cli-helpers-2.15.1-1.1.noarch.rpm"
RPM_HASH = "381322bcf7be6a270c17e3c82ce00709260f6dc7651dadbcf63fb5385cd5fb10ea5058542789fae1df2a90741f2f98534fb36c12a40f4317865c95006351860b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cli-helpers \
python3.13dist-cli-helpers \
python313-cli-helpers \
python3dist-cli-helpers"

RDEPENDS:${PN} += "python-abi \
python313-configobj \
python313-tabulate \
python313-wcwidth"

inherit rpm
