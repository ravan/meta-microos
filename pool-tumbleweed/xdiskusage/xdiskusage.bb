SUMMARY = "Graphically displays the amount of disk space used by each subdirectory"
DESCRIPTION = "xdiskusage is a user-friendly program to show you what is using \
up all your disk space. It is based on the design of xdu \
written by Phillip C. Dykstra. Changes have been made so it runs \
'du' for you, and can display the free space left on the disk, \
and produce a PostScript version of the display."
LICENSE = "GPL-2.0-only"

PV = "1.60"

RPM_NAME = "xdiskusage-1.60-1.18.aarch64.rpm"
RPM_HASH = "f01fcf4a845dadf82a7559f907815679d7edb06051309fc8b6b3247242076b290b4e7377402d844c66eeb5bc2f9d19746c1baae7d345e1cf6ebf5c2f40483554"

RPROVIDES:${PN} += "xdiskusage"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfltk.so.1.3 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
