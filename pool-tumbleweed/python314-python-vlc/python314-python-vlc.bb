SUMMARY = "VLC bindings for python"
DESCRIPTION = "VLC bindings for python. \
 \
This module provides ctypes-based bindings for the native libvlc API \
(see http://wiki.videolan.org/LibVLC) of the VLC video player."
LICENSE = "LGPL-2.0-or-later"

PV = "3.0.21203"

RPM_NAME = "python314-python-vlc-3.0.21203-1.9.noarch.rpm"
RPM_HASH = "5d92b6b4a46f353d167402a382e339831db8db95118004f121434cad462ceddc5d47d87018f65a19dbc161a448a3d3f1c189d0ad60c543a793941397666b129d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-vlc \
python314-python-vlc \
python3dist-python-vlc"

RDEPENDS:${PN} += "libvlc5 \
python-abi"

inherit rpm
