SUMMARY = "Enhanced fork of youtube-dl, a video site downloader for offline watching"
DESCRIPTION = "yt-dlp is a command-line program to retrieve videos from \
YouTube.com and other video sites for later watching."
LICENSE = "CC-BY-SA-3.0 & SUSE-Public-Domain"

PV = "2026.08.19"

RPM_NAME = "yt-dlp-2026.08.19-1.1.noarch.rpm"
RPM_HASH = "59c10ce7db8a7d1f0fcd463a03309c094119a385bf8bb613879c1a46080536820ed0bd5797dbb63aeec0cd9a6dab951f31fc01d0747f2a04b9ec94d6764bee36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yt-dlp \
yt-dlp-bash-completion \
yt-dlp-fish-completion \
yt-dlp-zsh-completion"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python313-yt-dlp"

inherit rpm
