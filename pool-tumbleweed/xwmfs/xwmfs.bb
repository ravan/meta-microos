SUMMARY = "A file system for accessing X server and window manager features"
DESCRIPTION = "This is xwmfs (X window manager file system), a userspace file system based on \
fuse that allows interaction with an EWMH compliant X11 window manager via \
files. \
 \
Some of its features are: \
 \
- newly appearing and disappearing windows in the X server are recognized and \
  the file system is updated in an event based manner \
- new values for properties of window manager and windows will be reflected in \
  the file system in an event based manner \
- properties of windows and window manager can be changed via writing to files \
  in the file system \
- some X operations are accessible via control files in the file system \
- the file system can be used for easily implementing scripts that operate on \
  the window manager and windows (for example identifying specific windows, \
  rename a window, move it around and so on)."
LICENSE = "GPL-2.0-or-later"

PV = "1.11"

RPM_NAME = "xwmfs-1.11-1.3.aarch64.rpm"
RPM_HASH = "325d0c121e98836bdd67cd9d7a4c110fc4620324edd2451ac75633917da3642a05653e0392be465c631804f1543d7a1c507766034a524fcf826ce062841cb9b6"

RPROVIDES:${PN} += "xwmfs"

RDEPENDS:${PN} += "fuse3 \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libfuse3.so.4 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
