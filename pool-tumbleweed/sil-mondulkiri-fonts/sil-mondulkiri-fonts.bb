SUMMARY = "The Mondulkiri Font Family"
DESCRIPTION = "The Mondulkiri fonts provide Unicode support for the Khmer script. \
 \
The Mondulkiri fonts contain all Khmer and all basic Latin characters. \
They also contain a limited number of characters used in some languages in \
Vietnam and many phonetic characters."
LICENSE = "OFL-1.1"

PV = "7.100"

RPM_NAME = "sil-mondulkiri-fonts-7.100-1.19.noarch.rpm"
RPM_HASH = "f26817bc22da0dfb9afe7dd94cd90c3d0f181fcc93e57c76bd074c128bd5b6f3f28a37e8f8d53bff319bd99d4aff09913dc9ab8e79360d9ae43b7767527d00e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sil-mondulkiri-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
