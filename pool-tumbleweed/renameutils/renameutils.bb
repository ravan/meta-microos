SUMMARY = "Programs to make file renaming easier"
DESCRIPTION = "The file renaming utilities (renameutils for short) are a set of programs \
designed to make renaming of files faster and less cumbersome. \
 \
This package consists of five programs - qmv, imv, icp, qcp and deurlname: \
 \
qmv ('quick move') allows file names to be edited in a text editor. The \
names of all files in a directory are written to a text file, which is \
then edited by the user. The text file is read and parsed, and the changes \
are applied to the files. \
 \
imv ('interactive move'), is trivial but useful when you are too lazy to \
type (or even complete) the name of the file to rename twice. It allows a \
file name to be edited in the terminal using the GNU Readline library. \
 \
icp and qcp are similar to imv and qmv but for copying using 'cp'. \
 \
deurlname removes URL encoded characters (such as %20 representing space) \
from file names. Some programs such as w3m tend to keep those characters \
encoded in saved files."
LICENSE = "GPL-3.0-or-later"

PV = "0.12.0"

RPM_NAME = "renameutils-0.12.0-2.5.aarch64.rpm"
RPM_HASH = "444e968ce8baba307cae403e96176e9b53d49681cc86ae0f86a48742e46a22313539cb6a353c3d363f28699b37a2797746779580a4b8fbffa9d215b7db52fe7a"

RPROVIDES:${PN} += "renameutils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libreadline.so.8"

inherit rpm
