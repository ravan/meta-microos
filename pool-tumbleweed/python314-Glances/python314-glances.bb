SUMMARY = "A cross-platform curses-based monitoring tool"
DESCRIPTION = "Glances is a cross-platform monitoring tool which presents a \
large amount of monitoring information through a curses or Web \
based interface. The information dynamically adapts depending on the \
size of the user interface."
LICENSE = "LGPL-3.0-only"

PV = "4.5.6"

RPM_NAME = "python314-Glances-4.5.6-1.1.noarch.rpm"
RPM_HASH = "8bc11b906b87a855aefeb028244a6b19a237a08cce88df5abd1c8dbb3e169b12d6b7d5903b563fdc51821cafffd5544afb6ea18e363580bc98ef368d97b8f66e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glances \
python3.14dist-glances \
python314-Glances \
python314-glances \
python3dist-glances"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-defusedxml \
python314-fastapi \
python314-jinja2 \
python314-packaging \
python314-psutil \
python314-shtab \
python314-uvicorn \
update-alternatives"

inherit rpm
