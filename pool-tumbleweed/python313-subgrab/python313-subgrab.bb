SUMMARY = "Script to download subtitles for media files"
DESCRIPTION = "A script that allows to download subtitles for TV-Series, Anime and Movies from \
subscene and other sites."
LICENSE = "GPL-3.0-only"

PV = "1.0.4"

RPM_NAME = "python313-subgrab-1.0.4-2.5.noarch.rpm"
RPM_HASH = "0995553664e8cf193e944319118f01ac218a60b609c5c885b8166ed13785d1f4bc3b3e91743b47d7dcaa0aa4d9c707b000d77ac0a623839177ed359fd68782ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-subgrab \
python3.13dist-subgrab \
python313-subgrab \
python3dist-subgrab"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-beautifulsoup4 \
python313-lxml \
python313-requests"

inherit rpm
