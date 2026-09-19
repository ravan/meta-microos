SUMMARY = "VLC bindings for python"
DESCRIPTION = "VLC bindings for python. \
 \
This module provides ctypes-based bindings for the native libvlc API \
(see http://wiki.videolan.org/LibVLC) of the VLC video player."
LICENSE = "LGPL-2.0-or-later"

PV = "3.0.21203"

RPM_NAME = "python313-python-vlc-3.0.21203-1.9.noarch.rpm"
RPM_HASH = "573adb0fe456e1108a0ad0e8dac7f82856a0d97c4e0715b6b2f13444e96e505cc82cff11186ba5d4e67fc3cd3fd5b117f7c2605aedc14aeb047ba7bdba507dda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-vlc \
python3.13dist-python-vlc \
python313-python-vlc \
python3dist-python-vlc"

RDEPENDS:${PN} += "libvlc5 \
python-abi"

inherit rpm
