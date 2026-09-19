SUMMARY = "An reimplementation of 'Commander Keen in Goodbye Galaxy!'"
DESCRIPTION = "Omnispeak is an open-source reimplementation of Commander Keen \
episodes 4, 5, and 6. It aims to be a pixel-perfect, bug-for-bug \
clone of the original games, and is compatible with savegames \
from the DOS version. \
 \
Omnispeak also includes several new features, including: \
 * Improved graphics scaling and compatibility support. \
 * Dramatically improved joystick/gamepad support. \
 * QuickLoad and QuickSave support (F5 and F9 by default) \
 * Support for real AdLib / OPL2 compatible sound cards \
 * Support for the OPL2LPT \
 \
NOTE: \
To play the Commander Keen games with omnispeak you need the \
original game files! \
 \
Run \
 * omnispeak-keen4 \
 * omnispeak-keen5 \
 * omnispeak-keen6 \
from the directory where the original game files are located."
LICENSE = "GPL-2.0-only"

PV = "1.1+git20240123.b9e215b"

RPM_NAME = "omnispeak-1.1+git20240123.b9e215b-3.5.aarch64.rpm"
RPM_HASH = "c9d727eb64d7c773b23b964d65f9eced831d151ef65cbea5b6201205f6193c1c08d6a763623f096eac068b829704c6c61ef3ce82111f447af472072463cb305a"

RPROVIDES:${PN} += "omnispeak"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libasound.so.2 \
libc.so.6 \
libieee1284.so.3 \
libm.so.6"

inherit rpm
