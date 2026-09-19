SUMMARY = "Metapackage to pull in all of python-gobject's packages"
DESCRIPTION = "This package contains files required to build wrappers for gobject \
addon libraries such as pygtk."
LICENSE = "LGPL-2.1-or-later"

PV = "3.56.3"

RPM_NAME = "python313-gobject-devel-3.56.3-1.3.aarch64.rpm"
RPM_HASH = "54b7097bb89b38bbe1d743a9428abb531a91f6e05cab56b475b4540c0fc5c31b8b5abfd276effa3da42625b3c5c54e20fd4c18b99177ba7697394cca513a7b1b"

RPROVIDES:${PN} += "python3-gobject-devel \
python313-gobject-devel"

RDEPENDS:${PN} += "python313-devel \
python313-gobject \
python313-gobject-Gdk \
python313-gobject-cairo \
python313-gobject-common-devel"

inherit rpm
