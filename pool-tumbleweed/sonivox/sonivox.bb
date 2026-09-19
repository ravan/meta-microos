SUMMARY = "Fork of the AOSP 'platform_external_sonivox' project"
DESCRIPTION = "Sonivox is a fork of the Android Open Source Project 'platform_external_sonivox' \
including a CMake based build system to be used not on Android, but on any other \
Operating System. \
 \
This is a Wave Table synthesizer, not using external soundfont files but \
embedded samples instead. It is also a real time GM synthesizer. \
It may be indicated in projects for small embedded devices. There is neither \
MIDI input nor Audio output facilities included in the library. You need to \
provide your own input/output."
LICENSE = "Apache-2.0"

PV = "4.0.1"

RPM_NAME = "sonivox-4.0.1-1.3.aarch64.rpm"
RPM_HASH = "4804500bebf5c3931f04c936fa0b78d0409a3f3a530907ea9941508474640f5647928f6323be644de7e93836e474e081cd8fe87a5693d6dba1feafd661e8b09d"

RPROVIDES:${PN} += "sonivox"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsonivox.so.4"

inherit rpm
