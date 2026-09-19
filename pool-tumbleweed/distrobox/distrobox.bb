SUMMARY = "Use any linux distribution inside your terminal"
DESCRIPTION = "Use any Linux distribution inside your terminal. \
Distrobox uses podman or docker to create containers using the Linux distribution of your choice. \
The created container will be tightly integrated with the host, \
allowing sharing of the HOME directory of the user, external storage, \
external USB devices and graphical apps (X11/Wayland), and audio."
LICENSE = "GPL-3.0-only"

PV = "1.8.2.5"

RPM_NAME = "distrobox-1.8.2.5-3.2.noarch.rpm"
RPM_HASH = "e58befbf9e85389b0d6b56c32898c5ecb4533086cce9a232edbc4fbaf1b6035afff47c78d47650a0bd58c7596ff3b401eea2acf381b24101034192de4bc467d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "distrobox"

RDEPENDS:${PN} += "/usr/bin/basename \
/usr/bin/find \
/usr/bin/grep \
/usr/bin/sed \
/usr/bin/sh \
distrobox-branding"

inherit rpm
