SUMMARY = "Simple backups based on borg"
DESCRIPTION = "Doing backups the easy way. Plugin your USB drive and let the Pika do the rest for you."
LICENSE = "GPL-3.0-or-later"

PV = "0.8.4"

RPM_NAME = "pika-backup-0.8.4-1.2.aarch64.rpm"
RPM_HASH = "5dacad3b5f87a1f19f9d6637b9b2d39ab6853d97ba24d24e33d8dcbc44d23de05eae917204a10dae1aacd7fda0dea80c7d6850fd730abf246397cf93514fee2e"

RPROVIDES:${PN} += "config-pika-backup \
pika-backup"

RDEPENDS:${PN} += "borgbackup \
libadwaita-1.so.0 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libm.so.6 \
libpango-1.0.so.0 \
libssl.so.3 \
python3-msgpack \
python3-pyfuse3"

inherit rpm
