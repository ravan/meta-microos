SUMMARY = "A code coverage report generator using GNU gcov"
DESCRIPTION = "Gcovr provides a utility for managing the use of the GNU gcov utility \
and generating summarized code coverage results. \
 \
This command is inspired by the Python coverage.py package, which provides \
a similar utility in Python. The gcovr command produces either compact \
human-readable summary reports, machine readable XML reports \
(in Cobertura format) or simple HTML reports. Thus, gcovr can be viewed \
as a command-line alternative to the lcov utility, which runs gcov and \
generates an HTML-formatted report."
LICENSE = "BSD-3-Clause"

PV = "6.0"

RPM_NAME = "gcovr-6.0-1.11.noarch.rpm"
RPM_HASH = "26f358617665fd2a4136eb68d5dc56ae66ca456b152188af7544427ca63b9088a6a97abba27187e439d72e371986df453534f4678764f9a39ee671eba7d0736b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gcovr \
python3.13dist-gcovr \
python3dist-gcovr"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
gcc \
python-abi \
python3-Jinja2 \
python3-lxml"

inherit rpm
