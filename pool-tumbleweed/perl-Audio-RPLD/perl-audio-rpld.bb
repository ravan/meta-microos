SUMMARY = "Module to control the RoarAudio PlayList Daemon (rpld)"
DESCRIPTION = "Audio::RPLD is a Perl module to access the RoarAudio PlayList Daemon from \
within any Perl application. \
It supports most commands supported by the rpld. \
This included commands to control playback, the Main Queue, playlists \
and pointer mangement."
LICENSE = "GPL-3.0"

PV = "0.007_0.1beta6"

RPM_NAME = "perl-Audio-RPLD-0.007_0.1beta6-1.39.noarch.rpm"
RPM_HASH = "8666141b3d82f84b89914b5060ff49ddf2b77515c705552ba5a3df541322124ee389df65b4afddebabd92f83c1a404e67ca773c8b70384f0abae781440e02d74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Audio--RPLD \
perl-Audio-RPLD"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
