SUMMARY = "Intuitive, easy CLIs based on python type hints"
DESCRIPTION = "Cyclopts is a modern, easy-to-use command-line-interface library for \
Python, based on type hints, with rich help output and intuitive \
argument/sub-command resolution."
LICENSE = "Apache-2.0"

PV = "4.25.2"

RPM_NAME = "python314-cyclopts-4.25.2-1.1.noarch.rpm"
RPM_HASH = "c80c4946c0d7a4ecba5e4dc3fd7c842eed9f6c9215542a8273ac358af8877bd82fd2d4f8f5397978c3be8b7f41faa08c2c0539c802bed084b3e231738170a4d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-cyclopts \
python314-cyclopts \
python3dist-cyclopts"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-attrs \
python314-docstring-parser \
python314-rich \
python314-rich-rst"

inherit rpm
