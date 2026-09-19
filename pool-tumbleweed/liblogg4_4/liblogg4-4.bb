SUMMARY = "Ogg Vorbis support library for Allegro"
DESCRIPTION = "This library allows to use Ogg Vorbis sound files from Allegro."
LICENSE = "SUSE-Permissive"

PV = "4.4.3.1"

RPM_NAME = "liblogg4_4-4.4.3.1-1.29.aarch64.rpm"
RPM_HASH = "8634ff0d0a56332e965f2b2f7aa3ef58cda07c364ac053e5698a885526feb0b7e89f75c9b1e19f4bb955741de990d365412de72b967b49a7f3c7df94df19af22"

RPROVIDES:${PN} += "liblogg.so.4.4 \
liblogg4-4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
liballeg.so.4.4 \
libc.so.6 \
libvorbisfile.so.3"

inherit rpm
