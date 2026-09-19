SUMMARY = "Utilities for reading Windows Minidump files"
DESCRIPTION = "This subpackage contains the utility programs from libmdmp to \
read Windows Minidump files."
LICENSE = "LGPL-3.0-or-later"

PV = "20210420"

RPM_NAME = "libmdmp-tools-20210420-3.29.aarch64.rpm"
RPM_HASH = "2defaff44f76800423f8d0d60277da40fd359feda75afd54eada98fc61288a3326a7d74dfabda4f266d4e4b6a08bceedfda50455f90abab71cd45191287fae0a"

RPROVIDES:${PN} += "libmdmp-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libmdmp.so.1"

inherit rpm
