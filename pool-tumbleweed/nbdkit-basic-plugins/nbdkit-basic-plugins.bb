SUMMARY = "Basic plugins for nbdkit"
DESCRIPTION = "This package contains plugins for nbdkit which depend on a handful of \
C libraries: glibc, gnutls, libzstd.  Other plugins for nbdkit with \
more complex dependencies are packaged separately. \
 \
nbdkit-data-plugin          Serves small amounts of data from the command line. \
 \
nbdkit-eval-plugin          Writes a shell script plugin on the command line. \
 \
nbdkit-file-plugin          The normal file plugin for serving files. \
 \
nbdkit-floppy-plugin        Creates a virtual floppy disk from a directory. \
 \
nbdkit-full-plugin          A virtual disk that returns ENOSPC errors. \
 \
nbdkit-info-plugin          Serves client and server information. \
 \
nbdkit-memory-plugin        A virtual memory plugin. \
 \
nbdkit-ondemand-plugin      Creates filesystems on demand. \
 \
nbdkit-ones-plugin          Fill disk with repeated 0xff or other bytes. \
 \
nbdkit-pattern-plugin       Fixed test pattern. \
 \
nbdkit-partitioning-plugin  Creates virtual disks from partitions. \
 \
nbdkit-random-plugin        Random content plugin for testing. \
 \
nbdkit-sh-plugin            Writes plugins as shell scripts or executables. \
 \
nbdkit-sparse-random-plugin Makes sparse random disks. \
 \
nbdkit-split-plugin         Concatenates one or more files. \
 \
nbdkit-zero-plugin          Zero-length plugin for testing."
LICENSE = "BSD-3-Clause"

PV = "1.48.0"

RPM_NAME = "nbdkit-basic-plugins-1.48.0-1.1.aarch64.rpm"
RPM_HASH = "6827978eac69135f5732c9c4d018c266d49ef0f20e71ef4a970f8f049f9ce1ea9b40a741831237e515f451544a274e218111d7e011ba1992362f7d441ac9f90b"

RPROVIDES:${PN} += "nbdkit-basic-plugins \
nbdkit-data-plugin \
nbdkit-eval-plugin \
nbdkit-file-plugin \
nbdkit-floppy-plugin \
nbdkit-full-plugin \
nbdkit-info-plugin \
nbdkit-memory-plugin \
nbdkit-ondemand-plugin \
nbdkit-ones-plugin \
nbdkit-partitioning-plugin \
nbdkit-pattern-plugin \
nbdkit-random-plugin \
nbdkit-sh-plugin \
nbdkit-sparse-random-plugin \
nbdkit-split-plugin \
nbdkit-zero-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgnutls.so.30 \
libzstd.so.1 \
nbdkit-server"

inherit rpm
