SUMMARY = "Digitize Audio Records"
DESCRIPTION = "Gramofile is a program to digitize audio records. Through the \
application of several filters, it is possible to accomplish a \
significant reduction of disturbances like ticks and scratches. Data is \
saved in WAV format, making it easy to record on CD with programs like \
cdrecord or xcdroast."
LICENSE = "GPL-2.0-or-later"

PV = "1.6"

RPM_NAME = "gramofile-1.6-399.10.aarch64.rpm"
RPM_HASH = "9b16b6b12e95a2efafd3edc82282f85ed77691d2b242f6e4a891d6a78dd3f5fc8424f6866d66928732e34435ed4952729c90d6c30ccd3c240a40b64aa4bdf888"

RPROVIDES:${PN} += "gramofil \
gramofile"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
