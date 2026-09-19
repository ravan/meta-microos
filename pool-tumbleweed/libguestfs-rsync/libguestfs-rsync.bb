SUMMARY = "Rsync support for libguestfs"
DESCRIPTION = "This adds rsync support to libguestfs.  Install it if you want to use \
rsync to upload or download files into disk images."
LICENSE = "GPL-2.0-or-later"

PV = "1.60.1"

RPM_NAME = "libguestfs-rsync-1.60.1-1.1.aarch64.rpm"
RPM_HASH = "f939dc665110af2a060c250670aaae7552f9d40b933f45c1547ce2d17296a59fd9fb9811456c05e0bd26d4a784217e5e22fa4cd5f0c1cd7c0730df622e23794b"

RPROVIDES:${PN} += "libguestfs-rsync"

RDEPENDS:${PN} += "libguestfs"

inherit rpm
