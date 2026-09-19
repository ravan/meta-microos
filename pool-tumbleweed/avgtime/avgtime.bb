SUMMARY = "Utility similar to 'time', but with repetitions and more statistics"
DESCRIPTION = "avgtime works like the 'time' command, except it accepts an '-r' \
argument to specify repetitions and shows more detailed statistics. \
 \
If repetitions are specified, then statistics are computed and shown, like \
median, mean, and standard deviation."
LICENSE = "BSL-1.0"

PV = "v0.5.0+4.ffdf200"

RPM_NAME = "avgtime-v0.5.0+4.ffdf200-4.13.aarch64.rpm"
RPM_HASH = "a650651f27d8b8fac1ca6b669b626bcc270aa0c939c70fe0968c5a6f29993631f29e7be07bf8ad120c8e7c0b48101b5b34c41a79bf8deb00f83d692f991b5273"

RPROVIDES:${PN} += "avgtime"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
