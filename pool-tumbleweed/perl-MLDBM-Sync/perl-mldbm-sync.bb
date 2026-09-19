SUMMARY = "Perl module for safe concurrent access to MLDBM databases"
DESCRIPTION = "This module wraps around the MLDBM interface, by handling concurrent \
access to MLDBM databases with file locking, and flushes i/o explicity \
per lock/unlock. The new [Read]Lock()/UnLock() API can be used to \
serialize requests logically and improve performance for bundled reads \
& writes."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.30"

RPM_NAME = "perl-MLDBM-Sync-0.30-408.59.aarch64.rpm"
RPM_HASH = "e75c0b02d5ee31a02bf706920760f0b504392ee4d74d51e53d248e4bdb20039cf00142362f79b77a1820e2c101b632bc71c41d0d25a31d64201e514eb1cb8cdd"

RPROVIDES:${PN} += "perl-MLDBM--Sync \
perl-MLDBM--Sync--SDBM-File \
perl-MLDBM-Sync"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-MLDBM \
perl-Tie-Cache"

inherit rpm
