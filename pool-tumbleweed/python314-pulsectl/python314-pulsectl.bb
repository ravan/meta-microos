SUMMARY = "Python high-level interface and ctypes-based bindings for PulseAudio (libpulse)"
DESCRIPTION = "Python (3.x and 2.x) high-level interface and ctypes-based bindings for \
PulseAudio (libpulse), mostly focused on mixer-like controls and \
introspection-related operations (as opposed to e.g. submitting sound samples to \
play, player-like client)."
LICENSE = "MIT"

PV = "24.12.0"

RPM_NAME = "python314-pulsectl-24.12.0-2.6.noarch.rpm"
RPM_HASH = "25323df55be52fa92ab8c5466d17d07d86ea4106a89fd451372d6a7ed712039af01a659c42c573f10b3f892b491ca3f58b5b06ac579594e8cdef9ed30b93a565"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pulsectl \
python314-pulsectl \
python3dist-pulsectl"

RDEPENDS:${PN} += "pulseaudio-daemon \
python-abi \
python314-setuptools"

inherit rpm
