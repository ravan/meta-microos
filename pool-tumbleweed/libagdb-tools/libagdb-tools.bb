SUMMARY = "Utilities for reading SuperFetch databases"
DESCRIPTION = "This subpackage contains the utility programs from libagdb to \
read SuperFetch databases."
LICENSE = "LGPL-3.0-or-later"

PV = "20210429"

RPM_NAME = "libagdb-tools-20210429-3.39.aarch64.rpm"
RPM_HASH = "b3762aabc20dc52a922696b066f262acac030e1df566b6d1576141644fc37da2ba6b1bff5814b979eaf292bfde9c913a5b4c65a20c0660fd7963679a06d5ab34"

RPROVIDES:${PN} += "libagdb-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libagdb.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfdatetime.so.1"

inherit rpm
