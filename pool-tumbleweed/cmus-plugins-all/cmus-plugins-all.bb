SUMMARY = "Installs all cmus plugins"
DESCRIPTION = "This package pulls in all the plugins for the C* Music Player."
LICENSE = "GPL-2.0-only"

PV = "2.12.0"

RPM_NAME = "cmus-plugins-all-2.12.0-3.6.noarch.rpm"
RPM_HASH = "adf6dba0662eccc5e984cb353a206703929fe22d8f1fb3a716ae12faea948b8d315fddeae3bc7a19b03308c876c6d71d13eb09d3649a4501654af58ce78378ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cmus-plugins-all"

RDEPENDS:${PN} += "cmus \
cmus-plugin-cdio \
cmus-plugin-cue \
cmus-plugin-ffmpeg \
cmus-plugin-flac \
cmus-plugin-jack \
cmus-plugin-libao \
cmus-plugin-mikmod \
cmus-plugin-modplug \
cmus-plugin-mpc \
cmus-plugin-opus \
cmus-plugin-pulse \
cmus-plugin-sndio \
cmus-plugin-vorbis \
cmus-plugin-wavpack"

inherit rpm
