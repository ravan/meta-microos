SUMMARY = "tar implementation compliant to POSIX.1-2001"
DESCRIPTION = "Star is a tar-like archiver (tar standing for Tape ARchiver). \
 \
Features: \
* FIFO to keep the tape streaming \
* Remote tape support \
* Accurate sparse files \
* Pattern matcher to archive and extract a subset of files \
* User tailorable interface for comparing tar archives against file trees \
* Path names up to 1024 bytes may be archived \
* Stores and restores all 3 file times (even creation time). With POSIX.1-2001, \
  the times are in nanosecond granularity."
LICENSE = "CDDL-1.0"

PV = "1.6.1"

RPM_NAME = "star-1.6.1-53.5.aarch64.rpm"
RPM_HASH = "6a89ba98b4a6341c59c79aa2c6c8b8834bfba1c89b6f0a2448930433d3f261b4548ba92c6c1a8d44951fe691bd807ee6c5bc324329358cfcce0a5680ddb1617a"

RPROVIDES:${PN} += "config-star \
star"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6 \
libdeflt.so.1.0 \
libfind.so.4.0 \
librmt.so.1.0 \
libschily.so.2.0 \
libselinux.so.1"

inherit rpm
