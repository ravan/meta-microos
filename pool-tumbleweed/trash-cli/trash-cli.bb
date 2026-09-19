SUMMARY = "Command line interface to the freedesktop.org trashcan"
DESCRIPTION = "trash-cli trashes files recording the original path, deletion date, and permissions. \
It uses the same trashcan used by KDE, GNOME, and XFCE, but you can invoke it from the command line (and scripts). \
The command line interface is compatible with rm and you can use trash-put as an alias to rm."
LICENSE = "GPL-2.0-or-later"

PV = "0.24.5.26"

RPM_NAME = "trash-cli-0.24.5.26-1.8.noarch.rpm"
RPM_HASH = "002fa5e0fd5c33fc79e2622d979032f209d3f14cfa3083505ceda40df2ea3bb4e45b07198125cddd3bc85d75ff9479d099afd43744834411a5bfe58c94abe968"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-trash-cli \
python3dist-trash-cli \
trash-cli"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-psutil"

inherit rpm
