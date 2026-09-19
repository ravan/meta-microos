SUMMARY = "Work with a range of dates"
DESCRIPTION = "Quite often, when dealing with dates, we don't just want to know \
information about one particular date, but about a range of dates. For \
example, we may wish to know whether a given date is in a particular range, \
or what the overlap is between one range and another. This module lets you \
ask such questions."
LICENSE = "GPL-2.0-or-later"

PV = "1.41"

RPM_NAME = "perl-Date-Range-1.41-1.25.noarch.rpm"
RPM_HASH = "159cea196416c1ab0158bac8dce7a6f52828eb65a153c0d36eba5c9c8439ed8be6c6206e4cbd18165a663140a014170ccd207e58a3a59e4209ae84deb63e1a70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Date--Range \
perl-Date-Range"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Date--Simple"

inherit rpm
