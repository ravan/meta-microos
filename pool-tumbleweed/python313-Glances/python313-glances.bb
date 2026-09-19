SUMMARY = "A cross-platform curses-based monitoring tool"
DESCRIPTION = "Glances is a cross-platform monitoring tool which presents a \
large amount of monitoring information through a curses or Web \
based interface. The information dynamically adapts depending on the \
size of the user interface."
LICENSE = "LGPL-3.0-only"

PV = "4.5.6"

RPM_NAME = "python313-Glances-4.5.6-1.1.noarch.rpm"
RPM_HASH = "57efbbabe6d68661c9ff72955a50f2a5a80d0ddbf9063ea697ab089b2b2d73222f86040c42bd85f0a4d236d55af86451f50fa88a435effd3475beaa08270c6bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glances \
python3-Glances \
python3-glances \
python3.13dist-glances \
python313-Glances \
python313-glances \
python3dist-glances"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-defusedxml \
python313-fastapi \
python313-jinja2 \
python313-packaging \
python313-psutil \
python313-shtab \
python313-uvicorn \
update-alternatives"

inherit rpm
