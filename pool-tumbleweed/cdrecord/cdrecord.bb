SUMMARY = "A CD/DVD/BD recording program"
DESCRIPTION = "cdrecord is a program to record (slang: 'burn') data or audio Compact Discs \
on an Orange Book CD recorder, to write DVD media on a DVD recorder or to \
write BluRay media on a BluRay recorder."
LICENSE = "CDDL-1.0"

PV = "3.02~a10"

RPM_NAME = "cdrecord-3.02~a10-53.5.aarch64.rpm"
RPM_HASH = "873fdefa5e441a5898a497be7d7f79d2662428377dea8694f9143ed24eb07dacad557fe831ce69ee024749ddef43769d06b6c719992c79000fcd6ba23b27dc79"

RPROVIDES:${PN} += "cdrecord \
config-cdrecord"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libcdrdeflt.so.1.0 \
libdeflt.so.1.0 \
libedc-ecc.so.1.0 \
librscg.so.1.0 \
libscg.so.1.0 \
libscgcmd.so.1.0 \
libschily.so.2.0 \
permissions"

inherit rpm
