SUMMARY = "Intuitive, easy CLIs based on python type hints"
DESCRIPTION = "Cyclopts is a modern, easy-to-use command-line-interface library for \
Python, based on type hints, with rich help output and intuitive \
argument/sub-command resolution."
LICENSE = "Apache-2.0"

PV = "4.25.2"

RPM_NAME = "python313-cyclopts-4.25.2-1.1.noarch.rpm"
RPM_HASH = "f85efe916a029e45c393adaa5e7b36c881002dc11494e15c66038e7eb8aafa37ce556ed8028dfc4cbf190e14a14a9a965629a884ce1e303af152177c98d50c00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cyclopts \
python3.13dist-cyclopts \
python313-cyclopts \
python3dist-cyclopts"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-attrs \
python313-docstring-parser \
python313-rich \
python313-rich-rst"

inherit rpm
