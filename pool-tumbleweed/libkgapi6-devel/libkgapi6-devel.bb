SUMMARY = "Build environment for libkgapi6"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop KDE PIM applications."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libkgapi6-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "5b6b1dad433ef33cc3a4bfb9d937652e61a9d0ee64bd8c457d9ae9ea7e36e009fe3244d31f7b14d836ef5dec6a9dcae6242cb3c79a4e5e56cbdb7b2f73502756"

RPROVIDES:${PN} += "cmake-KPim6GAPI \
libkgapi6-devel"

RDEPENDS:${PN} += "cmake-KF6CalendarCore \
cmake-KF6Contacts \
libKPim6GAPIBlogger6 \
libKPim6GAPICalendar6 \
libKPim6GAPICore6 \
libKPim6GAPIDrive6 \
libKPim6GAPILatitude6 \
libKPim6GAPIMaps6 \
libKPim6GAPIPeople6 \
libKPim6GAPITasks6"

inherit rpm
