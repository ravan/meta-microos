SUMMARY = "Code Metrics in Python"
DESCRIPTION = "Radon is a Python tool that computes various metrics from the source code. \
Radon can compute: \
 \
* McCabe's complexity**, i.e. cyclomatic complexity \
* raw metrics (these include SLOC, comment lines, blank lines, &c.) \
* Halstead metrics (all of them) \
* Maintainability Index (the one used in Visual Studio)"
LICENSE = "MIT"

PV = "6.0.1"

RPM_NAME = "python314-radon-6.0.1-2.4.noarch.rpm"
RPM_HASH = "3b297dea7295766c454bd69467d1f5a03fffe508d184db4005cc5b5552d57ab4e7569f6c7af3f3e50e27015a2a5faeb4d761af830fc31c4aa89f87a50028fcb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-radon \
python314-radon \
python3dist-radon"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-colorama \
python314-mando \
update-alternatives"

inherit rpm
