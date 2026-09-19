SUMMARY = "Python high-level interface and ctypes-based bindings for PulseAudio (libpulse)"
DESCRIPTION = "Python (3.x and 2.x) high-level interface and ctypes-based bindings for \
PulseAudio (libpulse), mostly focused on mixer-like controls and \
introspection-related operations (as opposed to e.g. submitting sound samples to \
play, player-like client)."
LICENSE = "MIT"

PV = "24.12.0"

RPM_NAME = "python313-pulsectl-24.12.0-2.6.noarch.rpm"
RPM_HASH = "671b38c7aa37eea7239219a20a361eb821995b6a2e626568319d58b0a191317f1a987ac52841b04baab4766583560e7c004870fbb860f395f9aa1ff5e0471a7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pulsectl \
python3.13dist-pulsectl \
python313-pulsectl \
python3dist-pulsectl"

RDEPENDS:${PN} += "pulseaudio-daemon \
python-abi \
python313-setuptools"

inherit rpm
