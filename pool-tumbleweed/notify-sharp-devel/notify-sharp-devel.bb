SUMMARY = "A C# client implementation for Desktop Notifications"
DESCRIPTION = "notify-sharp is a C# client implementation for Desktop Notifications, \
i.e. notification-daemon. It is inspired by the libnotify API. \
 \
Desktop Notifications provide a standard way of doing passive pop-up \
notifications on the Linux desktop. These are designed to notify the \
user of something without interrupting their work with a dialog box \
that they must close. Passive popups can automatically disappear after \
a short period of time."
LICENSE = "MIT"

PV = "0.4.0.r3032"

RPM_NAME = "notify-sharp-devel-0.4.0.r3032-12.4.noarch.rpm"
RPM_HASH = "5da33aafb3450546795f8704906c4052acead34de453e976ceb8b56fb622197fb306d0a9c514c12ca82c36bc24be02386813d8e6f592e53a245d8f2103b77a9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "notify-sharp-devel \
pkgconfig-notify-sharp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
notify-sharp \
pkgconfig-gtk-sharp-2.0"

inherit rpm
