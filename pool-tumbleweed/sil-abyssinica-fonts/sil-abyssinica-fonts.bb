SUMMARY = "Ethiopic script font designed in a calligraphic style"
DESCRIPTION = "Abyssinica SIL is an Ethiopic font (often called Ge’ez) \
based on calligraphic traditions. The Ethiopic script is \
currently used for writing at least 50 of the languages of \
Ethiopia and Eritrea of sub-Saharan Africa. The traditional \
Ge’ez language, and script, continues to be used \
liturgically in the northern part of the Horn of Africa."
LICENSE = "OFL-1.1"

PV = "2.300"

RPM_NAME = "sil-abyssinica-fonts-2.300-1.3.noarch.rpm"
RPM_HASH = "17f74091c0968a07b68f6f2229dc738f8e7d46ed3c29da9ebe252178cd25bd220b0aaf688987618904e27bce22e6fcf007e9176cfc0f45de8918857c96f6cc15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-so \
sil-abyssinica \
sil-abyssinica-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
