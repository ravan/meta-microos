SUMMARY = "Retrieve man pages from man.o.o to view them"
DESCRIPTION = "This package contains 'man-online', a utility that attempts to retrieve \
the man page from manpages.opensuse.org if the 'man' utility is not \
installed."
LICENSE = "GPL-2.0-or-later"

PV = "4.0+git29"

RPM_NAME = "man-online-4.0+git29-1.1.aarch64.rpm"
RPM_HASH = "116987d347952ee4133249d9425f5559d6dd6c43b0704b94f8b8bbde8e0a9d20069db5e2fb84a64c988d27182068d8b8ccb60a5c562303fbb84fcecaf01b9a8d"

RPROVIDES:${PN} += "man-online"

RDEPENDS:${PN} += "/usr/bin/bash \
mandoc-bin"

inherit rpm
