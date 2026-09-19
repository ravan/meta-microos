SUMMARY = "The Nice and Friendly Decoder"
DESCRIPTION = "The UUDeview package contains a very smart decoder and an encoder for \
Base64 (MIME), uuencoded, xxencoded, Binhex, and yEnc files. Its \
ultimate goal is to fully replace the 'standard', but dumb uudecode and \
uuencode utilities."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.20"

RPM_NAME = "uudeview-0.5.20-263.6.aarch64.rpm"
RPM_HASH = "c7ce8a4bf670de259f4e0afaa43e91214717a8d17d7798a089cc85f95678ff3a206c1083c45aee18b80acf19c57b36489efe6b00ed9d376ab2f9723234701b75"

RPROVIDES:${PN} += "uudeview"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtcl8.6.so \
libtk8.6.so"

inherit rpm
