SUMMARY = "FAT Filesystem Sorting Utility"
DESCRIPTION = "FATsort sorts directory structures of FAT filesystems. Many MP3 hardware \
players don't sort files automatically but play them in the order they were \
transmitted to the device. FATSort can help here."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.679"

RPM_NAME = "fatsort-1.7.679-1.4.aarch64.rpm"
RPM_HASH = "f19cb781ef33e567b67effa5a77b81e5fe520fe8a43636af1b950c483624d703ca972223ee1401b62ff4b6deeae7e26bcefb4d5fefb9a39fe79ec83e0c3c8082"

RPROVIDES:${PN} += "fatsort"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
