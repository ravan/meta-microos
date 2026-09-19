SUMMARY = "Fast audio loudness (ReplayGain / R128) scanner & tagger"
DESCRIPTION = "Fast audio loudness (ReplayGain / R128) scanner & tagger."
LICENSE = "LGPL-2.0-only"

PV = "1.0.7"

RPM_NAME = "r128gain-1.0.7-2.11.noarch.rpm"
RPM_HASH = "96ffe259d9dd1c0cadb1a27ae4e8227ba8b675b7f76b678219099560193eaefd04c482f78446645cefdc0980306d3daed7ec881c283b07f104a74eb54741bc79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-r128gain \
python3dist-r128gain \
r128gain"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-crcmod \
python3-ffmpeg-python \
python3-mutagen \
python3-tqdm"

inherit rpm
