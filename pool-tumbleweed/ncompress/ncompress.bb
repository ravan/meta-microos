SUMMARY = "LZW compression and decompression utilities"
DESCRIPTION = "The ncompress package contains the 'compress' and 'uncompress' \
utilities which are compatible with the original UNIX compress \
utility (.Z file extensions). \
 \
Install ncompress if you need compression/decompression utilities \
which are compatible with the original UNIX compress utility. gzip is \
also able to decompress .Z files, though ncompress will not recognize \
.gz files at all."
LICENSE = "SUSE-Public-Domain"

PV = "5.0"

RPM_NAME = "ncompress-5.0-3.5.aarch64.rpm"
RPM_HASH = "96b3b87d3f291779515968ba7593788059500b1441b0f583723bf324cfbc717e82313a258182dfeca8ac4e39e84597058cde00eef3acec10dae8f5730525f4a5"

RPROVIDES:${PN} += "ncompress"

RDEPENDS:${PN} += "gzip \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
