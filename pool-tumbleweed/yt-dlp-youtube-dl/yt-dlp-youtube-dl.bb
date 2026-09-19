SUMMARY = "Compat symlinks for youtube-dl"
DESCRIPTION = "This package installs 'youtube-dl' as a symlink to yt-dlp."
LICENSE = "CC-BY-SA-3.0 & SUSE-Public-Domain"

PV = "2026.08.19"

RPM_NAME = "yt-dlp-youtube-dl-2026.08.19-1.1.noarch.rpm"
RPM_HASH = "39e2bd5403886fc67622218a79298708375543c4a503f0728cb93123cd0ad2a0bfd3b2fddffc7fd160f24bbf1ff40f0988b2749f0bd3bdf7e4b024e3cd479fa2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "youtube-dl \
yt-dlp-youtube-dl"

RDEPENDS:${PN} += "yt-dlp"

inherit rpm
