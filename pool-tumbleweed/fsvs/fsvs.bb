SUMMARY = "Backup/Restore/Versioning of large Data Sets with Meta-Data"
DESCRIPTION = "FSVS is the abbreviation for “Fast System VerSioning”, and is pronounced \
[fisvis]. \
 \
It is a complete backup/restore/versioning tool for all files in a directory \
tree or whole filesystems, with a subversionTM repository as the backend. \
 \
You may think of it as some kind of tar or rsync with versioned storage."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.13"

RPM_NAME = "fsvs-1.2.13-2.5.aarch64.rpm"
RPM_HASH = "2e5dae75bcdd67fcde803f897f3662fec228e8722691f8b6f140164a134e00e3b8084d92637987cfafda81c27ab1fc1fdd38a3c0c490f964f659f4f6b101f02c"

RPROVIDES:${PN} += "fsvs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libapr-1.so.0 \
libaprutil-1.so.0 \
libc.so.6 \
libgdbm.so.6 \
libpcre2-8.so.0 \
libsvn-delta-1.so.0 \
libsvn-ra-1.so.0 \
libsvn-subr-1.so.0"

inherit rpm
