SUMMARY = "Desktop application for pgAdmin4"
DESCRIPTION = "pgAdmin 4 is a rewrite of the pgAdmin3 management tool for the \
PostgreSQL database. \
 \
This package provides a small python script that can be used \
to start pgAdmin4 as a regular user and provides a simple ui \
as a system tray icon to open more windows or quit. \
 \
Note that his script is not related to the official pgAdmin4 \
runtime application and is NOT supported by the pgAdmin project \
but only provided for convenience."
LICENSE = "PostgreSQL"

PV = "9.17"

RPM_NAME = "pgadmin4-desktop-9.17-1.1.noarch.rpm"
RPM_HASH = "c212b22380ed6ebd910566d330b58b775b9cbb120a8e536a3591ef25ed4c14f7ea8a8339d187e81e04d5806133d7fb746f98b6843b1d52d02ff8c03a47099d76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pgadmin4-desktop"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
pgadmin4 \
python313-qt5"

inherit rpm
