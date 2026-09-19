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

RPM_NAME = "libsonivox4-4.0.1-1.3.aarch64.rpm"
RPM_HASH = "66140f964946778bdb2e89f46c40072e5614104f80ace470758ae6509a48c268a2ef08e395d610f3616ad1738f5e83aba76c559b00ade1652435cbb86b2e2cde"

RPROVIDES:${PN} += "libsonivox.so.4 \
libsonivox4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
