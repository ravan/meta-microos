SUMMARY = "A ls for video DVDs"
DESCRIPTION = "A tool to display the directory of a video DVDs"
LICENSE = "GPL-2.0-only"

PV = "0.21"

RPM_NAME = "lsdvd-0.21-1.3.aarch64.rpm"
RPM_HASH = "4cd2e3dabac2f6a96e867a26517aa55bf0493688c7b4b321c01da10d55414a21d96c4e22641c1fd833d6620598329c1496294714c3b80d42c0e6cee35a9afc7b"

RPROVIDES:${PN} += "lsdvd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdvdread.so.8 \
libxml2.so.16"

inherit rpm
