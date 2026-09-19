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

RPM_NAME = "python314-application-3.0.3-3.5.noarch.rpm"
RPM_HASH = "e045b48957c2d8723a58404c1ab4a1f74269d6d31e5a8fa9222cb4d98bb5db3ea2ce9c0cb49caa9d8763ddde0333aad0d8be73008252e552f445782b3e57043a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python3-application \
python314-application \
python3dist-python3-application"

RDEPENDS:${PN} += "python-abi \
python314-zope.interface"

inherit rpm
