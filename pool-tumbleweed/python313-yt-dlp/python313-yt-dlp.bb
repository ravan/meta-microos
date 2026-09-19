SUMMARY = "yt-dlp Python library"
DESCRIPTION = "The direct Python interface into yt-dlp."
LICENSE = "CC-BY-SA-3.0 & SUSE-Public-Domain"

PV = "2026.08.19"

RPM_NAME = "python313-yt-dlp-2026.08.19-1.1.noarch.rpm"
RPM_HASH = "bbc8751af18426e7e09ce492807b2dd85e8156c663883b1b2b712a45e538f91988e1c6cd92a9003b185eddb4541bcae606a037d1997fab04e0522e6943c7f11b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-yt-dlp \
python3.13dist-yt-dlp \
python3.13dist-yt-dlp-ejs \
python313-yt-dlp \
python3dist-yt-dlp \
python3dist-yt-dlp-ejs"

RDEPENDS:${PN} += "ffmpeg \
python-abi"

inherit rpm
