SUMMARY = "Directory Statistics"
DESCRIPTION = " \
QDirStat is a graphical application to show where your disk space has \
gone and to help you to clean it up. \
 \
It shows the total size of directories and of their files both in a \
traditional tree view and in a colored [treemap \
graphics](doc/Treemap.md) where a large file is shown as a large \
rectangle, and small files are shown as small rectangles. Click on it, \
and you will see where in the tree the file is, and you can instantly \
move it to the trash if you like. The color corresponds to the file \
type: Images, videos or whatever. \
 \
This is a Qt-only port of the old Qt3/KDE3-based KDirStat, now based \
on the latest Qt 5. It does not need any KDE libs or \
infrastructure. It runs on every X11-based desktop on Linux, BSD and \
other Unix-like systems, and in a Docker container. \
 \
QDirStat has a number of new features compared to KDirStat. \
To name a few: \
 \
- Multi-selection in both the tree and the treemap. \
 \
- Unlimited number of user-defined cleanup actions. \
 \
- Properly show errors of cleanup actions \
  (and their output, if desired). \
 \
- Configurable file categories (MIME types), treemap colors, \
  exclude rules, tree columns. \
 \
- Package manager support: \
 \
  - Show what software package a system file belongs to. \
 \
  - Packages view showing disk usage of installed software \
    packages and their individual files. \
 \
  - Unpackaged files view showing what files in system directories \
    do not belong to any installed software package. \
 \
- New views: \
 \
  - Disk usage per file type (by filename extension). \
 \
  - File size histogram view. \
 \
  - File age view. \
 \
  - Free, used and reserved disk size for each mounted filesystem \
    (like df) \
 \
 \
For more details and screenshots, see \
 \
    https://github.com/shundhammer/qdirstat \
 \
and the local documentation in \
 \
    /usr/share/doc/packages/qdirstat/README.md"
LICENSE = "GPL-2.0-only"

PV = "2.0"

RPM_NAME = "qdirstat-2.0-1.5.aarch64.rpm"
RPM_HASH = "51c679bbc2279c4d05946f76a567e775042e8f6c9b37c81465d257d7051df2b81e3233e37b72be0be5d00665dcabab9782bc31fd5d8cb10c365593cd0139e10c"

RPROVIDES:${PN} += "qdirstat"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
