SUMMARY = "MPRIS V2.1 support for mpd"
DESCRIPTION = "mpDris2 provide MPRIS 2 support to mpd (Music Player Daemon). mpDris2 is \
run in the user session and monitors a local or distant mpd server."
LICENSE = "GPL-3.0-only"

PV = "0.9.1"

RPM_NAME = "mpDris2-0.9.1-3.12.noarch.rpm"
RPM_HASH = "701ac2600fc1af48cc6e8deb0ba01bc8798f2ab1bf6a30254fe3b450f470b615f86547821b3149a35ac9d2d4d5bc9f9ac44c05d38d438c9fc46a9cb8df534171"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpDris2"

RDEPENDS:${PN} += "/usr/bin/python3 \
perl--MODULE-COMPAT-5.44.0 \
python3-python-mpd2 \
typelib-GLib \
typelib-Notify"

inherit rpm
