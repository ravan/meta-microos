SUMMARY = "Perl access to fsync() and sync() function calls"
DESCRIPTION = "The fsync() function takes a Perl file handle as its only argument, and \
passes its fileno() to the C function fsync(). It returns _undef_ on \
failure, or _true_ on success. \
 \
The fsync_fd() function is used internally by fsync(); it takes a file \
descriptor as its only argument. \
 \
The sync() function is identical to the C function sync(). \
 \
This module does *not* export any methods by default, but fsync() is made \
available as a method of the _FileHandle_ and _IO::Handle_ classes."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.11"

RPM_NAME = "perl-File-Sync-0.11-10.56.aarch64.rpm"
RPM_HASH = "4174e60bc86bdd6517181f98e6b6c04d5ca053bae1d434fb2ec712ff835be4b17640c5876ea442d9d974e74754d4fe390520badf72043c273b6ad7d62c4c301a"

RPROVIDES:${PN} += "perl-File--Sync \
perl-File-Sync"

RDEPENDS:${PN} += "libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
