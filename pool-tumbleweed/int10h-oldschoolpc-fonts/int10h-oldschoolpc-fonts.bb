SUMMARY = "Remakes of old computer hardware fonts"
DESCRIPTION = "This fontpack contains remakes of various type styles from text-mode \
era PCs — in modern Unicode-compatible TrueType form (plus straight \
bitmap versions). The main focus is on hardware character sets: the \
kind that's located in a ROM and shown by default when working in \
text (or graphics) mode. \
 \
[ Classic hardware text mode stretches the fonts to fit the screen! \
To recreate the same visuals of that, a stretch factor must be \
applied. For details, see ratio.txt inside the package. ]"
LICENSE = "CC-BY-SA-4.0"

PV = "2.2"

RPM_NAME = "int10h-oldschoolpc-fonts-2.2-1.16.noarch.rpm"
RPM_HASH = "c65c062c35434c0e30cb58d611224bfabd04d7b53d21b94672e373e1a99196d68985db34f6d8ed0132a2df4c0709ef26e52b93282230bf392d17af7e3414fe8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-int10h-oldschoolpc-fonts \
int10h-oldschoolpc-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
