SUMMARY = "Basic building blocks for Python applications"
DESCRIPTION = "This module provides some basic components that can be used to simplify \
building Python applications. \
 \
The components included by this package encapsulate the functionality to \
handle the following tasks: \
 \
 - UNIX process management (forking, signal handling, pid file creation) \
 - A very simple to use interface to handle .ini configuration files. \
 - An extensible system logger for console and/or syslog. \
 - Miscellaneous utilities and helpers. \
 - Memory troubleshooting and execution timing. \
 - Communicate inside the application using a notification system. \
 - Manage the version number for applications, modules and packages."
LICENSE = "LGPL-2.1-or-later"

PV = "3.0.3"

RPM_NAME = "python313-application-3.0.3-3.5.noarch.rpm"
RPM_HASH = "4d58b607a3c09bf2e9429a8fdfe51385155a5e57a8d26de7b82bd1db2931d9864ce34171b4a9ffc2329f98bd70314fd8bf03d7d727a9f93829d2c8811ddcd17e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-application \
python3.13dist-python3-application \
python313-application \
python3dist-python3-application"

RDEPENDS:${PN} += "python-abi \
python313-zope.interface"

inherit rpm
