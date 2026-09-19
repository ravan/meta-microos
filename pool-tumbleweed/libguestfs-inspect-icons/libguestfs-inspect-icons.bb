SUMMARY = "Additional dependencies for inspecting guest icons"
DESCRIPTION = "libguestfs-inspect-icons is a metapackage that pulls in additional \
dependencies required by libguestfs to pull icons out of non-Linux \
guests.  Install this package if you want libguestfs to be able to \
inspect non-Linux guests and display icons from them. \
 \
The only reason this is a separate package is to avoid core libguestfs \
having to depend on Perl."
LICENSE = "GPL-2.0-or-later"

PV = "1.60.1"

RPM_NAME = "libguestfs-inspect-icons-1.60.1-1.1.noarch.rpm"
RPM_HASH = "e1079960efdb292de51ffb21eff20c4d42403818778e608d63a38d08e3dc09d79aa16cd2a3774456c76b052db69ba494b8da0c5bb20788e0cb8ef1c37bf83812"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libguestfs-inspect-icons"

RDEPENDS:${PN} += "icoutils \
libguestfs"

inherit rpm
